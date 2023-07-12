package com.hospital.module.servive;

import com.hospital.module.entities.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    Patient addPatient(Patient patient);
    List<Patient> fetchPatientAdmit(String status);




}
