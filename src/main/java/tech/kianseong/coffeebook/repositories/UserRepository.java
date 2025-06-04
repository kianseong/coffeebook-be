package tech.kianseong.coffeebook.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.kianseong.coffeebook.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<String> findByUsername(String username);
}
