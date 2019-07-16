package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.IReservationManagmentDAO;
import mum.edu.cs544.dao.Implementation.ReservationManagmentDAO;
import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.service.IBookingService;
import mum.edu.cs544.service.IReservationManagementService;
import mum.edu.cs544.service.Implementation.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReservationManagementService implements IReservationManagementService {

    @Autowired
    private IReservationManagmentDAO reservationManagmentDAO;

    @Override
    public void setPaid(Long id) {
        reservationManagmentDAO.findOne(id).setPaid(true);
    }
}
