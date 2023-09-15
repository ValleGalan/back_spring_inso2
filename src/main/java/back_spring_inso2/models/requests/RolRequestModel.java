package back_spring_inso2.models.requests;

import lombok.Data;

@Data
public class RolRequestModel {
    //private long id;
    private String rol;
    private UserRegisterRequestModel usuario;
}
