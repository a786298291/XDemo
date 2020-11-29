package cool.suzi.demo.task;

import cool.suzi.demo.model.entity.User;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Async
public class AsyncTask {
    public void task1(){
        try {
            Thread.sleep(4000);
            System.out.println("task1...........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void task2(){
        try {
            Thread.sleep(4000);
            System.out.println("task2...........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void task3(){
        try {
            Thread.sleep(4000);
            System.out.println("task3...........");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public Future<String> task4(){
        try {
            Thread.sleep(4000);
            System.out.println("task4...........");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<String>("task4 result");
    }
    public Future<User> task5(){
        try {
            Thread.sleep(4000);
            System.out.println("task5...........");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new AsyncResult<User>(new User("root","123","123456789"));
    }
}
