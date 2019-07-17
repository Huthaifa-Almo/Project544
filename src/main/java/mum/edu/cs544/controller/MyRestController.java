package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Table;
import mum.edu.cs544.service.ITableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {


    @Autowired
    private ITableService tableService;

    @GetMapping("/tables")
    public List<Table> getAll() {
        return tableService.findAll();
    }

    @GetMapping("/tables/{id}")
    public Table get(@PathVariable long id) {
        Table b = tableService.findOne(id);
        return b;
    }

    @PostMapping("/tables")
    public RedirectView add(@RequestBody Table table) {
        tableService.addtable(table);
        return new RedirectView("/books/" + table.getTableId());
    }

    @PutMapping("/tables/{id}")
    public void update(@RequestBody Table table) {
        tableService.updateFood(table);
    }

    @DeleteMapping("/tables/{id}")
    public void delete(@PathVariable long id) {
        tableService.delettable(id);
    }
}
