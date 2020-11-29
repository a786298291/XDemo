package cool.suzi.demo.service;

import cool.suzi.demo.model.entity.Video;
import cool.suzi.demo.model.entity.VideoBanner;

import java.util.List;


public interface VideoService {
    public List<Video> listVideo();

    Video findVideoById(Integer i);

    List<VideoBanner> listVideoBanner();
}
