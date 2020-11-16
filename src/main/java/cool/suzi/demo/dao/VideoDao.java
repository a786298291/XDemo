package cool.suzi.demo.dao;

import cool.suzi.demo.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoDao {
    public Video findById(@Param("video_id") int id);
}
