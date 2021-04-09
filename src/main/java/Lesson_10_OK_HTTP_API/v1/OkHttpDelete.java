package Lesson_10_OK_HTTP_API.v1;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import static Lesson_10_OK_HTTP_API.v1.UrlController.deleteStudentByIdUrl;

public class OkHttpDelete {
    OkHttpClient client = new OkHttpClient();

    public String run(String url) throws IOException {
        Request request = new Request.Builder().url(url).delete().build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public static void main(String[] args) throws IOException {
        OkHttpDelete example = new OkHttpDelete();
        String response = example.run(deleteStudentByIdUrl(1));
        System.out.println(response);
    }
}
