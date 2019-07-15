package DAO.Implementation;

import DAO.IBookingDAO;
import Domain.Booking;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDAO extends GenericDAO<Booking> implements IBookingDAO {

    public BookingDAO() {
        super.setDaoClass(Booking.class );
    }

}
