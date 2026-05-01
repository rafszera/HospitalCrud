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

     @Column(unique = true)
     private String email;

     private int age;

     @Column(unique = true)
     private int nationalId;

     private List<ExamsModel> exams;


}
