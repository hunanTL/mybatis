package com.example.ssm.mapper;

import com.example.ssm.pojo.User;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-16 23:20
 */

public interface UserDao {

    //添加用户
    void insertUser(User user);

    //查询用户
    List<User> selectUserAll();

    //根据ID查找用户
    User selectBYUserId(Integer id);

    //修改用户
     void  updateUser(User user);

     //删除用户
    void deleteUser(Integer id);
}
