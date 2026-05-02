package dev.rafsk.HospitalCRUD.Exams;
import dev.rafsk.HospitalCRUD.Patients.PatientModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_exams")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExamsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameExam;
    private ExamType type;



    @OneToMany(mappedBy = "exam")
    private List<PatientModel> patient;
}
