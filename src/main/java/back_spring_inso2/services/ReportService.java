package back_spring_inso2.services;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.models.requests.ReportRequestModel;

public interface ReportService {

    public ReportEntity createReport(ReportRequestModel report);

}
