package pl.jadamski.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.jadamski.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
