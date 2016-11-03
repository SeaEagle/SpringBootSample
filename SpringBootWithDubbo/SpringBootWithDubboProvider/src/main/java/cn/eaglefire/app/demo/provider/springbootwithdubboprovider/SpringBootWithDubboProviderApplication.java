package cn.eaglefire.app.demo.provider.springbootwithdubboprovider;

import com.alibaba.dubbo.container.Main;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by eagle on 2016/11/2.
 */
@SpringBootApplication
public class SpringBootWithDubboProviderApplication {

    private static Logger logger = Logger.getLogger(SpringBootWithDubboProviderApplication.class);

    public static void main(String[] args){

        logger.info("SpringApplication Starting.");
        SpringApplication.run(SpringBootWithDubboProviderApplication.class, args);
        logger.info("SpringApplication Finish.");

//        logger.info("Dubbo Service Starting.");
//        Main.main(args);
//        logger.info("Dubbo Service Stop.");

        //
        //Runtime.getRuntime().addShutdownHook(new ApplicationShutdownHook());

    }

}
