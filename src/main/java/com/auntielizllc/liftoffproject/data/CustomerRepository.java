package com.auntielizllc.liftoffproject.data;

import com.auntielizllc.liftoffproject.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {}
