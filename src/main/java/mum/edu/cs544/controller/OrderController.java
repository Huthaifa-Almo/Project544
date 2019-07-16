package mum.edu.cs544.controller;

import mum.edu.cs544.domain.Food;
import mum.edu.cs544.domain.Order;
import mum.edu.cs544.service.IFoodService;
import mum.edu.cs544.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService iOrderService;
    @Autowired
    private IFoodService iFoodService;

    @GetMapping(value = "/addOrder")
    public String add(@ModelAttribute("order") Order order, Model model) {
        model.addAttribute("foods", iFoodService.findAll());
        return "addOrder";
    }



    @PostMapping(value = "/addOrder")
    public String addOrder(Order order, Model model, BindingResult result) {
        iOrderService.setOrder(order);
        //return "redirect:/order/orders";
      //  model.addAttribute("order", order);
        return "redirect:/order/orders";
    }

    @GetMapping(value = "/orders")
    public String getAll(Model model) {
        model.addAttribute("orders", iOrderService.fiddAll());
        return "orderList";
    }

    @GetMapping(value = "/orders/{orderId}")
    public String get(@PathVariable Long orderId, Model model) {
        model.addAttribute("order", iOrderService.findOne(orderId));
        return "orderDetails";
    }

    @PostMapping(value = "/orders/{orderId}")
    public String update(Order order) {
        iOrderService.modifyOrder(order);
        return "redirect:/order/orders";
    }

    @PostMapping(value = "/orders/delete")
    public String delete(@RequestParam Long orderId) {
        iOrderService.deleteOrder(orderId);
        return "redirect:/order/orders";
    }

}
