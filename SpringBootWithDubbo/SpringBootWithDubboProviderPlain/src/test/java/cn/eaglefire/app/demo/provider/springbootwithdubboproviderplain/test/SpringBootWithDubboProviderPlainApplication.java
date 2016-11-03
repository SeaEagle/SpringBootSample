package cn.eaglefire.app.demo.provider.springbootwithdubboproviderplain.test;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by eagle on 2016/11/3.
 */
@SpringBootApplication
public class SpringBootWithDubboProviderPlainApplication {

    private static Logger logger = Logger.getLogger(SpringBootWithDubboProviderPlainApplication.class);

    public static void main(String[] args){

        logger.info("SpringApplication Starting.");
        SpringApplication.run(cn.eaglefire.app.demo.provider.springbootwithdubboproviderplain.SpringBootWithDubboProviderPlainApplication.class, args);
        logger.info("SpringApplication Finish.");

        //
        //Runtime.getRuntime().addShutdownHook(new ApplicationShutdownHook());

    }

}
