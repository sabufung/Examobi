package hello.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByNameAndPassword(String username, String password);
}
