package Lesson_10_RestTemplate.ReqresAPI.userRepository;

import Lesson_10_RestTemplate.ReqresAPI.dataModels.UserInfo;

import static Lesson_10_RestTemplate.ReqresAPI.userRepository.DataRepository.createDataWithId7;
import static Lesson_10_RestTemplate.ReqresAPI.userRepository.SupportRepository.createSupport;

public class UserRepository {

    public static UserInfo createUserWithId7 (){
        UserInfo expectedUserId7 = new UserInfo();
        expectedUserId7.setData(createDataWithId7());
        expectedUserId7.setSupport(createSupport());
        return expectedUserId7;
    }


}
