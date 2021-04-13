package lesson_10_RestTemplate.ReqresAPI.tests;

import lesson_10_RestTemplate.ReqresAPI.dataModels.Data;
import lesson_10_RestTemplate.ReqresAPI.dataModels.UserInfo;
import lesson_10_RestTemplate.ReqresAPI.dataModels.UserInfoList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import static lesson_10_RestTemplate.ReqresAPI.UrlController.getAllUsersListUrl;
import static lesson_10_RestTemplate.ReqresAPI.UrlController.getUserUrlById;
import static lesson_10_RestTemplate.ReqresAPI.userRepository.DataRepository.createDataWithId7;
import static lesson_10_RestTemplate.ReqresAPI.userRepository.UserRepository.createUserWithId7;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetTestRestTemplate extends BaseTestClass {

    static RestTemplate restTemplate = new RestTemplate();

    @Test(testName = "Verify existence of user data with id = 2")
    public void verifyGETUserByIdExist() {
        ResponseEntity<String> response
                = restTemplate.getForEntity(getUserUrlById(2), String.class);
        System.out.println("Status code is: " + response.getStatusCode());
        System.out.println("Raw body value is: " + response.getBody());

        Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);
    }

    @Test(testName = "Verify name of user with id = 2 by JsonNode")
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

    @Test(testName = "Show all data of user with ID 7")
    public void showUsersIdAndParse() {
        UserInfo actualUserData
                = restTemplate.getForObject(getUserUrlById(7), UserInfo.class);
        System.out.println("All user data info from JSON: " + actualUserData);
    }

    @Test(testName = "Verify user data with id = 7")
    public void showUserAndParseFields() {
        UserInfo actualUserData
                = restTemplate.getForObject(getUserUrlById(7), UserInfo.class);
        System.out.println("User info from JSON: " + actualUserData);

        //First way to show user data by fields
        System.out.println("***First way to show user data***");
        System.out.println("id: " + actualUserData.getData().getId());
        System.out.println("email: " + actualUserData.getData().getEmail());
        System.out.println("first_name: " + actualUserData.getData().getFirst_name());
        System.out.println("last_name: " + actualUserData.getData().getLast_name());
        System.out.println("avatar: " + actualUserData.getData().getAvatar());

        System.out.println("***Second way to show user data***");
        System.out.println("User data is: " + actualUserData.getData());
    }

    @Test(testName = "Verify actual full user data with id 7 equal expected full user with id 7")
    public void verifyUserDataEqualExpectedData() {
        UserInfo actualUserData
                = restTemplate.getForObject(getUserUrlById(7), UserInfo.class);
        System.out.println("Actual user data is: " + actualUserData);

        UserInfo expectedUserData;
        expectedUserData = createUserWithId7();
        System.out.println("Expected user data is: " + expectedUserData);

        Assert.assertEquals(actualUserData, expectedUserData);
    }

    @Test(testName = "Verify actual user data with id 7 equal expected user with id 7")
    public void verifyUserFullInfoEqualExpectedFullInfo() {
        UserInfo actualUserData
                = restTemplate.getForObject(getUserUrlById(7), UserInfo.class);

        Data actualUser;
        actualUser = actualUserData.getData();
        System.out.println("Actual user data is: " + actualUser);

        Data expectedUser;
        expectedUser = createDataWithId7();
        System.out.println("Expected user data is: " + expectedUser);

        Assert.assertEquals(actualUser, expectedUser);
    }

    @Test(testName = "Show all users data via GET API call")
    public void showAllUsersList() {
        UserInfoList response = restTemplate.getForObject(getAllUsersListUrl, UserInfoList.class);
        System.out.println("Data for all users is shown: " + response);
    }

    @Test(testName = "Show one user data via GET API call from list of the users")
    public void showAllUsersAndParseOneByOne() {
        int i = 0;
        UserInfoList response = restTemplate.getForObject(getAllUsersListUrl, UserInfoList.class);

        while (i < response.getData().size()) {
            System.out.println("Data for user with id " + response.getData().get(i).getId() + " is shown: " + response.getData().get(i));
            i++;
        }
    }

    @Test(testName = "Verify actual user data equal expected user data from all users list")
    public void verifyActualUserEqualExpectedUserFromAllUsersList() {
        UserInfoList response = restTemplate.getForObject(getAllUsersListUrl, UserInfoList.class);

        Data actualUser;
        actualUser = response.getData().get(0);
        System.out.println("Actual user data is: " + actualUser);

        Data expectedUser;
        expectedUser = createDataWithId7();
        System.out.println("Expected user data is: " + expectedUser);

        Assert.assertEquals(actualUser, expectedUser);
    }
}
