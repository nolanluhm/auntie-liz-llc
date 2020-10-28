package com.auntielizllc.liftoffproject.data;

import com.auntielizllc.liftoffproject.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {}