package mum.edu.cs544.service;

import mum.edu.cs544.domain.Booking;
import mum.edu.cs544.domain.Staff;

import java.util.List;

public interface IStaffService {

    public void saveStaff(Staff staff);
    public Staff updateStaff(Staff staff);
    public void deleteStaff(Long staffId);
    public List<Staff> findAll();
    public Staff findOne(Long staffId);
}
