package cool.suzi.demo.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 会话监听器
 *
 */
@WebListener
public class CustomSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("CustomRequestListener Created ...... ");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("CustomRequestListener Destroyed.........");
    }
}
