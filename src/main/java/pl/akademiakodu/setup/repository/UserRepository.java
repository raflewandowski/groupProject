package pl.akademiakodu.setup.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.akademiakodu.setup.models.User;

import java.util.List;

/**
 * Created by Patryk Dudzik on 09.11.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByNickname(String nickname);
    List<User> findByEmail(String email);
}
