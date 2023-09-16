package back_spring_inso2.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import back_spring_inso2.entities.UserEntity;
import back_spring_inso2.models.requests.UserRegisterRequestModel;
import back_spring_inso2.repositories.UserRepository;

@Service
//implementar el servicio
public class UserServiceImpl implements UserService{

    //@Autowired esta es la forma 1
    UserRepository userRepository;
    //inyectarlo por un constructor forma 2
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserRegisterRequestModel user){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);//copiar de user a userEntity
        //userEntity.setEncryptedPassword(user.getPassword());
        return userRepository.save(userEntity);
    }


}
    

    /*
     * 
     * @Override
    public UserEntity getUserById(Long userId) {
        Optional<UserEntity> userOptional = userRepository.findById(userId);
        return userOptional.orElse(null);
    }
     @Override
    public UserEntity updateUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(UserEntity user) {
        userRepository.delete(user);
    }
    */
