package cn.eaglefire.app.demo.provider.springbootwithdubboprovider.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by eagle on 2016/11/2.
 */
@Configuration
@ImportResource(locations = {"classpath:META-INF/dubboService.xml"})
public class DubboConfiguration {
}
