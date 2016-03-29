package hello.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	UserRepository repository;

	@Override
	public UserEntity getUserById(long id) {
		return repository.findOne(id);
	}

	@Override
	public UserEntity getUserByNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return repository.findByNameAndPassword(username, password);
	}

	@Override
	public long countUser() {
		return repository.count();
	}

}
