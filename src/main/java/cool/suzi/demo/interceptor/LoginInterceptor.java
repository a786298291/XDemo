package cool.suzi.demo.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import cool.suzi.demo.util.JsonData;
import cool.suzi.demo.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)  {
        try {
            String accesToken = request.getHeader("token");
            if (accesToken == null){
                accesToken = request.getParameter("token");
            }
            if (StringUtils.isNotBlank(accesToken)){
                Claims claims = JwtUtils.checkJWT(accesToken);
                if (claims == null){
                    //提示用户过期，重新登录
                    writeJsonDate(request,response,JsonData.buildError("用户未登录，请重新登录"));
                }
                Integer id = (Integer) claims.get("id");
                String phone = (String) claims.get("phone");
                String name = (String) claims.get("name");
                request.setAttribute("id",id);
                request.setAttribute("phone",phone);
                request.setAttribute("name",name);
                return true;
            }
        } catch (Exception e) {
            //
            writeJsonDate(request,response,JsonData.buildError("用户未登录，请重新登录"));
            //e.printStackTrace();
        }
        writeJsonDate(request,response,JsonData.buildError("用户未登录，请重新登录"));
        return false;
    }

    /**
     * 返回页面Json信息
     * @param request
     * @param response
     * @param json
     * @throws IOException
     */
    public void writeJsonDate(HttpServletRequest request,HttpServletResponse response,Object json) {
        try {
            ObjectMapper objectMap = new ObjectMapper();
            response.setContentType("application/json;charset=utf8");
            PrintWriter writer = response.getWriter();
            writer.print(objectMap.writeValueAsString(json));
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor postHandler on.......");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginInterceptor afterCompletion on.......");
    }
}
