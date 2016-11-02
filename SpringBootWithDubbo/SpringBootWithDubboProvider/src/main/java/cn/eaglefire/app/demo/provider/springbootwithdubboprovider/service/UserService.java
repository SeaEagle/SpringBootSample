package cn.eaglefire.app.demo.provider.springbootwithdubboprovider.service;

import cn.eaglefire.app.demo.api.springbootwithdubboapi.bean.UserBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by eagle on 2016/11/2.
 */
@Component(value = "userService")
//@Service("userService")
//@Service(value = "userService")
public class UserService implements cn.eaglefire.app.demo.api.springbootwithdubboapi.service.UserService {

    @Override
    public UserBean getUserById(UserBean userBean) {
        return null;
    }

}
