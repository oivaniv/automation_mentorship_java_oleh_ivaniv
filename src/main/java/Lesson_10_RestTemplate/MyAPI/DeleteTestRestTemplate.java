package Lesson_10_RestTemplate.MyAPI;

import Lesson_8_QueryDSL.student.Student;
import org.springframework.http.*;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import static Lesson_10_RestTemplate.MyAPI.UrlController.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeleteTestRestTemplate {
    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();


    @Test(testName = "Attempt to delete not existing student", expectedExceptions = HttpServerErrorException.class)
    public void deleteStudentbyBaedung() {
        String entityUrl = deleteStudentByIdUrl(17);
        restTemplate.delete(entityUrl);
    }

    @Test
    public void deleteTest() {
        HttpEntity<Student> requestEntity = null;
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity = restTemplate.exchange(deleteStudentByIdUrl(21),
                HttpMethod.DELETE,
                requestEntity,
                String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);
    }

}
