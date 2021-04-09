package Lesson_9_REST_Assured;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class GetTest {
    Response response = get("http://localhost:8080/api/v1/student/");

//    @Test
//    void get_test_00() {
//
//        System.out.println("*********GET RESPONSE**********");
//        System.out.println(response.asString());
//        System.out.println();
//
//        System.out.println("*********GET BODY**********");
//        System.out.println(response.getBody().asString());
//        System.out.println();
//
//        System.out.println("*********GET STATUS CODE**********");
//        System.out.println(response.getStatusCode());
//        System.out.println();
//
//    }

    @Test
    void get_status_code_test() {
        int statusCode = response.statusCode();
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    void get_first_user_id_test() {

        given()
                .response()
                .then()
                .statusCode(200)
                .body("id[0]",equalTo(1));
    }

    @Test
    void get_first_user_info_test() {

        given()
                .response()
                .then()
                .statusCode(200)
                .body("id[0]", equalTo(2))
                .body("name[0]", equalTo("Oleh"))
                .body("email[0]", equalTo("oleh.ivaniv.96@gmail.com"))
                .body("dob[0]",equalTo("1996-07-01"))
                .body("age[0]",equalTo(25));
    }

}