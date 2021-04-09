package Lesson_10_OK_HTTP_API;

import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static Lesson_10_OK_HTTP_API.UrlController.postStudentUrl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostTest {
    OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    //Doesn't work due to issue ("status":415,"error":"Unsupported Media Type")
    @Test
    public void whenSendPostRequest_thenCorrect() throws IOException {
        RequestBody formBody = new FormBody.Builder()
                .add("name", "Petro")
                .add("email", "petro@gmail.com")
                .add("dob", "1990-09-09")
                .build();

        Request request = new Request.Builder()
                .addHeader("Content-Type", "application/json")
                .url(postStudentUrl)
                .post(formBody)
                .build();

        Call call = client.newCall(request);
        System.out.println(request);
        Response response = call.execute();

        System.out.println(response.body().string());

        assertThat(response.code(), equalTo(200));
    }

    @Test
    public void whenSendPostRequestWithJson() throws IOException {

        String json = "{\r\n" +
                " \"name\" : \"Petro\",\r\n" +
                " \"email\" : \"pet@gmail.com\",\r\n" +
                " \"dob\" : \"1983-06-06\"\r\n" +
                "}";
        RequestBody body = RequestBody.create(json, JSON);

        Request request = new Request.Builder()
                .url(postStudentUrl)
                .post(body)
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        System.out.println(json);

        assertThat(response.code(), equalTo(200));
    }
}
