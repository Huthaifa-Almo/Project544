package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.domain.Table;
import mum.edu.cs544.service.IBookingService;
import mum.edu.cs544.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("tables", booking.getReservedTables());
        model.addAttribute("msg", "Update");
        return "bookDetails";
    }

    @GetMapping("/addBooking")
    public String createBooking(@ModelAttribute("booking") Booking booking, Model model) {
        model.addAttribute("msg", "Add");
        List<Table> tableList = tableService.findAllByAvailability();
        model.addAttribute("tables", tableList);
        //end - to be deleted when tables service available
        return "bookDetails";
    }

    @PostMapping("/bookings/addBooking")
    public String add(Booking booking) {
        if (!booking.getTablesIds().isEmpty()){
            List<Table> tableList = tableService.findAllById(booking.getTablesIds());
            booking.setReservedTables(tableList);
            tableList.stream().forEach(t -> t.setAvailable(false));
            tableService.updateTableStatue(tableList);
        }
        bookingService.saveBooking(booking);
        return "redirect:/booking/bookings";
    }

    @PostMapping("bookings/{bookingId}")
    public String update(Booking booking, @PathVariable Long bookingId) {
        bookingService.updateBooking(booking);
        return "redirect:/booking/bookings";
    }
}
