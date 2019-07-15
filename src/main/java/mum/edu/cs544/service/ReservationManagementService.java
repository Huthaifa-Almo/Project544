package mum.edu.cs544.service;

import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.service.Implementation.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReservationManagementService {



    @Autowired
    private BookingService bookingService;


    public void addBooking(Booking booking){
        //saving booking with staff list who will serve
        bookingService.saveBooking(booking);
    }

    public Booking modifyBooking(Booking booking){
        Booking updateBooking = bookingService.updateBooking(booking);
        return updateBooking;
    }

    public void cancelBooking(long bookingId){
        bookingService.deletBooking(bookingId);
    }


}
