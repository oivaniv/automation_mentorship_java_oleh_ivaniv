package lesson_9_REST_Assured;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

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
