package cn.eaglefire.app.demo.springbootpractice.service;

import cn.eaglefire.app.demo.springbootpractice.bean.ResultBean;
import cn.eaglefire.app.demo.springbootpractice.bean.UserBean;

/**
 * Created by eagle on 2016/10/18.
 */
public interface IUserService {

    public ResultBean validateUser(UserBean userBean) throws Exception;

}
