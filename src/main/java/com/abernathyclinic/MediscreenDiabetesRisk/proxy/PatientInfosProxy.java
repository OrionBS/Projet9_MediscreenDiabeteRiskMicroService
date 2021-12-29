package com.abernathyclinic.MediscreenDiabetesRisk.proxy;

import com.abernathyclinic.MediscreenDiabetesRisk.models.Patient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8081/patient", name = "PatientInfos")
public interface PatientInfosProxy {

    @RequestMapping(method = RequestMethod.GET, path = "/id")
    Patient readPatientById(@RequestParam Integer patientId);

    @RequestMapping(method = RequestMethod.GET, path = "/name")
    Patient readPatientByFirstNameAndLastName(@RequestParam String firstName, @RequestParam String lastName);

}
