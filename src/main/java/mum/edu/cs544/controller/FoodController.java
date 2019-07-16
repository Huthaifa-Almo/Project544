package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Food;
import mum.edu.cs544.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/food")
public class FoodController {
    @Autowired
    private IFoodService iFoodService;

    @GetMapping(value = "/addFood")
    public String addCar(@ModelAttribute("food") Food food) {
        return "addFood";
    }

    @PostMapping(value = "/addFood")
    public String addFood(Food food) {
        iFoodService.addFood(food);
        return "redirect:/food/foods";
    }

    @GetMapping(value = "/foods")
    public String getAll(Model model) {
        model.addAttribute("foods", iFoodService.findAll());
        return "foodList";
    }

    @GetMapping(value = "/foods/{fooId}")
    public String get(@PathVariable Long id, Model model) {
        model.addAttribute("food", iFoodService.findOne(id));
        return "foodDetails";
    }

    @PostMapping(value = "/foods/{fooId}")
    public String update(Food food) {
        iFoodService.updateFood(food);
        return "redirect:food/foods";
    }

    @PostMapping(value = "/foods/delete")
    public String delete(Long foodId) {
        iFoodService.deletFood(foodId);
        return "redirect:food/foods";
    }

}
