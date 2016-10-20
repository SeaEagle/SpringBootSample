package cn.eaglefire.app.demo.springbootpractice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Datasource Configuration
 *
 * Created by eagle on 2016/10/19.
 */
@Configuration
@ImportResource(locations = {"classpath:META-INF/datasource.xml"})
public class DataSourceConfiguration {

    @Bean
    public Object myDataSource(){
        System.out.println("This is a Test");
        return new Object();
    }

}
