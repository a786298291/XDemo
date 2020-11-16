package cool.suzi.demo.service.impl;

import cool.suzi.demo.domain.User;
import cool.suzi.demo.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class LoginServiceImpl implements LoginService {

    static public Map<String,User> userMap = new HashMap<>();
    @Override
    public String login(String user, String password) {
        UUID token = UUID.randomUUID();
        userMap.put(token.toString(),new User(user,password,token.toString()));
        return token.toString();
    }
}
