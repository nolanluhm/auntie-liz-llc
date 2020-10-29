package com.auntielizllc.liftoffproject.data;

import com.auntielizllc.liftoffproject.models.ProductOrder;
import org.springframework.data.repository.CrudRepository;

public interface ProductOrderRepository extends CrudRepository<ProductOrder, Integer> {}