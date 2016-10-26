package cn.eaglefire.app.demo.springbootpractice.repository;

import cn.eaglefire.app.demo.springbootpractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by eagle on 2016/10/26.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
