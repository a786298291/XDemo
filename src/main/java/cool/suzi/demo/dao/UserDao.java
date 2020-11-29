package cool.suzi.demo.dao;

import cool.suzi.demo.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    /**
     * 根据ID查询视频信息
     * @param user
     * @return
     */
    public Integer save(User user);

    /**
     * 用户登录查询，根据手机号和密码查询
     * @param phone
     * @param password
     * @return
     */
    public User findPhoneAndPwd(@Param("phone") String phone,@Param("password") String password);

}
