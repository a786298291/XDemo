package cool.suzi.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 应用上下文监听器
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("applicationListener init ......");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("applicationListener destroy ......");
    }
}
