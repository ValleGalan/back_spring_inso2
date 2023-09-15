package back_spring_inso2.models.response;

import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //generar los constructores
public class ValidationErros {

    private Map<String, String> errors;
    private Date timestamp;
    
}
