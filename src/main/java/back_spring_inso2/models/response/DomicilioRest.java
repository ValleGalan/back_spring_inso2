package back_spring_inso2.models.response;
import back_spring_inso2.enums.enums.TipoReporte;
import lombok.Data;


@Data
public class DomicilioRest {
    private long num_reporte;
    private String domicilio_reporte;
    private TipoReporte tipo_reporte;
}
