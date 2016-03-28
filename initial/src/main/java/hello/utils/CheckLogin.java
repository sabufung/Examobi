package hello.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.user.UserEntity;
import hello.user.UserService;

@RestController
public class CheckLogin {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public UserEntity authentication(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		UserEntity user = userService.getUserByNameAndPassword(username, password);
		if (user == null) {
			return null;
		}
		return user;
	}

}
