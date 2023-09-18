package back_spring_inso2.models.response;

import java.util.Date;
import back_spring_inso2.enums.enums.Estado_Usuario;
import back_spring_inso2.enums.enums.Jerarquia;
import back_spring_inso2.enums.enums.Rol;
import lombok.Data;

@Data
public class UserRest {

    private String nombre;
    private String apellido;
    private Jerarquia jerarquia;
    private Estado_Usuario estado;
    private String legajo;
    private long  num_contacto;
    private String domicilio; 
    private String correo;
    private String password;
    private Date fecha_nacimiento;
    private long  dni;
    private Rol rol_usuario;
}
