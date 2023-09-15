package back_spring_inso2.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import back_spring_inso2.entities.ReportEntity;

@Repository
public interface ReportRepository extends CrudRepository<ReportEntity, Long> {
    
}
