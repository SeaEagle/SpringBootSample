package cn.eaglefire.app.demo.api.springbootwithdubboapi.service;

import cn.eaglefire.app.demo.api.springbootwithdubboapi.bean.UserBean;

/**
 * 用户Service
 *
 * Created by eagle on 2016/11/2.
 */
public interface UserService {

    /**
     * 根据id获取用户
     *
     * @param userBean
     * @return
     */
    public UserBean getUserById(UserBean userBean);

}
