package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.models.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getReferenceByLogin(String login);
}
