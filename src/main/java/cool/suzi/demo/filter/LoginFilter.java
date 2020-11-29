package cool.suzi.demo.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import cool.suzi.demo.model.entity.User;
import cool.suzi.demo.service.impl.LoginServiceImpl;
import cool.suzi.demo.util.JsonData;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebFilter(urlPatterns = "/api/v1/pri/*")
public class LoginFilter implements Filter {
    static private final ObjectMapper objectMap = new ObjectMapper();
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("LoginFilter init........");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("loginFilter is run....");
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        String token = resp.getHeader("token");
        if (StringUtils.isEmpty(token)){
            token = req.getParameter("token");
        }

        if (!StringUtils.isEmpty(token)){
            //判断token是否合法
            User usr = LoginServiceImpl.userMap.get(token);
            if (usr != null){
                chain.doFilter(req,resp);
            }else {
                JsonData jsonData = JsonData.buildError("登录失败，token无效", -2);
                renderJson(resp,objectMap.writeValueAsString(jsonData));
            }

        }else {
            JsonData jsonData = JsonData.buildError("未登录，请登录", -3);
            renderJson(resp,objectMap.writeValueAsString(jsonData));
        }
    }

    @Override
    public void destroy() {
        System.out.println("LoginFilter destroy........");

    }
    void renderJson(HttpServletResponse resp,String json){
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        try (PrintWriter writer = resp.getWriter()){
            writer.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
