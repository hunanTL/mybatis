package com.example.ssm.service.Impl;

import com.example.ssm.mapper.UserDao;
import com.example.ssm.pojo.User;
import com.example.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-16 23:20
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired()
    private UserDao userdao;

    @Override
    public void addUser(User user) {
        this.userdao.insertUser(user);
    }

    @Override
    public List<User> findUserAll() {
        return this.userdao.selectUserAll();
    }

    @Override
    public User selectBYUserId(Integer id) {
        return this.userdao.selectBYUserId(id);
    }

    @Override
    public void updateUser(User user) {
         this.userdao.updateUser(user);
    }

    @Override
    public void deleteUser(Integer id) {
        this.userdao.deleteUser(id);
    }
}
