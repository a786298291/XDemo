package cool.suzi.demo;

import cool.suzi.demo.dao.VideoDao;
import cool.suzi.demo.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@MapperScan("cool.suzi.demo.dao")
public class DemoApplication {

    public static void main(String[] args) {
        /*String resource = "config/mybatis-config";
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            VideoDao videoDao1 = sqlSession.getMapper(VideoDao.class);
            Video video = videoDao1.findById(30);
            System.out.println(video);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        SpringApplication.run(DemoApplication.class, args);
    }

}
