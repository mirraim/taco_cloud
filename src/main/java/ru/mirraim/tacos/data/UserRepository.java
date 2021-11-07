package ru.mirraim.tacos.data;

import org.springframework.data.repository.CrudRepository;
import ru.mirraim.tacos.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
