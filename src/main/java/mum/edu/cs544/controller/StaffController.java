package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Food;
import mum.edu.cs544.domain.Staff;
import mum.edu.cs544.service.IFoodService;
import mum.edu.cs544.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private IStaffService iStaffService;

    @GetMapping(value = "/addStaff")
    public String add(@ModelAttribute("staff") Staff staff) {
        return "addStaff";
    }

    @PostMapping(value = "/addStaff")
    public String addStaff(Staff staff) {
        iStaffService.saveStaff(staff);
        return "redirect:/staff/staffs";
    }

    @GetMapping(value = "/staffs")
    public String getAll(Model model) {
        model.addAttribute("staffs", iStaffService.findAll());
        return "staffList";
    }

    @GetMapping(value = "/staffs/{staffId}")
    public String get(@PathVariable Long staffId, Model model) {
        model.addAttribute("staff", iStaffService.findOne(staffId));
        return "staffDetails";
    }

    @PostMapping(value = "/staffs/{staffId}")
    public String update(Staff staff) {
        iStaffService.updateStaff(staff);
        return "redirect:/staff/staffs";
    }

    @PostMapping(value = "/staffs/delete")
    public String delete(@RequestParam Long staffId) {
        iStaffService.deleteStaff(staffId);
        return "redirect:/staff/staffs";
    }

}
