package Lesson_10_RestTemplate.ReqresAPI.userRepository;

import Lesson_10_RestTemplate.ReqresAPI.dataModels.Data;

public class DataRepository {
    public static Data createDataWithId7() {
        Data expectedDataId7 = new Data();
        expectedDataId7.setId(7);
        expectedDataId7.setEmail("michael.lawson@reqres.in");
        expectedDataId7.setFirst_name("Michael");
        expectedDataId7.setLast_name("Lawson");
        expectedDataId7.setAvatar("https://reqres.in/img/faces/7-image.jpg");
        return expectedDataId7;
    }
}
