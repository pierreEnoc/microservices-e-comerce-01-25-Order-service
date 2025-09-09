package com.pierre.microservices.order.repository;

import com.pierre.microservices.order.mdel.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository  extends JpaRepository<Order, Long> {

}
