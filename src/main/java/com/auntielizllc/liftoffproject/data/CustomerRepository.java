package com.auntielizllc.liftoffproject.data;

import com.auntielizllc.liftoffproject.models.NewClient;
import org.springframework.data.repository.CrudRepository;

public interface NewClientRepository extends CrudRepository<NewClient, Integer> {

    NewClient findByLastName(String lastName);
}
