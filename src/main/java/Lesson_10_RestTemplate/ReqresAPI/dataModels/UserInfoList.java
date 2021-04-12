package Lesson_10_RestTemplate.ReqresAPI.dataModels;

import java.util.ArrayList;
import java.util.List;

public class UserInfoList {

    private List<UserInfo> userInfo;

    public UserInfoList(){
        userInfo = new ArrayList<>();
    }

    public List<UserInfo> getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(List<UserInfo> userInfo) {
        this.userInfo = userInfo;
    }
}
