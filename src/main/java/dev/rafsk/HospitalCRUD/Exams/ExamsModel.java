package dev.rafsk.HospitalCRUD.Exams;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_exams")

public class ExamsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameExam;
    private ExamType type;

    public ExamsModel(Long id, String nameExam, ExamType type) {
        this.id = id;
        this.nameExam = nameExam;
        this.type = type;
    }

    public ExamsModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameExam() {
        return nameExam;
    }

    public void setNameExam(String nameExam) {
        this.nameExam = nameExam;
    }

    public ExamType getType() {
        return type;
    }

    public void setType(ExamType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ExamsModel{" +
                "id=" + id +
                ", nameExam='" + nameExam + '\'' +
                ", type=" + type +
                '}';
    }
}
