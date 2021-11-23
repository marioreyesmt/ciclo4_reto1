package com.reto1.ciclo4.repository.crud;

import com.reto1.ciclo4.model.User;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
}
