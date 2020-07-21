package ru.nickzim.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nickzim.task.Model.User;

public interface UsersRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
