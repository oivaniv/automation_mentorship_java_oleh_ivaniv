package lesson_10_RestTemplate.MyAPI;

import lesson_8_QueryDSL.student.Student;

import java.time.LocalDate;

public class StudentsRepository {
    public static Student createStudent(String name, String email, LocalDate dob) {
        Student testStudent = new Student();
        testStudent.setName(name);
        testStudent.setEmail(email);
        testStudent.setDob(dob);
        return testStudent;
    }

    public static Student createPredefinedStudent() {
        Student testStudent = new Student();
        testStudent.setName("TestTest");
        testStudent.setEmail("email@gmail.com");
        testStudent.setDob(LocalDate.of(1955, 8, 10));
        return testStudent;
    }


}
