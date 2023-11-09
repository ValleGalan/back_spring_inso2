package back_spring_inso2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity(name="rol")
@Data
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //incremente en la BD
    private long id;
    
    @Column( length = 255)
    private String rol;
    //usuario puede tener un único rol y 
    //un rol puede estar asociado a un único usuario

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private UserEntity usuario;


}
