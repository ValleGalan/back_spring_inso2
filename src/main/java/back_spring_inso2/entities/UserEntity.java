package back_spring_inso2.entities;

import java.util.Date;

import back_spring_inso2.enums.enums.Estado_Usuario;
import back_spring_inso2.enums.enums.Jerarquia;
import back_spring_inso2.enums.enums.Rol;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity(name="usuario")
@Data //con lombok genera getters y setters a los campos
public class UserEntity {
    //Modelos - tablas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //incremente en la BD
    private long id;

    @Column(nullable = false, length = 255)
    private String nombre;

    @Column(nullable = false, length = 255)
    private String apellido;

    //@Column(nullable = true, length = 255)
    //private String jerarquia;
    @Enumerated(EnumType.STRING)
    @Column(nullable = true, length = 150) 
    private Jerarquia jerarquia;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true, length = 250)
    private Estado_Usuario estado;

    @Column(nullable = false, length = 255)
    private String legajo;

    @Column(nullable = true)
    private Integer  num_contacto;

    @Column(nullable = true, length = 255)
    private String domicilio;

    @Column(nullable = false, length = 255)
    private String correo;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column(nullable = false)
    private Integer  dni;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private Rol rol_usuario;

    //relacion uno a uno con Rol
    @OneToOne(mappedBy = "usuario")
    private RolEntity roles;

    //relacion 1:1 con reporte
    @OneToOne(mappedBy = "user")
    private ReportEntity reportes;

}

