package back_spring_inso2.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.models.requests.ReportRequestModel;
import back_spring_inso2.models.response.ReportRest;
import back_spring_inso2.services.ReportService;
import back_spring_inso2.services.UserService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/reporte")

public class ReportController {

    @Autowired
    ReportService reportService;

     @PostMapping()  
    public ReportRest createReport( @RequestBody @Valid ReportRequestModel reportModel){
        
        ReportEntity report = reportService.createReport(reportModel);
        ReportRest reportRest = new ReportRest();
        BeanUtils.copyProperties(report, reportRest);
        
        return reportRest;
    }


}
