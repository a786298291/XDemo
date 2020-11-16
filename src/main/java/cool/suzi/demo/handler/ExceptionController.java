package cool.suzi.demo.handler;

import cool.suzi.demo.util.JsonData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {Exception.class})
    ModelAndView exceptionHtml(Exception e, HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error/error.html");
        modelAndView.addObject("exception",e.getMessage());
        return modelAndView;
    }
}
