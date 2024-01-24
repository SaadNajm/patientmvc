package com.example.patientsmvc2;

import com.example.patientsmvc2.entities.Patient;
import com.example.patientsmvc2.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class PatientsMvc2Application {

    public static void main(String[] args) {
        SpringApplication.run(PatientsMvc2Application.class, args);
    }
    /*@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
      return args -> {
           patientRepository.save(new Patient(null,"Saad",new Date(),true,15));
          patientRepository.save(new Patient(null,"Mehdi",new Date(),true,12));
          patientRepository.save(new Patient(null,"Samya",new Date(),false,14));
          patientRepository.save(new Patient(null,"Mariya",new Date(),false,18));
          patientRepository.save(new Patient(null,"Khadija",new Date(),true,19));
          patientRepository.findAll().forEach(p->{
              System.out.println(p.getNom());
          });
      };


 } */
}
