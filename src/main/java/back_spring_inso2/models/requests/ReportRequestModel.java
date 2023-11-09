package back_spring_inso2.models.requests;

import java.util.List;

import back_spring_inso2.enums.enums.Categoria;
import back_spring_inso2.enums.enums.Estado;
import back_spring_inso2.enums.enums.Prioridad;
import back_spring_inso2.enums.enums.TipoReporte;
import lombok.Data;

@Data
public class ReportRequestModel {

    private long id;
    private long num_reporte;
    private Prioridad prioridad;
    private TipoReporte tipo_reporte;

    private long cant_archivo;
    private String url;
    private String ip;
    private long telefono;
    private String correo;
    private String nombre_user;
    private Estado estado;
    private String investigador;
    private String domicilio_reporte;

}
