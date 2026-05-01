package dev.rafsk.HospitalCRUD.Patients;
import dev.rafsk.HospitalCRUD.Exams.ExamsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_patient_registration")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientModel {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private int age;
     private List<ExamsModel> exams;


}
