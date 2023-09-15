package back_spring_inso2.models.requests;

import java.util.List;

import back_spring_inso2.enums.enums.Categoria;
import back_spring_inso2.enums.enums.Estado;
import back_spring_inso2.enums.enums.Prioridad;
import lombok.Data;

@Data
public class ReportRequestModel {

    //private long numReporte;
    private Prioridad prioridad;
    private Categoria categoria;
    private Integer cantArchivo;
    private String url;
    private String ip;
    private Integer telefono;
    private String correo;
    private String nombreUser;
    private Estado estado;
    private String investigador;
    private AsociacionReportRequestModel asociacion;
    private List<InformeRequestModel> informes;
    private UserRegisterRequestModel user;
    private List<UbicacionRequestModel> ubicaciones;
}
