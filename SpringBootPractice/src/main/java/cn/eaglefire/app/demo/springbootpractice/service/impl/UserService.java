package cn.eaglefire.app.demo.springbootpractice.service.impl;

import cn.eaglefire.app.demo.springbootpractice.bean.ResultBean;
import cn.eaglefire.app.demo.springbootpractice.bean.UserBean;
import cn.eaglefire.app.demo.springbootpractice.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * Created by eagle on 2016/10/18.
 */
@Component
public class UserService implements IUserService {

    @Override
    public ResultBean validateUser(UserBean userBean) {
        System.out.println("UserService validate User");
        return null;
    }

}
