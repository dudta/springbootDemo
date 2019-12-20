package com.bys.ots;

import com.bys.ots.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebAppConfiguration // 开启web应用配置
@SpringBootTest
public class SpringbootDemoApplicationTests
{
    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void hello() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders
                        .get("/v1/helloword")
                        .accept(MediaType.APPLICATION_JSON_UTF8)
        )
                .andExpect(status().isOk()) // 用于判断返回的期望值
                .andExpect(content().string(equalTo("{\"code\":\"200\",\"msg\":\"ok\",\"data\":\"Helloword\"}")));

    }
}



