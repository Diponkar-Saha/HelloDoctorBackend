package com.hellodoctor.dip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PatientController {
    @GetMapping("/student")
    public Patient getPatient(){
        return new Patient("dip","dipn");
    }

    @GetMapping("/students")
    public List<Patient> getStudent(){
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Ripa","paul"));
        patients.add(new Patient("moni","paul"));
        patients.add(new Patient("subarna","paul"));
        patients.add(new Patient("tina","paul"));
        return patients;
    }


    @GetMapping("student/{firstName}/{lastName}")
    public Patient patientPath(@PathVariable("firstName") String firstName,
                               @PathVariable("lastName")String lastName){
        return new Patient(firstName,lastName);
    }



    @GetMapping("student/query")
    public Patient patientQueryPath(
            @RequestParam("firstName") String firstName,
            @RequestParam("lastName")String lastName){
        return new Patient(firstName,lastName);
    }


}
