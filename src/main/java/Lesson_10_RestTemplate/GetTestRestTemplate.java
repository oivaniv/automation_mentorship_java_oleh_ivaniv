package Lesson_10_RestTemplate;

import Lesson_8_QueryDSL.student.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import java.util.List;

import static Lesson_10_RestTemplate.UrlController.getStudentUrl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class GetTestRestTemplate {

    static RestTemplate restTemplate = new RestTemplate();

    @Test
    public void getTest() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<String> responseEntity
                = restTemplate.exchange(getStudentUrl,
                HttpMethod.GET,
                requestEntity,
                String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);

        String responseEntityBody = responseEntity.getBody();
        System.out.println("Response body is: " + responseEntityBody);

        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void getStudentAndParse() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<Student[]> responseEntity
                = restTemplate.exchange(getStudentUrl,
                HttpMethod.GET,
                requestEntity,
                Student[].class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);

        Student[] student = responseEntity.getBody();
        System.out.println("Student object is: " + student);

        assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void getStudentByBaeldung(){
        ResponseEntity<String> response
                = restTemplate.getForEntity(getStudentUrl, String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test
    public void getStudentByBaeldungAndCheckValue() throws JsonProcessingException {
        ResponseEntity<String> response
                = restTemplate.getForEntity(getStudentUrl, String.class);
        System.out.println(response.getStatusCode());
        System.out.println(response.getBody());

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode name = root.path("name");
        assertThat(name.asText(), notNullValue());
    }

    @Test
    public void getStudentByBaeldungAndParse() throws JsonProcessingException {
        Students[] students
                = restTemplate.getForObject(getStudentUrl, Students[].class);

        System.out.println(students);
        //Need to investigate why no students as the string

    }
    @Test
    public void getStudentByBaeldungAndParseAsList() throws JsonProcessingException {
        List students
                = restTemplate.getForObject(getStudentUrl, List.class);

        System.out.println(students);

    }
}
