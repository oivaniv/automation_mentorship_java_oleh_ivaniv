package lesson_9_REST_Assured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class PutTest {
    Response response = get("http://localhost:8080/api/v1/student/");

    @Test
    void put_data_student() {
        JSONObject request = new JSONObject();

        request.put("name", "Olegggg");

        System.out.println(request);

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                queryParam("name","Olegggggg").
                body(request.toJSONString()).
            when().
                put("http://localhost:8080/api/v1/student/1").
            then().
                statusCode(200).
                log().all();
    }
}
