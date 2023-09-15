package back_spring_inso2.entities;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity(name = "asociacion_reporte")
@Data 

public class AsociacionReportEntity {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true, length = 255)
    private String estado;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha_creacion;
    
    @Column(nullable = true)
    private Integer num_reporte ;

    @OneToMany(mappedBy = "asociacion")
    private List<ReportEntity> reportes; //lista de objetos reportes con todos sus atributos
    

}
