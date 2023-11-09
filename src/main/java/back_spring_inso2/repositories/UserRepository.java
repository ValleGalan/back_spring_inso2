package back_spring_inso2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import back_spring_inso2.entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    
    //Agregar metodos personalizados
    UserEntity findByCorreo(String correo);
}