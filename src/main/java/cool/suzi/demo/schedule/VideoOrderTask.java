package cool.suzi.demo.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class VideoOrderTask {
    //@Scheduled(fixedRate = 2000)  //开启注解即可实现定时操作
    public void sum(){
        System.out.println(LocalDateTime.now()+"当前交易="+new Random().ints(100,10000));
    }

}
