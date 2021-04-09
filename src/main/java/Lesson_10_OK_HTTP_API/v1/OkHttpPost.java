package Lesson_10_OK_HTTP_API.v1;

import okhttp3.*;

import java.io.IOException;

public class OkHttpPost {
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    OkHttpClient client = new OkHttpClient();

    String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(JSON, json);
        Request request = new Request.Builder().url(url).post(body).build();
        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        OkHttpPost example = new OkHttpPost();
        String json = "{\r\n" +
                " \"name\" : \"Pavlo\",\r\n" +
                " \"email\" : \"pavlok@gmail.com\",\r\n" +
                " \"dob\" : \"1993-06-06\"\r\n" +
                "}";
        System.out.println(json);

        String response = example.post("http://localhost:8080/api/v1/student/", json);
        System.out.println(response);
    }
}
