package lk.himash.actuator.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lk.himash.actuator.entity.User;
import lk.himash.actuator.repository.UserRepository;
import lk.himash.actuator.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public ResponseEntity<?> getAllUsers() {
		ResponseEntity<?> res = null;
		List<User> users = new ArrayList<>();
		try {
			users = userRepo.findAll();
			res = new ResponseEntity<>(users, HttpStatus.OK);
			return res;
		}catch(Exception ex) {
			res = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
			return null;
		}
	}

}
