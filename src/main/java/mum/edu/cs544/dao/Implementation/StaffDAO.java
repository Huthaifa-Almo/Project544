package mum.edu.cs544.dao.Implementation;

import mum.edu.cs544.dao.IStaffDAO;
import mum.edu.cs544.domain.Staff;

public class StaffDAO extends GenericDAO<Staff> implements IStaffDAO  {

    public StaffDAO() {
        super.setDaoClass(Staff.class );
    }
}
