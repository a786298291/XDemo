package cool.suzi.demo.controller;

import cool.suzi.demo.dao.VideoDao;
import cool.suzi.demo.domain.Video;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
@AutoConfigureMockMvc
public class VideoTest {
    @Autowired
    private MockMvc mockMvc;
    //@Autowired
   // private VideoDao videoDao;
    //@Test
    public void videoListTest() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/video/listvideo")).
                andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);
        String contentAsString = mvcResult.getResponse().getContentAsString();
        System.out.println(contentAsString);

    }
    @Test
    public void findByIdTest(){


    }
}
