/**
 * springboot启动类
 */
package com.bys.ots;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

/**
 * @author bairuihua
 *  2019/11/25
 */
@SpringBootApplication
public class SpringbootDemoApplication extends SpringBootServletInitializer
        implements CommandLineRunner
{

    @Autowired
    private ApplicationContext appContext;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
    {
        return application.sources(SpringbootDemoApplication.class);
    }

    public static void main(String[] args)
    {
      SpringApplication.run(SpringbootDemoApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception
    {
        String[] beans = appContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans)
        {
             //System.out.println(bean + " of Type :: " + appContext.getBean(bean).getClass());
        }
    }
}
