package cool.suzi.demo.controller;

import cool.suzi.demo.domain.Video;
import cool.suzi.demo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {
    @Autowired
    private VideoService videoService;
    @RequestMapping("/listvideo")
    public List<Video> listVideo(){

        List<Video> list = videoService.listVideo();
        return list;
    }
}
