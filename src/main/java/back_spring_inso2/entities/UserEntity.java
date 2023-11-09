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

    @Column( length = 255)
    private String nombre;

    @Column( length = 255)
    private String apellido;

    //@Column(nullable = true, length = 255)
    //private String jerarquia;
    @Enumerated(EnumType.STRING)
    @Column( length = 150) 
    private Jerarquia jerarquia;

    @Enumerated(EnumType.STRING)
    @Column( length = 250)
    private Estado_Usuario estado;

    @Column( length = 255)
    private String legajo;

    @Column(nullable = true)
    private long   num_contacto;

    @Column( length = 255)
    private String domicilio;

    @Column( length = 255)
    private String correo;

    @Column( length = 255)
    private String password;

    @Column()
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    @Column()
    private long   dni;

    @Enumerated(EnumType.STRING)
    @Column( length = 255)
    private Rol rol_usuario;

    //relacion uno a uno con Rol
    @OneToOne(mappedBy = "usuario")
    private RolEntity roles;

    //relacion 1:1 con reporte
    @OneToOne(mappedBy = "user")
    private ReportEntity reportes;

}

