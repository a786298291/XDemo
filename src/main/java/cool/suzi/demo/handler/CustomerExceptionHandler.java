package cool.suzi.demo.handler;

import cool.suzi.demo.util.JsonData;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class CustomerExceptionHandler {

    private final Logger logger = Logger.getLogger(CustomerExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public JsonData handler(Exception e){
        logger.error("[系统错误]{}",e);
        if (e instanceof XDException){
            XDException xdException = (XDException) e;
            return JsonData.buildError(xdException.getMsg(),xdException.getCode());
        }else {
            return JsonData.buildError("全局异常，未知错误！");
        }
    }
}
