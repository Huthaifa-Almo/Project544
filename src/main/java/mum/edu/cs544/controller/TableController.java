package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Food;
import mum.edu.cs544.domain.Table;
import mum.edu.cs544.service.IFoodService;
import mum.edu.cs544.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/table")
public class TableController {
    @Autowired
    private ITableService iTableService;

    @GetMapping(value = "/addTable")
    public String addTable(@ModelAttribute("table") Table table) {
        return "addTable";
    }

    @PostMapping(value = "/addTable")
    public String add(Table table) {
        iTableService.addtable(table);
        return "redirect:/table/tables";
    }

    @GetMapping(value = "/tables")
    public String getAll(Model model) {
        model.addAttribute("tables", iTableService.findAll());
        return "tableList";
    }

    @GetMapping(value = "/tables/{tableId}")
    public String get(@PathVariable Long tableId, Model model) {
        model.addAttribute("table", iTableService.findOne(tableId));
        return "tableDetails";
    }

    @PostMapping(value = "/tables/{tableId}")
    public String update(Table table) {
        iTableService.updateFood(table);
        return "redirect:/table/tables";
    }

    @PostMapping(value = "/tables/delete")
    public String delete(@RequestParam Long tableId) {
        iTableService.delettable(tableId);
        return "redirect:/table/tables";
    }

}
