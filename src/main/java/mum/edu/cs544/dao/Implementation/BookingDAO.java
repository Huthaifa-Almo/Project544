package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.IBookingDAO;
import mum.edu.cs544.domain.Booking;
import org.springframework.stereotype.Repository;

@Repository
public class BookingDAO extends GenericDAO<Booking> implements IBookingDAO {

    public BookingDAO() {
        super.setDaoClass(Booking.class );
    }

}
