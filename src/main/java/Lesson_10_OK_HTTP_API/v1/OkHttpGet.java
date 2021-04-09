package Lesson_10_OK_HTTP_API.v1;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static Lesson_10_OK_HTTP_API.v1.UrlController.getStudentUrl;

public class OkHttpGet {
    OkHttpClient client = new OkHttpClient();

    public String run(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        OkHttpGet example = new OkHttpGet();
        String response = example.run(getStudentUrl);
        System.out.println(response);
    }
}
