//package testProject;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import testProject.db.User;
//import testProject.db.repository.UserRep;
//
//@RestController
//@RequestMapping(value = "", produces = "application/json")
//public class DefaultController {
//
//  @Autowired
//  private UserRep userRep;
//
//  @RequestMapping("/create-user")
//  public User createUser(){
//    return userRep.save(new User());
//  }
//
//}
