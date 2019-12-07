package com.bys.ots;



import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;




@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDemoApplicationTests
{
    @Test
    public void contextLoads()
    {


    }
    public static void main(String[]args){
        String  s  = "   ";
        String  ss  = "   ";
        System.out.println(StringUtils.isEmpty(s));
        System.out.println(StringUtils.isBlank(ss));
    }
}



