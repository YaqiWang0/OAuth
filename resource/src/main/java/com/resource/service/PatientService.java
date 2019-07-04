package com.resource.service;

import com.resource.domain.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientService {
    List<Patient> findAll();
}
