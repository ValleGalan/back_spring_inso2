package back_spring_inso2.entities;

import java.util.List;

import back_spring_inso2.enums.enums.Estado;
import back_spring_inso2.enums.enums.TipoReporte;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity(name = "informe")
@Data

public class InformeEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column( length = 255)
    private String autor;

    @Column( length = 255)
    private String archivo;

    //@Column( length = 255)
    //private String tipo;
    @Enumerated(EnumType.STRING)
    @Column( length = 255) 
    private TipoReporte tipo_reporte;

    //relacion de M:M con reporte
    @ManyToMany(mappedBy = "informes")
    private List<ReportEntity> reportes;

}
