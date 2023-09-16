package back_spring_inso2.enums;

public class enums {
    
    public enum Jerarquia {
        OFICIALES_SUPERIORES,
        OFICIALES_JEFES,
        OFICIALES_SUBALTERNOS,
        SUBOFICIALES_SUPERIORES,
        SUBOFICIALES_SUBALTERNOS
    }

    public enum Prioridad {
        ALTA,
        MEDIA,
        BAJA
    }

    public enum Categoria {
        ALTA,
        MEDIA,
        BAJA
    }

    public enum Estado {
        EN_CURSO,
        HECHO_ESCLARECIDO
    }
    
    public enum TipoReporte {
        A1_PREADOLESCENTE_ACTO_SEXUAL,
        A2_PREADOLESCENTE_EXPOSICIÓN_LASCIVA,
        B1_ADOLESCENTE_ACTO_SEXUAL,
        B2_ADOLESCENTE_EXPOSICIÓN_LASCIVA
    }

    public enum Rol {
        ADMINISTRADOR,
        SECRETARIO
    }

    public enum Estado_Usuario {
        HABILITADO,
        DESABILITADO
    }
}
