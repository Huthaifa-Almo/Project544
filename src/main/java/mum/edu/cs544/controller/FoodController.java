package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Food;
import mum.edu.cs544.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private IFoodService iFoodService;

    @GetMapping(value = "/addFood")
    public String add(@ModelAttribute("food") Food food) {
        return "addFood";
    }

    @PostMapping(value = "/addFood")
    public String addFood(@Valid Food food, BindingResult result) {
        if (result.hasErrors()) {
            return "addFood";
        }
        iFoodService.addFood(food);
        return "redirect:/food/foods";
    }

    @GetMapping(value = "/foods")
    public String getAll(Model model) {
        model.addAttribute("foods", iFoodService.findAll());
        return "foodList";
    }

    @GetMapping(value = "/foods/{fooId}")
    public String get(@PathVariable Long fooId, Model model) {
        model.addAttribute("food", iFoodService.findOne(fooId));
        return "foodDetails";
    }

    @PostMapping(value = "/foods/{fooId}")
    public String update(@Valid Food food, BindingResult result) {
        if (result.hasErrors()) {
            return "foodDetails";
        }
        iFoodService.updateFood(food);
        return "redirect:/food/foods";
    }

    @PostMapping(value = "/foods/delete")
    public String delete(@RequestParam Long foodId) {
        iFoodService.deletFood(foodId);
        return "redirect:/food/foods";
    }

}
