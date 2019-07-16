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

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private IBookingService bookingService;
    @Autowired
    private ITableService tableService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

    @GetMapping("/bookings")
    public String getAllBookings(Model model) {
        List<Booking> bookingList = bookingService.findAll();
        model.addAttribute("bookings", bookingList);
        return "bookingsList";
    }

    @GetMapping("/bookings/{bookingId}")
    public String get(@PathVariable Long bookingId, Model model) {
        Booking booking = bookingService.findOne(bookingId);
        model.addAttribute("book", booking);
        model.addAttribute("msg", "Update");
        return "bookDetails";
    }

    @GetMapping("/addBooking")
    public String createBooking(@ModelAttribute("booking") Booking booking, Model model) {
        model.addAttribute("msg", "Add");
        //start - to be deleted when tables service available
        Table table = new Table();
        Table table2 = new Table();
        table.setTableId(1l);
        table2.setTableId(2l);
        List<Table> tables = new ArrayList<>();
        tables.add(table);
        tables.add(table2);
        model.addAttribute("tables", tables);
        //end - to be deleted when tables service available
        return "bookDetails";
    }

    @PostMapping("/bookings/addBooking")
    public String add(Booking booking) {
        bookingService.saveBooking(booking);
        return "redirect:/booking/bookings";
    }

    @PostMapping("/bookings/{id}")
    public String update(Booking booking, @PathVariable int id) {
        bookingService.updateBooking(booking);
        return "redirect:/bookings";
    }
}
