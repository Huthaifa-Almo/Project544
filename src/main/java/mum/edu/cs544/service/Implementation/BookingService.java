package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.Implementation.BookingDAO;
import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookingService implements IBookingService {

    @Autowired
    private BookingDAO bookingDAO;

    @Override
    public void saveBooking(Booking booking) {
        bookingDAO.save(booking);

    }

    @Override
    public Booking updateBooking(Booking booking) {
        Booking updatedBooking = bookingDAO.update(booking);
        return updatedBooking;
    }

    @Override
    public void deletBooking(Long bookingId) {
        bookingDAO.delete(bookingId);
    }

    @Override
    public List<Booking> findAll() {
        return (List<Booking>) bookingDAO.findAll();
    }

    @Override
    public Booking findOne(Long id) {
        return bookingDAO.findOne(id);
    }

    @Override
    public double getTotalCost(Long bookingId) {
        return 0;
    }
}
