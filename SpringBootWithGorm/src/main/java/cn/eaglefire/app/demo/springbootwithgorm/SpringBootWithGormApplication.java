package cn.eaglefire.app.demo.springbootwithgorm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by eagle on 2016/10/10.
 */
@SpringBootApplication
public class SpringBootWithGormApplication {

    public static void main(String[] args){
        System.out.println("Begin");
        SpringApplication.run(SpringBootWithGormApplication.class, args);
        System.out.println("End");
    }

}
