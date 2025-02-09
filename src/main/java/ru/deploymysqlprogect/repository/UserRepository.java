package ru.deploymysqlprogect.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.deploymysqlprogect.entinty.User;

public interface UserRepository extends JpaRepository<User, Long> {



}
