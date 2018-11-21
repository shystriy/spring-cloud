package ru.home.service;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.model.Order;
import ru.home.repository.OrderRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public Order get(Long orderId) {
        return orderRepository.findOne(orderId);
    }

    public List<Order> getByUserId(Long userId) {
        return orderRepository.getByUserId(userId);
    }

    @Transactional
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
