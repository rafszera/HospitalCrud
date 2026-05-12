package dev.rafsk.HospitalCRUD.Patients;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class PatientController {

    @GetMapping("/welcome")
        public String welcome(){
            return "First msg in this route";
    }
    @PostMapping("/create")
        public String createPatient(){
            return "Patient Created";
    }
    @GetMapping("/allPatients")
        public String showAllPatient(){
            return "Show Patients";
    }
    @GetMapping("/allID")
        public String showAllPatientsID(){
        return "Patient ID: ";
    }
    @PutMapping("/changebyID")
        public String changePatientByID() {
            return "Change Patient by ID";
        }
    @DeleteMapping("/deleteByID")
        public String deleteByID() {
            return "Delete Patient by ID";
    }





}
