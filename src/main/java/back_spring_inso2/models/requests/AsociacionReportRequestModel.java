package back_spring_inso2.models.requests;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class AsociacionReportRequestModel {

    //private long id;
    private String estado;
    private Date fecha_creacion;
    @NotEmpty
    private Integer num_reporte ;
    private List<ReportRequestModel> reportes;


}
 