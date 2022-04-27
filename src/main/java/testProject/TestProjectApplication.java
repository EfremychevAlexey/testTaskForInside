package testProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testProject.db.User;
import testProject.db.repository.UserRep;

@SpringBootApplication
@RestController
@RequestMapping(value = "", produces = "application/json")
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
	@Autowired
	private UserRep userRep;

	@RequestMapping("create-user")
	public User createUser(){
		return userRep.save(new User());
	}
}
