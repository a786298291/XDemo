package cool.suzi.demo.controller;

import cool.suzi.demo.domain.Video;
import cool.suzi.demo.service.VideoService;
import cool.suzi.demo.util.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pri/video")
public class VideoController {
    @Autowired
    private VideoService videoService;


    @RequestMapping("/findVideo")
    public JsonData listVideo(){

        Video video = videoService.findVideoById(30);
        return JsonData.buildSuccess(video);
    }
}
