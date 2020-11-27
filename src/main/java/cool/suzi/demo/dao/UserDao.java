package cool.suzi.demo.dao;

import cool.suzi.demo.domain.User;
import cool.suzi.demo.domain.Video;
import cool.suzi.demo.domain.VideoBanner;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 根据ID查询视频信息
     * @param user
     * @return
     */
    public Integer save(@Param("user") User user);

}
