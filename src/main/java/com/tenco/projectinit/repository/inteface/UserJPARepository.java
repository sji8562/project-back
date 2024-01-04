package com.tenco.projectinit.repository.inteface;

import com.tenco.projectinit.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJPARepository extends JpaRepository<User, Integer> {
    Optional<User> findByTel(String tel);
}
