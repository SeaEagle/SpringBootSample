package cn.eaglefire.app.demo.starter.springbootwithdubbostarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by eagle on 2016/11/4.
 */
@SpringBootApplication
public class SpringBootWithDubboStarterApplication {

    protected static Logger logger = LoggerFactory.getLogger(SpringBootWithDubboStarterApplication.class);

    public static void main(String[] args){
        logger.info("SpringBootWithDubboStarterApplication Start.");
        SpringApplication application = new SpringApplication(SpringBootWithDubboStarterApplication.class);
        application.run(args);
    }

}
