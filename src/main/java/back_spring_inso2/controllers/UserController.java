package back_spring_inso2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_spring_inso2.entities.UserEntity;
import back_spring_inso2.models.requests.UserRegisterRequestModel;
import back_spring_inso2.services.UserService;
import jakarta.validation.Valid; //fijarme el valid que no anda capaz otra version de Hibernate Validator Engine

@RestController
@RequestMapping("/users")


public class UserController {

    //usamos el servicio
    @Autowired
    UserService userService;


    //POST, GET, DELETE, PUT, PATH
    @PostMapping()  
    public UserEntity createUser( @RequestBody @Valid UserRegisterRequestModel userModel){
        
        UserEntity user= userService.createUser(userModel);

        return user;
    }
}
