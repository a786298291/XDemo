package cool.suzi.demo.service.impl;

import cool.suzi.demo.dao.VideoDao;
import cool.suzi.demo.model.entity.Video;
import cool.suzi.demo.model.entity.VideoBanner;
import cool.suzi.demo.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoDao videoDao;

    /**
     * 获取video所有相关信息
     * @return
     */
    @Override
    public List<Video> listVideo() {
       return videoDao.listVideo();
    }

    /**
     * 查询指定id的视频信息
     * @param id
     * @return
     */
    @Override
    public Video findVideoById(Integer id){
        return videoDao.findById(id);
    }

    /**
     * 查询视频轮播图信息
     * @return
     */
    @Override
    public List<VideoBanner> listVideoBanner() {
        return videoDao.listVideoBanner();

    }
}
