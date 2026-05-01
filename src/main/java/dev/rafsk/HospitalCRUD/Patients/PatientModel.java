package dev.rafsk.HospitalCRUD.Patients;

import dev.rafsk.HospitalCRUD.Exams.ExamsModel;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_patient_registration")

public class PatientModel {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private int age;
     private List<ExamsModel> exams;




    public PatientModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public PatientModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
