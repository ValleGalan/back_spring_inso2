package back_spring_inso2.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_spring_inso2.entities.UserEntity;
import back_spring_inso2.models.requests.UserRegisterRequestModel;
import back_spring_inso2.models.response.UserRest;
import back_spring_inso2.services.UserService;
import jakarta.validation.Valid; //fijarme el valid que no anda capaz otra version de Hibernate Validator Engine

@RestController
@RequestMapping("/users/")


public class UserController {

    //usamos el servicio
    @Autowired
    UserService userService;

    //POST, GET, DELETE, PUT, PATH
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping()  
    public UserRest createUser( @RequestBody @Valid UserRegisterRequestModel userModel){
        
        UserEntity user= userService.createUser(userModel);
        UserRest userRest = new UserRest();
        BeanUtils.copyProperties(user, userRest);
        return userRest;
    }

    

    /*
@GetMapping("/{userId}")
    public UserRest getUser(@PathVariable Long userId) {

    UserEntity user = userService.getUserById(userId);
    UserRest userRest = new UserRest();
    BeanUtils.copyProperties(user, userRest);
    return userRest;
    }

     @PutMapping("/{userId}")
    public UserRest updateUser(@PathVariable Long userId, @RequestBody UserRegisterRequestModel userModel) {
    UserEntity existingUser = userService.getUserById(userId);

    // Verifica si el usuario con userId existe
    if (existingUser == null) {
        // Maneja el caso en el que el usuario no existe, por ejemplo, lanza una excepción
    }

    // Actualiza los campos relevantes del usuario con los valores de userModel
    // Aquí puedes usar BeanUtils.copyProperties o establecer los campos manualmente
    existingUser.setNombre(userModel.getNombre());
    existingUser.setApellido(userModel.getApellido());

    UserEntity updatedUser = userService.updateUser(existingUser);// Guarda los cambios en el usuario
    UserRest userRest = new UserRest();
    BeanUtils.copyProperties(updatedUser, userRest);
    return userRest;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
    UserEntity existingUser = userService.getUserById(userId);

    if (existingUser == null) {
        // Maneja el caso en el que el usuario no existe, por ejemplo, lanza una excepción
    }

    userService.deleteUser(existingUser);
    return ResponseEntity.noContent().build();
}
     */



}
