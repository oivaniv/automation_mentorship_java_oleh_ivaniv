package lesson_8_QueryDSL.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student oleh = new Student(
                    "Oleh",
                    "oleh.ivaniv.96@gmail.com",
                    LocalDate.of(1996, Month.JULY, 01)
            );

            Student vova = new Student(
                    "Vova",
                    "vova.lu.96@gmail.com",
                    LocalDate.of(1995, Month.NOVEMBER, 16)
            );

            repository.saveAll(
                    List.of(oleh, vova)
            );
        };
    }
}

