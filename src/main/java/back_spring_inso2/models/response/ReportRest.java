package back_spring_inso2.models.response;

import back_spring_inso2.enums.enums.Categoria;
import back_spring_inso2.enums.enums.Estado;
import back_spring_inso2.enums.enums.Prioridad;
import lombok.Data;

@Data
public class ReportRest {
    private long num_reporte;
    private Prioridad prioridad;
    private Categoria categoria;
    private long cant_archivo;
    private String url;
    private String ip;
    private long telefono;
    private String correo;
    private String nombre_user;
    private Estado estado;
    private String investigador;
}
