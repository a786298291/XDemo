package cool.suzi.demo.service.impl;

import cool.suzi.demo.domain.Video;
import cool.suzi.demo.service.VideoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {
    @Override
    public List<Video> listVideo() {
        List<Video> list = new ArrayList<Video>();
        /*list.add(new Video("LOL",12,"mp4"));
        list.add(new Video("footboas",22,"fly"));*/

        return list;
    }
}
