package MyCompany.Project.Controller;



import MyCompany.Project.Entity.User;
import MyCompany.Project.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/Users")
    public String addUser(@RequestBody User user) throws ExecutionException, InterruptedException {


 return userService.addUser(user);
    }


}
