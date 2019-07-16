package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Staff;
import mum.edu.cs544.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private IStaffService iStaffService;


    @GetMapping("/list")
    public String getAllStaff(Model model) {
        List<Staff> staffList = iStaffService.findAll();
        model.addAttribute("staffList", staffList);
        return "staff";
    }

    @GetMapping("/addStaff")
    public String addStaffPage(@ModelAttribute("staff") Staff staff) {
        return "addStaff";
    }

    @PostMapping("/addStaff")
    public String addStaff(@ModelAttribute("staff") Staff staff) {
        /*if (staff.getStaffType() == "0")
            staff.setStaffType("Waiter");
        else
            staff.setStaffType("Chef");
        iStaffService.saveStaff(staff);*/
        return "redirect:/staff";
    }

}
