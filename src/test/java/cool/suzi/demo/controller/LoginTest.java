package cool.suzi.demo.controller;

import cool.suzi.demo.model.entity.User;
import cool.suzi.demo.model.entity.Video;
import cool.suzi.demo.service.VideoService;
import cool.suzi.demo.util.JsonData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest

public class LoginTest {
    @Autowired
    private UserController userController;
    @Autowired
    private VideoService videoService;


  /*  public void  login(){
        User user = new User();
        user.setName("zi");
        user.setPassword("123");
        JsonData loginJson = userController.login(user);
        System.out.println(loginJson);
        //MockMvc mockMvc = new ;
    }
    @Test
    public void  testVideoList(){
        List<Video> videoList = videoService.listVideo();
        System.out.println(videoList);
    }*/
    @Test
    public void  testVideoListApi(){
        List<Video> videoList = videoService.listVideo();
        System.out.println(videoList);
    }
}
