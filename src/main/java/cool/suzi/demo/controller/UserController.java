package cool.suzi.demo.controller;

import cool.suzi.demo.model.request.LoginRequest;
import cool.suzi.demo.service.LoginService;
import cool.suzi.demo.service.UserService;
import cool.suzi.demo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/pri/user")
public class UserController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public JsonData login(@RequestBody LoginRequest loginRequest){
        if (StringUtils.isEmpty(loginRequest.getPhone()) || StringUtils.isEmpty(loginRequest.getPassword())){

            return JsonData.buildError("用户名或密码为空，请重新输入！",-1);

        }else {
            String token = userService.login(loginRequest.getPassword(), loginRequest.getPassword());
            return token == null ? JsonData.buildError("用户名或密码错误，请重新输入") : JsonData.buildSuccess(token);
/*            String token = loginService.login(user.getName(), user.getPassword());
            return token != null ? JsonData.buildSuccess(token):JsonData.buildError("账号密码错误");*/

        }
    }
    @PostMapping("/register")
    public JsonData register(@RequestBody Map<String,String> userInfo){
        if (userInfo.containsKey("username") && userInfo.containsKey("password") && userInfo.containsKey("phone")){
            Integer row = userService.register(userInfo);
            return row ==1 ? JsonData.buildSuccess(row) : JsonData.buildError("注册失败，请稍后再试！");
        }else {
            return JsonData.buildError("注册信息有误，请重新输入！");
        }

    }
}
