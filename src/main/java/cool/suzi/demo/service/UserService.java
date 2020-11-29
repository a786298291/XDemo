package cool.suzi.demo.service;


import java.util.Map;

public interface UserService {

    public Integer register(Map userInfo);
    public String login(String phone,String password);
}
