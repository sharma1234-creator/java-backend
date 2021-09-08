package com.example.demo1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;



@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student alex = new Student(

                    "Alex",
                    "alex.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)


            );

            Student mariam = new Student(

                    "mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)

            );

            Student marry = new Student(

                    "marry",
                    "marry.jamal@gmail.com",
                    LocalDate.of(2003, Month.JANUARY, 5)

            );

            repository.saveAll(
                    List.of(mariam,alex,marry)
            );
        };
    }
}
