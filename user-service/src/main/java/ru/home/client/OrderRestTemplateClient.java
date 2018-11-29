package ru.home.client;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.home.model.Order;
import ru.home.util.UserContext;

import java.util.List;

/**
 * Created on 29.11.2018.
 *
 * @Author Sergey P.
 */

@Component
public class OrderRestTemplateClient {
    @Autowired
    private RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(OrderRestTemplateClient.class);

    public List<Order> getOrdersByUserId(Long id){
        logger.debug("In Order Service.getOrder: {}", UserContext.getCorrelationId());

        ResponseEntity<Order[]> restExchange =
                restTemplate.exchange(
                        "http://zuulsrv:5555/api/orderservice/order/user/{id}",
                        HttpMethod.GET,
                        null, Order[].class, id);

        return Lists.newArrayList(restExchange.getBody());
    }

    public List<Order> getOrders(){
        logger.debug("In Order Service.getOrders: {}", UserContext.getCorrelationId());

        ResponseEntity<Order[]> restExchange =
                restTemplate.exchange(
                        "http://zuulsrv:5555/api/orderservice/order/",
                        HttpMethod.GET,
                        null, Order[].class);

        return Lists.newArrayList(restExchange.getBody());
    }
}
