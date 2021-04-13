package Lesson_10_RestTemplate.ReqresAPI.userRepository;

import Lesson_10_RestTemplate.ReqresAPI.dataModels.Data;
import Lesson_10_RestTemplate.ReqresAPI.dataModels.Support;

public class SupportRepository {
    public static Support createSupport() {
        Support expectedSupport = new Support();
        expectedSupport.setUrl("https://reqres.in/#support-heading");
        expectedSupport.setText("To keep ReqRes free, contributions towards server costs are appreciated!");
        return expectedSupport;
    }
}
