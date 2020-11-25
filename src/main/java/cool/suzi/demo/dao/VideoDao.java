package cool.suzi.demo.dao;

import cool.suzi.demo.domain.Video;
import cool.suzi.demo.domain.VideoBanner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoDao {
    /**
     * 根据ID查询视频信息
     * @param id
     * @return
     */
    public Video findById(@Param("video_id") Integer id);

    /**
     * 查询所有轮播图信息
     * @return
     */
    public List<VideoBanner> listVideoBanner();

    /**
     * 获取所有video相关信息
     * @return
     */
    public List<Video> listVideo();
}
