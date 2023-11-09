package back_spring_inso2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import back_spring_inso2.entities.RolEntity;

@Repository


public interface RolRepository extends CrudRepository<RolEntity, Long> {
    //Agregar metodos personalizados
    RolEntity findByRol(String rol);

}