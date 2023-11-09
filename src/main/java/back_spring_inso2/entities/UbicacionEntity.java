package back_spring_inso2.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "mapa")

public class UbicacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_mapa;

    @Column(length = 255)
    private String ubicacion;

    @Column(length = 255)
    private String estado;

    @Column(length = 255)
    private String num_report;

    @Column(length = 255)
    private String ip;

    @Column(length = 255)
    private String domicilio;

    //relacion 1:M con reporte
    @ManyToOne
    @JoinColumn(name = "reporte_id")
    private ReportEntity reporte;
}
