package back_spring_inso2.models.requests;

import lombok.Data;

@Data
public class UbicacionRequestModel {

    //private long idMapa;
    private String ubicacion;
    private String estado;
    private String numReport;
    private String ip;
    private String domicilio;
    private ReportRequestModel reporte;
}
