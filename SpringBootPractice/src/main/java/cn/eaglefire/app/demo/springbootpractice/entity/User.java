package cn.eaglefire.app.demo.springbootpractice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by eagle on 2016/10/18.
 */
@Entity
public class User implements Serializable{

    private Date birthDate;

    @Id
    private Long id;

}
