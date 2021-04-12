package Lesson_10_RestTemplate.ReqresAPI;

import Lesson_10_RestTemplate.MyAPI.StudentsRepository;
import Lesson_8_QueryDSL.student.Student;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import java.net.URI;

import static Lesson_10_RestTemplate.MyAPI.UrlController.postStudentUrl;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostTestRestTemplate {
    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();


    //The postForObject() API
    @Test
    public void postStudentbyBaedung() {
        HttpEntity<Student> request = new HttpEntity<>(StudentsRepository.createPredefinedStudent());

        Student students = restTemplate.postForObject(postStudentUrl, request, Student.class);

        System.out.println("***************");
        System.out.println(request.toString());
        System.out.println("***************");
        System.out.println(request.getBody());
        System.out.println("***************");
        System.out.println(students);
        System.out.println("***************");
        assertThat(students, notNullValue());
        assertThat(students.getName(), is("UserFromConstructor"));
    }

    //The postForLocation() API
    @Test
    public void postStudentbyBaedung1() {
        HttpEntity<Student> request = new HttpEntity<>(StudentsRepository.createPredefinedStudent());

        URI location = restTemplate.postForLocation(postStudentUrl, request);

        System.out.println("***************");
        System.out.println(request.toString());
        System.out.println("***************");
        System.out.println(request.getBody());
        System.out.println("***************");
        System.out.println(location);
        System.out.println("***************");
        assertThat(location, notNullValue());
    }

    @Test
    public void postStudentbyBaedung2() {
        HttpEntity<Student> request = new HttpEntity<>(StudentsRepository.createPredefinedStudent());
        ResponseEntity<Student> responseEntity = restTemplate.exchange(postStudentUrl, HttpMethod.POST, request, Student.class);

        System.out.println("***************");
        System.out.println(request.getBody());
        System.out.println("***************");
        System.out.println(responseEntity.getBody());
        //null - cause my API doesn't return value after call
        System.out.println("***************");
        assertThat(responseEntity.getStatusCode(), is(HttpStatus.OK));

    }


    @Test
    public void postTest() {
        HttpEntity<Object> requestEntity = new HttpEntity<>(StudentsRepository.createPredefinedStudent(), headers);

        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity = restTemplate.exchange(postStudentUrl,
                HttpMethod.POST,
                requestEntity,
                String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);

        String responseEntityBody = responseEntity.getBody();
        System.out.println("Response body is: " + responseEntityBody);

        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("Response header is: " + responseHeaders);


        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
    }

    //The postForEntity() API
    @Test
    public void postStudent() {

        ResponseEntity<String> responseEntity = restTemplate.postForEntity(postStudentUrl, StudentsRepository.createPredefinedStudent(),String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);

        String responseEntityBody = responseEntity.getBody();
        System.out.println("Response body is: " + responseEntityBody);

        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("Response header is: " + responseHeaders);

    }
}
