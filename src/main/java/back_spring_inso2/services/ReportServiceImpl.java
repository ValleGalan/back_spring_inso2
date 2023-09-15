package back_spring_inso2.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import back_spring_inso2.entities.ReportEntity;
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
}
