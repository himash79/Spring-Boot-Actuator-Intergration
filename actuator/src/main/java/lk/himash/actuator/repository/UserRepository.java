package lk.himash.actuator.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import lk.himash.actuator.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
