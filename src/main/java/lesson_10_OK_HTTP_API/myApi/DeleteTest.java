package lesson_10_OK_HTTP_API.myApi;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static lesson_10_OK_HTTP_API.myApi.UrlController.deleteStudentByIdUrl;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class DeleteTest {
    OkHttpClient client = new OkHttpClient();

    //Synchronous GET
    @Test
    public void whenGetRequest_thenCorrect() throws IOException {
        Request request = new Request.Builder()
                .url(deleteStudentByIdUrl(2))
                .delete()
                .build();

        Call call = client.newCall(request);
        Response response = call.execute();

        System.out.println(response.body().string());

        assertThat(response.code(), equalTo(200));

    }

}
