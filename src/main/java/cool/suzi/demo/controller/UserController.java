package cool.suzi.demo.controller;

import cool.suzi.demo.domain.User;
import cool.suzi.demo.service.LoginService;
import cool.suzi.demo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public JsonData login(User user){
        if (StringUtils.isEmpty(user.getName()) || StringUtils.isEmpty(user.getPassword())){

            return JsonData.buildError("用户名或密码为空，请重新输入！",-1);

        }else {
            String token = loginService.login(user.getName(), user.getPassword());
            return token != null ? JsonData.buildSuccess(token):JsonData.buildError("账号密码错误");

        }
    }
    @RequestMapping("/register")
    public JsonData register(@RequestParam Map<String,String> userInfo){
        if (userInfo.containsKey("username") && userInfo.containsKey("password") && userInfo.containsKey("phone")){

        }
        return JsonData.buildSuccess("OK");
    }
}
