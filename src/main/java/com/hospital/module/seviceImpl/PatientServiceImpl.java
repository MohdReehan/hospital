package com.hospital.module.seviceImpl;

import com.hospital.module.entities.Patient;
import com.hospital.module.repositories.PatientRepository;
import com.hospital.module.servive.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        Patient saved = patientRepository.save(patient);
        return saved;
    }

    @Override
    public List<Patient> fetchPatientAdmit(String status) {
        List<Patient> patientList = patientRepository.findAllByStatus(status);
        if (patientList.size()>0){
            return patientList;
        }
        return null;
    }
}
