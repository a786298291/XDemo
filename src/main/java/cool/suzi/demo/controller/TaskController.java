package cool.suzi.demo.controller;

import cool.suzi.demo.model.entity.User;
import cool.suzi.demo.task.AsyncTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@RestController
@RequestMapping("/taskcontroller")
public class TaskController {
    @Autowired
    private AsyncTask asyncTask;

    @RequestMapping("/taskTest")
    public String taskTest(){

        Future<String> sFuture = asyncTask.task4();
        Future<User> userF = asyncTask.task5();
        if (sFuture.isDone() && userF.isDone()){
            try {
                String s = sFuture.get();
                User user1 = userF.get();
                return user1+s;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return "error";

    }
}
