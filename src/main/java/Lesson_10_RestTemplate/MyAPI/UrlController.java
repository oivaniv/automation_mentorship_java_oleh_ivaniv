package Lesson_10_RestTemplate.MyAPI;

public class UrlController {
    public final static String getStudentUrl = "http://localhost:8080/api/v1/student/";
    public final static String postStudentUrl = "http://localhost:8080/api/v1/student/";

    public static String deleteStudentByIdUrl(int id) {
        return "http://localhost:8080/api/v1/student/" + id;
    }
}
