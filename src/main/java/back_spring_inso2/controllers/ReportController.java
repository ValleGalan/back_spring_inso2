package back_spring_inso2.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_spring_inso2.entities.ReportEntity;
import back_spring_inso2.enums.enums.Estado;
import back_spring_inso2.models.requests.ReportRequestModel;
import back_spring_inso2.models.response.DomicilioRest;
import back_spring_inso2.models.response.ReportRest;
import back_spring_inso2.services.ReportService;
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
// devuelve uno solo
    @GetMapping("/{reportId}")
    public ReportRest getReport(@PathVariable long reportId) { // @PathVariable long userId

        ReportEntity report = reportService.getReportById(reportId);
        ReportRest reportRest = new ReportRest();
        BeanUtils.copyProperties(report, reportRest);
        return reportRest;
    }
    // Devuelve todo los repirtes
    @GetMapping("/Allreports")
    public List<ReportRest> getAllReports() {
        List<ReportEntity> reports = reportService.getAllReports();
        List<ReportRest> reportRestList = new ArrayList<>();
        for (ReportEntity report : reports) {
            ReportRest reportRest = new ReportRest();
            BeanUtils.copyProperties(report, reportRest);
            reportRestList.add(reportRest);
        }
        return reportRestList;
    }

 // Actualizar un usuario existente
    @PutMapping("/{reportId}")
    public ReportRest updateReport(@PathVariable long reportId, @RequestBody ReportRequestModel reportModel) {
        ReportEntity existingReport = reportService.getReportById(reportId);
        if (existingReport == null) {
        }
        existingReport.setNum_reporte(reportModel.getNum_reporte());
        existingReport.setPrioridad(reportModel.getPrioridad());
        existingReport.setTipo_reporte(reportModel.getTipo_reporte());
        existingReport.setCant_archivo(reportModel.getCant_archivo());
        existingReport.setUrl(reportModel.getUrl());
        existingReport.setIp(reportModel.getIp());
        existingReport.setTelefono(reportModel.getTelefono());
        existingReport.setCorreo(reportModel.getCorreo());
        existingReport.setNombre_user(reportModel.getNombre_user());
        existingReport.setEstado(reportModel.getEstado());
        existingReport.setInvestigador(reportModel.getInvestigador());
        existingReport.setDomicilio_reporte(reportModel.getDomicilio_reporte());
        ReportEntity updatedReport = reportService.updateReport(existingReport);// Guarda loscambios en el usuario
        ReportRest reportRest = new ReportRest();
        BeanUtils.copyProperties(updatedReport, reportRest);
        return reportRest;
    }

    @DeleteMapping("/{reportId}")
    public ResponseEntity<Void> deleteReport(@PathVariable long reportId) {
        ReportEntity existingReport = reportService.getReportById(reportId);
        if (existingReport == null) {

        }
        reportService.deleteReport(existingReport);
        return ResponseEntity.noContent().build();
    }
    /* */
    @GetMapping("/domiciliosHechosEsclarecidos")
    public List<DomicilioRest> getDomiciliosHechosEsclarecidos() {
        List<ReportEntity> reports = reportService.getReportsByEstado(Estado.HECHO_ESCLARECIDO);
        List<DomicilioRest> domicilios = new ArrayList<>();

        for (ReportEntity report : reports) {
            DomicilioRest domicilioModel = new DomicilioRest();
            domicilioModel.setNum_reporte(report.getNum_reporte());
            domicilioModel.setDomicilio_reporte(report.getDomicilio_reporte());
            domicilioModel.setTipo_reporte(report.getTipo_reporte());
        // Puedes configurar otros campos según sea necesario
            domicilios.add(domicilioModel);
        }

    return domicilios;
    }




}
