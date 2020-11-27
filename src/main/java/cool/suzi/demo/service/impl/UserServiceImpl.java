package cool.suzi.demo.service.impl;

import cool.suzi.demo.dao.UserDao;
import cool.suzi.demo.domain.User;
import cool.suzi.demo.service.UserService;
import cool.suzi.demo.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    private static final String [] headImg = {
            "https://xd-video-pc-img.oss-cn-beijing." +
                    "aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing." +
                    "aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing." +
                    "aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing." +
                    "aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing." +
                    "aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
            };

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(Map userInfo) {
        User user = new User();
        user.setName((String) userInfo.get("username"));
        //获取密码对密码进行MD5加密处理
        String pwd = (String) userInfo.get("password");
        user.setPassword(CommonUtil.MD5(pwd));
        user.setCreateTime(new Date());
        user.setHead_img(randomHead_img());
        user.setPhone((String) userInfo.get("phone"));
        user.setToken("123");
        Integer row = userDao.save(user);
        return row;
    }

    /**
     * 随机生成头像
     * @return
     */
    public String randomHead_img (){
        int size = headImg.length;
        Random random = new Random();
        int subnum = random.nextInt(size);
        return headImg[subnum];
    }

}
