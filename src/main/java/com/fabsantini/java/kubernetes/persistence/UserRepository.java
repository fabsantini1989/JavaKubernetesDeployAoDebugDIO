package com.fabsantini.java.kubernetes.persistence;

import org.springframework.data.repository.CrudRepository;
import com.fabsantini.java.kubernetes.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}

