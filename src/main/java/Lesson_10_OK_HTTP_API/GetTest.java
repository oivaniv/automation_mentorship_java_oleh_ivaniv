package Lesson_10_OK_HTTP_API;

import okhttp3.*;
import org.testng.annotations.Test;

import java.io.IOException;

import static Lesson_10_OK_HTTP_API.UrlController.getStudentUrl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.fail;

public class GetTest {
    OkHttpClient client = new OkHttpClient();

    //Synchronous GET
    @Test
    public void whenGetRequest_thenCorrect() throws IOException {
        Request request = new Request.Builder()
                .url("http://localhost:8080/api/v1/student/")
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();


        assertThat(response.code(), equalTo(200));

        System.out.println(response.body().string());
    }
    //Asynchronous GET

    @Test
    public void whenAsynchronousGetRequest_thenCorrect() {
        Request request = new Request.Builder()
                .url(getStudentUrl)
                .get()
                .build();
        Call call = client.newCall(request);
        call.enqueue(new Callback() {

            public void onResponse(Call call, Response response)
                    throws IOException {
                assertThat(response.code(), equalTo(200));
            }

            public void onFailure(Call call, IOException e) {
            }
        });
    }
}
