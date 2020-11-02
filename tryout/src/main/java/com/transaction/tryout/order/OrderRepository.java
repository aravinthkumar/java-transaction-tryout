package com.transaction.tryout.order;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomer(String customer);

    Order findById(Integer id);

    // List<Order> findAll();

}