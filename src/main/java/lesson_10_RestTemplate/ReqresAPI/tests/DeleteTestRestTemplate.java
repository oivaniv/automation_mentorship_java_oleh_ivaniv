package lesson_10_RestTemplate.ReqresAPI.tests;

import lesson_8_QueryDSL.student.Student;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import static lesson_10_RestTemplate.ReqresAPI.UrlController.deleteUserByIdUrl;

public class DeleteTestRestTemplate {
    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();

    //First solution
    @Test(testName = "Attempt to delete not existing student")
    public void deleteExistingUser() {
        String entityUrl = deleteUserByIdUrl(2);
        restTemplate.delete(entityUrl);
        // Can't find the solution to assert status code.
    }


    @Test
    public void deleteTest() {
        HttpEntity<Student> requestEntity = null;
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity = restTemplate.exchange(deleteUserByIdUrl(2),
                HttpMethod.DELETE,
                requestEntity,
                String.class);
        HttpStatus httpStatusCode = responseEntity.getStatusCode();
        System.out.println("The status code is: " + httpStatusCode);
    }

}
