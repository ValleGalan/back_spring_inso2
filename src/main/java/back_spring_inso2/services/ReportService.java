package back_spring_inso2.services;

import java.util.List;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.models.requests.ReportRequestModel;

public interface ReportService {

    public ReportEntity createReport(ReportRequestModel report);

    public ReportEntity getReportById(long reportId);

    public List<ReportEntity> getAllReports();


    public ReportEntity updateReport(ReportEntity report);

    public void deleteReport(ReportEntity report);

}
