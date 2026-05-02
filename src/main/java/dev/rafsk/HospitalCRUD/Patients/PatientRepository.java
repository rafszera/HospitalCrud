package dev.rafsk.HospitalCRUD.Patients;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<PatientModel, Long> {

}
