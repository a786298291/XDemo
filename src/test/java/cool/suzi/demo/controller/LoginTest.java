package cool.suzi.demo.controller;

import cool.suzi.demo.domain.User;
import cool.suzi.demo.domain.Video;
import cool.suzi.demo.service.VideoService;
import cool.suzi.demo.util.JsonData;
import javafx.scene.media.VideoTrack;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

@SpringBootTest

public class LoginTest {
    @Autowired
    private UserController userController;
    @Autowired
    private VideoService videoService;


    public void  login(){
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
    }
    @Test
    public void  testVideoListApi(){
        List<Video> videoList = videoService.listVideo();
        System.out.println(videoList);
    }
}
