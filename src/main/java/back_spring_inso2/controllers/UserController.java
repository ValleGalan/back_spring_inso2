package back_spring_inso2.controllers;

import java.util.ArrayList;
import java.util.List;

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
@RequestMapping("/users")

public class UserController {

    // usamos el servicio
    @Autowired
    UserService userService;

    // POST, GET, DELETE, PUT, PATH
    // @CrossOrigin(origins = "http://localhost:3000")

    // crea un usuario
    @PostMapping()
    public UserRest createUser(@RequestBody @Valid UserRegisterRequestModel userModel) {

        UserEntity user = userService.createUser(userModel);
        UserRest userRest = new UserRest();
        BeanUtils.copyProperties(user, userRest);
        return userRest;
    }

    // devuelve uno solo
    @GetMapping("/{userId}")
    public UserRest getUser(@PathVariable long userId) { // @PathVariable long userId

        UserEntity user = userService.getUserById(userId);
        UserRest userRest = new UserRest();
        BeanUtils.copyProperties(user, userRest);
        return userRest;
    }

    // Devuelve todo los usuarios
    @GetMapping("/Allusers")
    public List<UserRest> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        List<UserRest> userRestList = new ArrayList<>();
        for (UserEntity user : users) {
            UserRest userRest = new UserRest();
            BeanUtils.copyProperties(user, userRest);
            userRestList.add(userRest);
        }
        return userRestList;
    }

    // Actualizar un usuario existente
    @PutMapping("/{userId}")
    public UserRest updateUser(@PathVariable Long userId, @RequestBody UserRegisterRequestModel userModel) {
        UserEntity existingUser = userService.getUserById(userId);
        if (existingUser == null) {
        }
        existingUser.setNombre(userModel.getNombre());
        existingUser.setApellido(userModel.getApellido());
        existingUser.setJerarquia(userModel.getJerarquia());
        existingUser.setEstado(userModel.getEstado());
        existingUser.setLegajo(userModel.getLegajo());
        existingUser.setNum_contacto(userModel.getNum_contacto());
        existingUser.setDomicilio(userModel.getDomicilio());
        existingUser.setCorreo(userModel.getCorreo());
        existingUser.setPassword(userModel.getPassword());
        existingUser.setFecha_nacimiento(userModel.getFecha_nacimiento());
        existingUser.setDni(userModel.getDni());
        existingUser.setRol_usuario(userModel.getRol_usuario());
        UserEntity updatedUser = userService.updateUser(existingUser);// Guarda loscambios en el usuario
        UserRest userRest = new UserRest();
        BeanUtils.copyProperties(updatedUser, userRest);
        return userRest;
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable long userId) {
        UserEntity existingUser = userService.getUserById(userId);
        if (existingUser == null) {

        }
        userService.deleteUser(existingUser);
        return ResponseEntity.noContent().build();
    }

}
