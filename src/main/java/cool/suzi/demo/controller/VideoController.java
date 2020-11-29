package cool.suzi.demo.controller;

import cool.suzi.demo.model.entity.Video;
import cool.suzi.demo.model.entity.VideoBanner;
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
    public JsonData findVideo(){

        Video video = videoService.findVideoById(30);
        return JsonData.buildSuccess(video);
    }

    @RequestMapping("/listVideoBanner")
    public JsonData listVideoBanner(){

        List<VideoBanner> listVideoBanner = videoService.listVideoBanner();
        return JsonData.buildSuccess(listVideoBanner);
    }

    @RequestMapping("/listVideo")
    public JsonData listVideo(){

        List<Video> listVideo = videoService.listVideo();
        
        return JsonData.buildSuccess(listVideo);
    }

}
