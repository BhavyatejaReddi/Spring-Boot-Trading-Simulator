
package com.trading.Simulator.controller;

import com.trading.Simulator.model.Order;
import com.trading.Simulator.model.MatchedOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Controller
public class TradingController {

    private final List<Order> orders = new CopyOnWriteArrayList<>();
    private final List<MatchedOrder> matchedOrders = new CopyOnWriteArrayList<>();

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("orders", orders);
        model.addAttribute("matchedOrders", matchedOrders);
        return "index";
    }

    @PostMapping("/submit")
    public String submitOrder(@RequestParam("type") String type,
                              @RequestParam("user") String user,
                              @RequestParam("price") int price,
                              @RequestParam("quantity") int quantity) {

        Order.Type orderType = Order.Type.valueOf(type.toUpperCase());
        Order newOrder = new Order(orderType, user, price, quantity);

        // Try to match
        for (Order existingOrder : orders) {
            if (existingOrder.getType() != newOrder.getType() &&
                existingOrder.getQuantity() == newOrder.getQuantity()) {

                boolean match = (orderType == Order.Type.BUY && newOrder.getPrice() >= existingOrder.getPrice()) ||
                                (orderType == Order.Type.SELL && newOrder.getPrice() <= existingOrder.getPrice());

                if (match) {
                    String buyer = (orderType == Order.Type.BUY) ? user : existingOrder.getUser();
                    String seller = (orderType == Order.Type.SELL) ? user : existingOrder.getUser();
                    matchedOrders.add(new MatchedOrder(buyer, seller, existingOrder.getPrice(), quantity));
                    orders.remove(existingOrder);
                    return "redirect:/";
                }
            }
        }

        orders.add(newOrder);
        return "redirect:/";
    }
}


