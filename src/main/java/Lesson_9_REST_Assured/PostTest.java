package Lesson_9_REST_Assured;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class PostTest {
    Response response = get("http://localhost:8080/api/v1/student/");

    @Test
    void post_data_student() {
        Map<String,Object> map = new HashMap<>();
        map.put("name","Ostap");
        map.put("email", "ofos@gmail.com");
        map.put("dob","1991-01-12");

        JSONObject request = new JSONObject(map);
        System.out.println(request);

        given().
            header("Content-Type","application/json").
            contentType(ContentType.JSON).
            accept(ContentType.JSON).
            body(request.toJSONString()).
        when().
            post("http://localhost:8080/api/v1/student/").
        then().
            statusCode(200);
    }
}

