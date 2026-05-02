package dev.rafsk.HospitalCRUD.Patients;
import dev.rafsk.HospitalCRUD.Exams.ExamsModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "tb_patients_R")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PatientModel {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private Long id;

     @Column(name = "name")
     private String name;

     @Column(unique = true, name = "email")
     private String email;

     @Column(name = "img_url")
     private String imgUrl;

     @Column(name = "age")
     private int age;

     @Column(unique = true, name = "national_ir")
     private int nationalId;


     @ManyToOne
     @JoinColumn(name = "exam_id")
     private ExamsModel exam;

}
