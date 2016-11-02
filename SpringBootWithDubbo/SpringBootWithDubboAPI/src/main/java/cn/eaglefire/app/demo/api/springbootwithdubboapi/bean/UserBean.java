package cn.eaglefire.app.demo.api.springbootwithdubboapi.bean;

import java.io.Serializable;

/**
 * 用户bean
 *
 * Created by eagle on 2016/11/2.
 */
public class UserBean implements Serializable{

    /**
     * 主键
     */
    private long id;

    /**
     * 用户名
     */
    private String username;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
