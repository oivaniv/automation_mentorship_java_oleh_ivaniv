package Lesson_10_RestTemplate.ReqresAPI.tests;

import Lesson_10_RestTemplate.MyAPI.StudentsRepository;
import Lesson_10_RestTemplate.ReqresAPI.dataModels.Employees;
import Lesson_10_RestTemplate.ReqresAPI.userRepository.EmployeeRepository;
import Lesson_8_QueryDSL.student.Student;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URI;

import static Lesson_10_RestTemplate.MyAPI.UrlController.postStudentUrl;
import static Lesson_10_RestTemplate.ReqresAPI.UrlController.postUserUrl;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostTestRestTemplate {
    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();

    @Test
    public void postEmployeeByPostForObject() {
        HttpEntity<Employees> request = new HttpEntity<>(EmployeeRepository.createEmployeeWithId2());
        Employees actualEmployee = restTemplate.postForObject(postUserUrl, request, Employees.class);

        System.out.println("***************");
        System.out.println(request.getBody());
        System.out.println("***************");
        System.out.println(actualEmployee);
        System.out.println("***************");

        Assert.assertEquals(request.getBody().getName(), actualEmployee.getName());
        Assert.assertEquals(request.getBody().getJob(), actualEmployee.getJob());
        Assert.assertNotEquals(request.getBody().getCreatedAt(), actualEmployee.getCreatedAt());
    }

    //The exchange() API, in this case body is the string, and we can't equal the objects and their attributes.
    @Test
    public void postEmployeeByExchange() {
        HttpEntity<Object> requestEntity = new HttpEntity<>(EmployeeRepository.createEmployeeWithId2(), headers);

        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity = restTemplate.exchange(postUserUrl,
                HttpMethod.POST,
                requestEntity,
                String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);

        String responseEntityBody = responseEntity.getBody();
        System.out.println("Response body is: " + responseEntityBody);

        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("Response header is: " + responseHeaders);

        Assert.assertEquals(responseEntity.getStatusCode(), HttpStatus.CREATED);
    }

    //The postForEntity() API, in this case body is the string, and we can't equal the objects and their attributes.
    @Test
    public void postStudentByPostForEntity() {

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(postUserUrl, EmployeeRepository.createEmployeeWithId2(), String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);

        String responseEntityBody = responseEntity.getBody();
        System.out.println("Response body is: " + responseEntityBody);

        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("Response header is: " + responseHeaders);
    }
}
