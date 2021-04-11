package Lesson_4.calculator.test;

import Lesson_10_RestTemplate.StudentsRepository;
import Lesson_8_QueryDSL.student.Student;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static Lesson_10_RestTemplate.UrlController.getStudentUrl;
import static Lesson_10_RestTemplate.UrlController.postStudentUrl;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class PutTestRestTemplate {
    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();

    @Test
    public void putStudentbyBaedung() {
        Student updatedStudent = StudentsRepository.createStudent("NewTest", "newTest@gmail.com", LocalDate.of(1999, 01, 01));
        String updateUrl = getStudentUrl + "/18";
        HttpEntity<Student> requestUpdate = new HttpEntity<>(updatedStudent, headers);
        restTemplate.exchange(updateUrl, HttpMethod.PUT, requestUpdate, Void.class);
    }

    @Test
    public void postTest() {
        HttpEntity<Object> requestEntity = new HttpEntity<>(StudentsRepository.createPredefinedStudent(), headers);
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity = restTemplate.exchange(getStudentUrl+"/20",
                HttpMethod.PUT,
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
}
