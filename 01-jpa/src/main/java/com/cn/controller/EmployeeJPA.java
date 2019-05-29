package com.cn.controller;

import com.cn.pojo.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-21 13:26
 */
public interface EmployeeJPA extends JpaRepository<Employee,Long> , JpaSpecificationExecutor<Employee>, Serializable {
}
