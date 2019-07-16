package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.IReservationManagmentDAO;
import mum.edu.cs544.domain.ReservationManagment;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationManagmentDAO extends GenericDAO<ReservationManagment> implements IReservationManagmentDAO {
    public ReservationManagmentDAO() {
        super.setDaoClass(ReservationManagment.class );
    }
}
