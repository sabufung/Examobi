package hello.user;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
	public UserEntity getUserById(long id);
	public UserEntity getUserByNameAndPassword(String username,String password);
	public long countUser();
}
