package dev.rafsk.HospitalCRUD.Exams;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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


}
