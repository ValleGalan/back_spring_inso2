package back_spring_inso2.models.requests;

import java.util.Date;

import back_spring_inso2.enums.enums.Estado_Usuario;
import back_spring_inso2.enums.enums.Jerarquia;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserRegisterRequestModel {
    //Modelo de mis tablas - entity

    //private long id;
    @NotEmpty
    private String nombre;
    private String apellido;
    private Jerarquia jerarquia;
    private Estado_Usuario estado;
    private String legajo;
    private Integer num_contacto;
    private String domicilio; 
    @NotEmpty
    @Email
    private String correo;
    @NotEmpty
    @Size(min= 8, max = 40)
    private String password;
    private Date fecha_nacimiento;
    private Integer dni;
    private String rol_usuario;
    private RolRequestModel roles;
    private ReportRequestModel reportes;
}
