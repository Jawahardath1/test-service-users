package com.sdsa.bmp.service.users.repositories;

import java.util.Optional;

import com.sdsa.bmp.service.users.entities.BookstoreUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<BookstoreUser, Long> {

    Optional<BookstoreUser> findByLogin(String login);
}
