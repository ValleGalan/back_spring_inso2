package back_spring_inso2.entities;

import java.util.List;

import back_spring_inso2.enums.enums.Categoria;
import back_spring_inso2.enums.enums.Estado;
import back_spring_inso2.enums.enums.Prioridad;
import back_spring_inso2.enums.enums.TipoReporte;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Table(name = "reporte")
@Entity //(name = "reporte")
@Data
public class ReportEntity {
    //Modelo de tabla

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private long num_reporte;

    @Enumerated(EnumType.STRING)
    @Column( length = 200) 
    private Prioridad prioridad;

    //@Column( length = 255)
    //private String categoria;
    @Enumerated(EnumType.STRING)
    @Column( length = 200) 
    private TipoReporte tipo_reporte;

    @Column(nullable = true)
    private long cant_archivo;

    @Column( length = 255)
    private String url;

    @Column( length = 255)
    private String ip;

    @Column(nullable = true)
    private long telefono;

    @Column( length = 255)
    private String correo;

    @Column( length = 255)
    private String nombre_user;

    //@Column(, length = 255)
    //private String estado;
    @Enumerated(EnumType.STRING)
    @Column( length = 200) 
    private Estado estado;

    @Column(length = 255)
    private String investigador;

    @Column(length = 255)
    private String domicilio_reporte;
    
    
    // Relacion 1:M con asociacion
    @ManyToOne
    @JoinColumn(name = "AsociacionReport_id")
    private AsociacionReportEntity asociacion;

    //relacion de M:M con informes
    @ManyToMany
    @JoinTable(name = "reporte_informe",
        joinColumns = @JoinColumn(name = "reporte_id"),
        inverseJoinColumns = @JoinColumn(name = "informe_id"))
    private List<InformeEntity> informes;

    //relacion 1:1 con user
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    //relacion 1:M con ubicacion
    @OneToMany(mappedBy = "reporte")
    private List<UbicacionEntity> ubicaciones;
    
}
