package cn.eaglefire.app.demo.starter.springbootwithdubbostarter.runner;

import cn.eaglefire.app.demo.starter.springbootwithdubbostarter.mbean.ShutdownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by eagle on 2016/11/4.
 */
public class DubboServiceLatchCommandLineRunner implements CommandLineRunner {

    protected static Logger logger = LoggerFactory.getLogger(DubboServiceLatchCommandLineRunner.class);

    private String domain = "cn.eaglefire.app.demo.service.management";

    @Override
    public void run(String... strings) throws Exception {
        logger.info("DubboServiceLatchCommandLineRunner start.");
        ShutdownLatch latch = new ShutdownLatch(getDomain());
        latch.await();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
