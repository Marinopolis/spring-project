package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (
            StudentRepository repository) {
        return args -> {
            Student Marian = new Student(
                    1L,
                    "Marian",
                    "marian.stanimirov69@gmail.com",
                    LocalDate.of(1999, FEBRUARY,26)
            );
            Student Antoan = new Student(
                    "Antoan",
                    "stoikov99@gmail.com",
                    LocalDate.of(1999, FEBRUARY,26)
            );

            repository.saveAll(
                    List.of(Marian, Antoan)
            );
        };
    }
}
