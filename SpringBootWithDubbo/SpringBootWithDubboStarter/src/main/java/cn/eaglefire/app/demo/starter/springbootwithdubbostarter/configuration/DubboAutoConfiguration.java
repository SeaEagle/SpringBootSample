package cn.eaglefire.app.demo.starter.springbootwithdubbostarter.configuration;

import cn.eaglefire.app.demo.starter.springbootwithdubbostarter.runner.DubboServiceLatchCommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

/**
 * Created by eagle on 2016/11/4.
 */
@Configuration
@Order
@PropertySource(ignoreResourceNotFound = true, encoding = "utf-8", value = {"classpath:dubbo.properties", "file:./dubbo.properties"})
@ImportResource(locations = {"classpath:META-INF/dubboService.xml"})
public class DubboAutoConfiguration {

    protected static Logger logger = LoggerFactory.getLogger(DubboAutoConfiguration.class);

    @Value("${shutdown.latch.domain.name: cn.eaglefire.app.demo.service.management}")
    private String shutdownLatchDomainName;

    /**
     * 启动JMX
     *
     * 排除spring-boot-starter-web场景下启动
     * @return
     */
    @Bean
    @ConditionalOnNotWebApplication
    public DubboServiceLatchCommandLineRunner configureDubboServiceLatchCommandLineRunner(){
        logger.info("DubboAutoConfiguration enabled by adding DubboServiceLatchCommandLineRunner");
        DubboServiceLatchCommandLineRunner runner = new DubboServiceLatchCommandLineRunner();
        runner.setDomain(shutdownLatchDomainName);
        return runner;
    }

}
