package com.auntielizllc.liftoffproject.data;

import com.auntielizllc.liftoffproject.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
