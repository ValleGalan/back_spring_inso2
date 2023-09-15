package back_spring_inso2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_spring_inso2.models.requests.ReportRequestModel;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/reporte")
public class ReportController {
     @PostMapping()  
    public String createReport( @RequestBody @Valid ReportRequestModel reportModel){
        return "-----creacion de reporte";
    }


}
