package back_spring_inso2.models.response;

import java.util.Date;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.entities.RolEntity;
import back_spring_inso2.enums.enums.Jerarquia;

import lombok.Data;

@Data
public class UserRest {

    private long id;

    private String nombre;

    private String apellido;

    private Jerarquia jerarquia;

    private String legajo;

    private Integer  num_contacto;

    private String domicilio;

    private String correo;

    //private String password;

    private Date fecha_nacimiento;

    private Integer  dni;

    private String rol_usuario;

    //relacion uno a uno con Rol
    private RolEntity roles;

    //relacion 1:1 con reporte
    private ReportEntity reportes;
}
