package back_spring_inso2.services;

import java.util.List;

import back_spring_inso2.entities.UserEntity;
import back_spring_inso2.models.requests.UserRegisterRequestModel;


public interface UserService {
    
    public UserEntity createUser(UserRegisterRequestModel user);

    public UserEntity getUserById(long userId);

    public List<UserEntity> getAllUsers();


    public UserEntity updateUser(UserEntity user);

    public void deleteUser(UserEntity user);

    
}


