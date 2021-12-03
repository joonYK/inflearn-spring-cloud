package jy.study.inflearn.springcloud.orderservice.repository;

import jy.study.inflearn.springcloud.orderservice.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    Optional<OrderEntity> findByOrderId(String orderId);

    Iterable<OrderEntity> findAllByUserId(String userId);
}
