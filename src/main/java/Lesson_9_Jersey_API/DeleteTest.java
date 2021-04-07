package Lesson_9_Jersey_API;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DeleteTest {
    @Test
    void post_data_student() {

        given().
                header("Content-Type","application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
            when().
                delete("http://localhost:8080/api/v1/student/1").
            then().
                statusCode(200);
    }
}
