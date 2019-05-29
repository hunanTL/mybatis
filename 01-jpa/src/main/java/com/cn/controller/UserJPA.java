package com.cn.controller;

import com.cn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-21 10:39
 */
public interface UserJPA extends JpaRepository<User,Long>, JpaSpecificationExecutor<User>, Serializable {
}
