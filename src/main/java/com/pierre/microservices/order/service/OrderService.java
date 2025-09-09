package com.pierre.microservices.order.service;

import com.pierre.microservices.order.dto.OrderRequest;
import com.pierre.microservices.order.mdel.Order;
import com.pierre.microservices.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.rmi.server.UID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest) {
       Order order = new Order();
       order.setOrderNumber(new UID().toString());
       order.setPrice(orderRequest.price());
       order.setQuantity(orderRequest.quantity());
       order.setSkuCode(orderRequest.skuCode());
         orderRepository.save(order);
    }
}
