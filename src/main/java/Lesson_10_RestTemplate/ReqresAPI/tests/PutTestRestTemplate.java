package Lesson_10_RestTemplate.ReqresAPI.tests;

import Lesson_10_RestTemplate.MyAPI.StudentsRepository;
import Lesson_10_RestTemplate.ReqresAPI.dataModels.Employees;
import Lesson_10_RestTemplate.ReqresAPI.userRepository.EmployeeRepository;
import Lesson_8_QueryDSL.student.Student;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static Lesson_10_RestTemplate.MyAPI.UrlController.getStudentUrl;
import static Lesson_10_RestTemplate.ReqresAPI.UrlController.putUserUrlById;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PutTestRestTemplate extends BaseTestClass {
    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();

    @Test(testName = "Verify employee data update")
    public void putEmployee() {
        Employees updatedEmployee = EmployeeRepository.createEmployeeWithId2();
        HttpEntity<Employees> requestUpdate = new HttpEntity<>(updatedEmployee, headers);
        ResponseEntity<Employees> responseEntity = restTemplate.exchange(putUserUrlById(2), HttpMethod.PUT, requestUpdate, Employees.class);

        //To see the requested data
        System.out.println(requestUpdate.getBody());
        //To see response data
        System.out.println(responseEntity.getBody());

        Assert.assertEquals(responseEntity.getBody().getName(), requestUpdate.getBody().getName());
        Assert.assertEquals(responseEntity.getBody().getJob(), requestUpdate.getBody().getJob());
        Assert.assertNotEquals(responseEntity.getBody().getUpdatedAt(), requestUpdate.getBody().getUpdatedAt());

    }
}
