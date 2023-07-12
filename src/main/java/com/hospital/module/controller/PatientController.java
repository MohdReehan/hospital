package com.hospital.module.controller;

import com.hospital.module.entities.Patient;
import com.hospital.module.servive.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping("/addPatient")
    public ResponseEntity<Object> addPatient(@RequestBody Patient patient){
        Patient added = service.addPatient(patient);
        return new ResponseEntity<>(added, HttpStatus.OK);

    }
    @GetMapping ("/admit")
    public ResponseEntity<Object> addPatient(@RequestParam String status){
        List<Patient> patients = service.fetchPatientAdmit(status);
        return new ResponseEntity<>(patients, HttpStatus.OK);

    }

}
