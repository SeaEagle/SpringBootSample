package cn.eaglefire.app.demo.springbootpractice.service.impl;

import cn.eaglefire.app.demo.springbootpractice.bean.ResultBean;
import cn.eaglefire.app.demo.springbootpractice.bean.UserBean;
import cn.eaglefire.app.demo.springbootpractice.entity.User;
import cn.eaglefire.app.demo.springbootpractice.repository.UserRepository;
import cn.eaglefire.app.demo.springbootpractice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by eagle on 2016/10/18.
 */
@Component
public class UserService implements IUserService{

    @Autowired
    private UserRepository userRepository;

    @Transactional(rollbackFor = {java.lang.Exception.class})
    @Override
    public ResultBean validateUser(UserBean userBean) throws Exception{
        User user = new User();
        user.setId(103L);
        user.setName("Test");
        userRepository.save(user);
        boolean b = true;
        System.out.println("UserService validate User");
        if(b)
            throw new Exception();
        return null;
    }

}
