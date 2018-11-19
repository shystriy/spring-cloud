package ru.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.home.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
