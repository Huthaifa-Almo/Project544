package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.domain.Table;
import mum.edu.cs544.service.IBookingService;
import mum.edu.cs544.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private IBookingService bookingService;
    @Autowired
    private ITableService tableService;

    /*@InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }*/

    @GetMapping("/bookings")
    public String getAllBookings(Model model) {
        List<Booking> bookingList = bookingService.findAll();
        model.addAttribute("bookings", bookingList);
        return "bookingsList";
    }

    @GetMapping("/bookings/{bookingId}")
    public String get(@PathVariable Long bookingId, Model model) {
        Booking booking = bookingService.findOne(bookingId);
        //List<Long> idsList = booking.getReservedTables().stream().map(t -> t.getTableId()).collect(Collectors.toList());
        //booking.setTablesIds(idsList);
        model.addAttribute("booking", booking);
        //merge assigned table and availabe tables aslo if we need to add/update assigned tables
        List<Table> tableList = tableService.findAllByAvailability();
        List<Table> alltables = new ArrayList<>();
        alltables.addAll(tableList);
        alltables.addAll(booking.getReservedTables());
        model.addAttribute("tables", alltables);
        //model.addAttribute("msg", "Update");
        return "bookDetails";
    }

    @GetMapping("/addBooking")
    public String createBooking(@ModelAttribute("booking") Booking booking, Model model) {
        //model.addAttribute("msg", "Add");
        List<Table> tableList = tableService.findAllByAvailability();
        model.addAttribute("tables", tableList);
        //end - to be deleted when tables service available
        //return "bookDetails";
        return "addBooking";
    }

    @PostMapping("/bookings/addBooking")
    public String add(@Valid @ModelAttribute("booking") Booking booking,
                      BindingResult result, Model model, RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            StringBuilder builder = new StringBuilder();
            for (FieldError e : result.getFieldErrors()) {
                builder.append(e.getField()+"--"+e.getDefaultMessage()).append(", ");
            }
            redirectAttributes.addFlashAttribute("msg", "yes" );
            redirectAttributes.addFlashAttribute("errors", builder );
            return "redirect:/booking/addBooking";
        }else {
            if (booking.getTablesIds() == null || booking.getTablesIds().isEmpty()){
                StringBuilder error = new StringBuilder();
                error.append("can't save without choosing tables");
                redirectAttributes.addFlashAttribute("msg", "yes" );
                redirectAttributes.addFlashAttribute("errors", error );
                return "redirect:/booking/addBooking";
            }
        }
        updateSelectedTables(booking);
        bookingService.saveBooking(booking);
        return "redirect:/booking/bookings";
    }

    @PostMapping("bookings/{bookingId}")
    public String update(@Valid Booking booking,
                         BindingResult result, Model model, @PathVariable Long bookingId) {
        if (result.hasErrors()) {
            //model.addAttribute("msg", "Update");
            return "bookDetails";
        }
        updateSelectedTables(booking);
        bookingService.updateBooking(booking);
        return "redirect:/booking/bookings";
    }

    private void updateSelectedTables(Booking booking) {
        if (booking.getTablesIds() != null && !booking.getTablesIds().isEmpty()) {
            List<Table> tableList = tableService.findAllById(booking.getTablesIds());
            booking.setReservedTables(tableList);
            tableList.stream().forEach(s -> s.setAvailable(false));
            tableService.updateTableStatue(tableList);
        }
    }

    @PostMapping(value = "bookings/delete")
    public String delete(@RequestParam Long bookingId) {
        bookingService.deletBooking(bookingId);
        return "redirect:/booking/bookings";
    }
}
