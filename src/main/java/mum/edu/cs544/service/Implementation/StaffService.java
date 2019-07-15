package mum.edu.cs544.service.Implementation;

import mum.edu.cs544.dao.IStaffDAO;
import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.domain.Staff;
import mum.edu.cs544.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements IStaffService {

    @Autowired
    private IStaffDAO iStaffDAO;

    @Override
    public void saveStaff(Staff staff) {
        iStaffDAO.save(staff);
    }

    @Override
    public Staff updateStaff(Staff staff) {
        return iStaffDAO.update(staff);
    }

    @Override
    public void deleteStaff(Long staffId) {
        iStaffDAO.delete(staffId);
    }

    @Override
    public List<Staff> findAll() {
        return iStaffDAO.findAll();
    }

    @Override
    public Staff findOne(Long staffId) {
        return iStaffDAO.findOne(staffId);
    }
}
