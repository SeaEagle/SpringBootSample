package cn.eaglefire.app.demo.provider.springbootwithdubboproviderplain.configuration;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by eagle on 2016/11/2.
 */
@Configuration
@ImportResource(locations = {"classpath:META-INF/dubboService.xml"})
public class DubboConfiguration implements CommandLineRunner{

    @Override
    public void run(String... args) throws Exception {
        Main.main(null);
    }

}
