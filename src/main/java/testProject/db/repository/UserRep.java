package testProject.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import testProject.db.User;

@Repository
public interface UserRep extends CrudRepository<User, Long> {

}
