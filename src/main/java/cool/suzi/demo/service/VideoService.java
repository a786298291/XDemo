package cool.suzi.demo.service;

import cool.suzi.demo.domain.Video;

import java.util.List;


public interface VideoService {
    public List<Video> listVideo();

    Video findVideoById(Integer i);
}
