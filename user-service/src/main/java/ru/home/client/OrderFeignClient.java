package ru.home.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.home.model.Order;

import java.util.List;

/**
 * Created on 20.11.2018.
 *
 * @Author Sergey P.
 */

@FeignClient("orderservice")
public interface OrderFeignClient {
    @RequestMapping(
            method= RequestMethod.GET,
            value="/order/",
            consumes="application/json")
    List<Order> getOrders();

    @RequestMapping(
            method= RequestMethod.GET,
            value="/order/user/{id}/",
            consumes="application/json")
    List<Order> getOrdersByUserId(@PathVariable("id") Long id);
}
