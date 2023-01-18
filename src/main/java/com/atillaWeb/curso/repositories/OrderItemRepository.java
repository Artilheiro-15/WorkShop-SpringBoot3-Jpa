package com.atillaweb.curso.repositories;

import com.atillaweb.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
