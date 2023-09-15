package back_spring_inso2.services;

import back_spring_inso2.entities.UserEntity;
import back_spring_inso2.models.requests.UserRegisterRequestModel;


public interface UserService {
    
    public UserEntity createUser(UserRegisterRequestModel user);
    
}
