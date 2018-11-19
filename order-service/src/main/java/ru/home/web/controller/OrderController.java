package ru.home.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.home.model.Order;
import ru.home.service.OrderService;

import java.util.List;

import static ru.home.web.controller.OrderController.REST_URL;

/**
 * Created on 10.11.2018.
 *
 * @Author Sergey P.
 */

@RestController
@RequestMapping(value = REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    public final static String REST_URL = "/order";

    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Order get(@PathVariable Long id) {
        return orderService.get(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

}
