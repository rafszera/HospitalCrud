package dev.rafsk.HospitalCRUD.Patients;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PatientController {


    @GetMapping("/welcome")
    public String welcome(){
        return "First msg in this route";
    }





}
