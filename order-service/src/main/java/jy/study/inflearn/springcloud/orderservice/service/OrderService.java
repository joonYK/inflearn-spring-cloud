package jy.study.inflearn.springcloud.orderservice.service;

import jy.study.inflearn.springcloud.orderservice.dto.OrderDto;
import jy.study.inflearn.springcloud.orderservice.entity.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);

    OrderDto getOrderByOrderId(String orderId);

    Iterable<OrderEntity> getOrdersByUserId(String userId);

}
