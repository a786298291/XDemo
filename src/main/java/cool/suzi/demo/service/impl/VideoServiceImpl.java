package cool.suzi.demo.service.impl;

import cool.suzi.demo.dao.VideoDao;
import cool.suzi.demo.domain.Video;
import cool.suzi.demo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoDao videoDao;
    @Override
    public List<Video> listVideo() {
        List<Video> list = new ArrayList<Video>();
        /*list.add(new Video("LOL",12,"mp4"));
        list.add(new Video("footboas",22,"fly"));*/

        return list;
    }
    public Video findVideoById(Integer id){
        return videoDao.findById(id);
    }
}
