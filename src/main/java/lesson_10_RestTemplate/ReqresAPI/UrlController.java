package lesson_10_RestTemplate.ReqresAPI;

public class UrlController {
    public final static String defaultUrl = "https://reqres.in/api/users/";
    public final static String getAllUsersListUrl = "https://reqres.in/api/users?page=2";
    public final static String postUserUrl = "https://reqres.in/api/users/";

    public static String getUserUrlById(int id) {
        return defaultUrl + id;
    }

    public static String putUserUrlById(int id) {
        return defaultUrl + id;
    }

    public static String deleteUserByIdUrl(int id) {
        return defaultUrl + id;
    }



}
