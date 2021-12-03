package jy.study.inflearn.springcloud.orderservice.controller;

import jy.study.inflearn.springcloud.orderservice.dto.OrderDto;
import jy.study.inflearn.springcloud.orderservice.entity.OrderEntity;
import jy.study.inflearn.springcloud.orderservice.service.OrderService;
import jy.study.inflearn.springcloud.orderservice.vo.RequestOrder;
import jy.study.inflearn.springcloud.orderservice.vo.ResponseOrder;
import jy.study.inflearn.springcloud.orderservice.vo.SearchOrder;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    private final ModelMapper mapper;

    @PostMapping
    public ResponseEntity<ResponseOrder> createOrder(@RequestBody RequestOrder orderDetails) {
        OrderDto orderDto = mapper.map(orderDetails, OrderDto.class);

        OrderDto createdOrder = orderService.createOrder(orderDto);

        ResponseOrder responseOrder = mapper.map(createdOrder, ResponseOrder.class);

        return ResponseEntity.status(HttpStatus.CREATED).body(responseOrder);
    }

    @GetMapping
    public ResponseEntity<List<ResponseOrder>> getOrders(SearchOrder searchOrder) {
        Iterable<OrderEntity> orders = orderService.getOrdersByUserId(searchOrder.getUserId());

        List<ResponseOrder> result = new ArrayList<>();
        for (OrderEntity order : orders) {
            result.add(mapper.map(order, ResponseOrder.class));
        }

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
