package Lesson_10_RestTemplate.ReqresAPI;

import Lesson_10_RestTemplate.ReqresAPI.dataModels.UserInfo;
import Lesson_10_RestTemplate.ReqresAPI.dataModels.UserInfoList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static Lesson_10_RestTemplate.ReqresAPI.UrlController.getAllUsersListUrl;
import static Lesson_10_RestTemplate.ReqresAPI.UrlController.getUserUrlById;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;


public class GetTestRestTemplate {

    static RestTemplate restTemplate = new RestTemplate();
    static HttpHeaders headers = new HttpHeaders();

    @Test(testName = "Verify existence of user data with id = 2")
    public void verifyGETUserByIdExist() {
        ResponseEntity<String> response
                = restTemplate.getForEntity(getUserUrlById(2), String.class);
        System.out.println("Status code is: " + response.getStatusCode());
        System.out.println("Raw body value is: " + response.getBody());
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Test(testName = "Verify name of user with id = 2")
    public void verifyGETUserByIdInfo() throws JsonProcessingException {
        ResponseEntity<String> response
                = restTemplate.getForEntity(getUserUrlById(2), String.class);

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.getBody());
        JsonNode firstName = root.path("data").path("first_name");
        System.out.println("Raw body value is: " + root.toString());
        System.out.println("Name of user: " + firstName.asText());
        Assert.assertEquals(firstName.asText(), "Janet");
    }

    @Test(testName = "Verify user data with id = 2")
    public void verifyGETUserByIdAndParse() {
        UserInfo userInfo
                = restTemplate.getForObject(getUserUrlById(2), UserInfo.class);
        System.out.println(userInfo);
        //Need to investigate why no students as the string
        //Solution - need to add Arrays.toString, cause we receive array not the value.
    }

    //Solution 1 - to use DTO - doesn't work
    @Test(testName = "Verify user data with id = 2")
    public void verifyGETUserByIdAndParse1() {
        UserInfo userInfo
                = restTemplate.getForObject(getAllUsersListUrl, UserInfo.class);
        System.out.println(userInfo);
    }

    //Solution 2 - use List - doesn't work
    @Test(testName = "Verify all users")
    public void verifyGETAllUsersByIdAndParse() {
        List users
                = restTemplate.getForObject(getAllUsersListUrl, List.class);
        System.out.println(users);
        //Need to investigate why no students as the string
        //Solution - need to add Arrays.toString, cause we receive array not the value.
    }

    //Solution 3
    @Test(testName = "Verify all users")
    public void verifyGETAllUsersByIdAndParse1() {
        ResponseEntity<List> users = restTemplate.getForEntity(getAllUsersListUrl, List.class);
        System.out.println(users);
        HttpStatus statusCode = users.getStatusCode();
        System.out.println("Status code is: " + statusCode);
        List<Object> userDetails = users.getBody();
        System.out.println("Response body is: " + userDetails);
    }

    //Solution 4
    @Test(testName = "Verify all users")
    public void verifyGETAllUsersByIdAndParse4() {
        ResponseEntity<UserInfo[]> users = restTemplate.getForEntity(getAllUsersListUrl, UserInfo[].class);
        UserInfo[] userInfo = users.getBody();
        System.out.println("*************");
        System.out.println(users);
        System.out.println("*************");
        System.out.println("Response body is: " + userInfo);
        System.out.println("*************");
        HttpStatus statusCode = users.getStatusCode();
        System.out.println("Status code is: " + statusCode);
    }

    //Solution 5
    @Test(testName = "Verify all users")
    public void verifyGETAllUsersByIdAndParse5() {
        UserInfoList response = restTemplate.getForObject(getAllUsersListUrl,UserInfoList.class);
        List<UserInfo> users = response.getUserInfo();
        System.out.println("*************");
        System.out.println(users);
        System.out.println("*************");
        System.out.println("Response body is: " + users);
        System.out.println("*************");
    }

}
