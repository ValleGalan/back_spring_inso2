package back_spring_inso2.models.requests;

import java.util.Date;

import back_spring_inso2.enums.enums.Estado_Usuario;
import back_spring_inso2.enums.enums.Jerarquia;
import back_spring_inso2.enums.enums.Rol;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegisterRequestModel {
    //Modelo de mis tablas - entity

    private long id;
    @NotEmpty
    private String nombre;
    private String apellido;
    private Jerarquia jerarquia;
    private Estado_Usuario estado;
    private String legajo;
    private long  num_contacto;
    private String domicilio; 
    @NotEmpty
    @Email
    private String correo;
    @NotEmpty
    @Size(min= 8, max = 40)
    private String password;
    private Date fecha_nacimiento;
    private long  dni;
    private Rol rol_usuario;

}
