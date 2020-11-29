package cool.suzi.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

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
