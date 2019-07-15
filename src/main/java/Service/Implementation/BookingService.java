package Service.Implementation;

import DAO.Implementation.BookingDAO;
import Domain.Booking;
import Service.IBookingService;
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
    public void updateBooking(Booking booking) {
        bookingDAO.update(booking);
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
