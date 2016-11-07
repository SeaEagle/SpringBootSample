package cn.eaglefire.app.demo.provider.springbootwithdubboproviderplain;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * Created by eagle on 2016/11/2.
 */
@SpringBootApplication
//@ImportResource(locations = {"classpath:META-INF/dubboService.xml"})
public class SpringBootWithDubboProviderPlainApplication {

    private static Logger logger = Logger.getLogger(SpringBootWithDubboProviderPlainApplication.class);

    public static void main(String[] args) throws IOException {

        logger.info("SpringApplication Starting.");
        SpringApplication.run(SpringBootWithDubboProviderPlainApplication.class, args);
        logger.info("SpringApplication Finish.");

        //
        //Runtime.getRuntime().addShutdownHook(new ApplicationShutdownHook());

    }

}
