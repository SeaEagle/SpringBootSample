package cn.eaglefire.app.demo.springbootpractice.controller;

import cn.eaglefire.app.demo.springbootpractice.bean.UserBean;
import cn.eaglefire.app.demo.springbootpractice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManagerFactory;

/**
 * User Module
 *
 * Created by eagle on 2016/10/18.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    IUserService userService;

    @Autowired
    private ApplicationContext context;

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @RequestMapping("index")
    public String index(){
        userService.validateUser(new UserBean());
        return "Hello World";
    }

}
