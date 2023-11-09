package back_spring_inso2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.enums.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

//@Entity
//@Table(name = "reporte") 
@Repository
public interface ReportRepository extends CrudRepository<ReportEntity, Long> {
    
    @Query("SELECT r FROM ReportEntity r WHERE r.estado = :estado")
    List<ReportEntity> findByEstado(@Param("estado") Estado estado);
}
