package cn.eaglefire.app.demo.springbootwithgorm.controller

import cn.eaglefire.app.demo.springbootwithgorm.domain.User
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by eagle on 2016/10/11.
 */
@RestController("user")
@RequestMapping("user")
public class UserController {

    @RequestMapping("index")
    @Transactional
    public String index(){
        def user = new User(name: "hai");
        System.out.println(user.getName()+" "+user.getId());
        user.save(flush: true);
        System.out.println(user.getId());
        User user1 = User.findByName("hai");
        user1.setName("ying");
        user1.save(flush: true);
        System.out.println(user1.getName()+" "+user1.getId());
        return "Hello, This is a Test";
    }

}