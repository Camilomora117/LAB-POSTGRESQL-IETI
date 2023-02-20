package escuelaing.edu.co.postgreSQL.repository;

import escuelaing.edu.co.postgreSQL.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
}

