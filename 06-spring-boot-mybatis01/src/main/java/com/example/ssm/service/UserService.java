package com.example.ssm.service;

import com.example.ssm.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-16 23:18
 */

public interface UserService {

   void addUser (User user);

   List<User> findUserAll();

   User selectBYUserId(Integer id);

   void updateUser(User user);

   void  deleteUser(Integer id);
}
