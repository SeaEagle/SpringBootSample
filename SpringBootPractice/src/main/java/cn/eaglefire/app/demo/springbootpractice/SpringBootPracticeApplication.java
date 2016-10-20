package cn.eaglefire.app.demo.springbootpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * Created by eagle on 2016/10/18.
 */
@SpringBootApplication
public class SpringBootPracticeApplication {

    @Bean
    public Object testBean(PlatformTransactionManager platformTransactionManager){
        System.out.println(">>>>>>>>>>" + platformTransactionManager.getClass().getName());
        return new Object();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }

}
