package back_spring_inso2.models.requests;

import java.util.List;

import back_spring_inso2.enums.enums.TipoReporte;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class InformeRequestModel {
    // private long id;
    @NotEmpty
    private String autor;
    @NotEmpty
    private String archivo;
    private TipoReporte tipo_reporte;
    private List<ReportRequestModel> reportes;
}
 