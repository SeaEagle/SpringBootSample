package cn.eaglefire.app.demo.provider.springbootwithdubboproviderplain;

import com.alibaba.dubbo.config.ProtocolConfig;
import org.apache.log4j.Logger;

/**
 * Created by eagle on 2016/11/3.
 */
public class ApplicationShutdownHook extends Thread {

    private static Logger logger = Logger.getLogger(ApplicationShutdownHook.class);

    public ApplicationShutdownHook(){
        super();
    }

    @Override
    public void run() {
        logger.info("----------------------------------");
        logger.info("ApplicationShutdownHook Begin");
        ProtocolConfig.destroyAll();
        logger.info("ApplicationShutdownHook End");
        logger.info("----------------------------------");
    }
}
