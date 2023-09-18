package back_spring_inso2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.entities.UserEntity;
import back_spring_inso2.models.requests.ReportRequestModel;
import back_spring_inso2.repositories.ReportRepository;

@Service
public class ReportServiceImpl implements ReportService{

    ReportRepository reportRepository;

    public ReportServiceImpl(ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }

    @Override
    public ReportEntity createReport(ReportRequestModel report){
        ReportEntity reportEntity = new ReportEntity();
        BeanUtils.copyProperties(report, reportEntity);

        return reportRepository.save(reportEntity);
    }
    @Override
    public ReportEntity getReportById(long reportId) {
        Optional<ReportEntity> reporte = reportRepository.findById(reportId);
        return reporte.orElse(null);
    }
    @Override
    public List<ReportEntity> getAllReports() {
        Iterable<ReportEntity> reportes = reportRepository.findAll();
        List<ReportEntity> reportList = new ArrayList<>();
        reportes.forEach(reportList::add);
        return reportList;
    }
    @Override
    public ReportEntity updateReport(ReportEntity reportEntityEntity) {
        return reportRepository.save(reportEntityEntity);
    }

    @Override
    public void deleteReport(ReportEntity reportEntity) {
        reportRepository.delete(reportEntity);
    }



}
