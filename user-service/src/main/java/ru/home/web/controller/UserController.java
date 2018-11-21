package ru.home.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.home.client.OrderFeignClient;
import ru.home.model.Order;
import ru.home.model.User;
import ru.home.service.UserService;

import java.util.List;

import static ru.home.web.controller.UserController.REST_URL;

/**
 * Created on 10.11.2018.
 *
 * @Author Sergey P.
 */

@RestController
@RequestMapping(value = REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    public final static String REST_URL = "/user";

    @Autowired
    private UserService userService;

    @Autowired
    private OrderFeignClient orderFeignClient;


    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping(value = "/{id}")
    public User get(@PathVariable Long id) {
        return userService.get(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping(value = "/order")
    public List<Order> getOrders() {
        return orderFeignClient.getOrders();
    }

    @GetMapping(value = "/{id}/order")
    public List<Order> getOrdersByUser(@PathVariable Long id) {
        return orderFeignClient.getOrdersByUserId(id);
    }

}
