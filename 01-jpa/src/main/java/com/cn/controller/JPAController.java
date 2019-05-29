package com.cn.controller;

import com.cn.pojo.Employee;
import com.cn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-21 10:33
 */
@RestController
@RequestMapping("/user")
public class JPAController {

    @Autowired
    private UserJPA userJPA;

    @Autowired
    private  EmployeeJPA employeeJPA;

    /**
     * 数据新增或更新
     */
    @RequestMapping(value = "/save",method = RequestMethod.GET)
    public User save(User user){
        return userJPA.save(user);
    }

    /**
     * 查找所有用户
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> list(){
        return userJPA.findAll();
    }

    /**
     * 根据ID删除
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<User> delete(long id){
        userJPA.deleteById(id);
        return userJPA.findAll();
    }


    @RequestMapping(value = "/empsava" ,method = RequestMethod.GET)
    public  Employee sava(Employee employee){
       return employeeJPA.save(employee);
    }

    @RequestMapping("/employys")
    @Query("SELECT o FROM  Emplyee o where o.name=?1 and o.age=?2")
    public List<Employee> quertparama(String name,String age){
        return employeeJPA.findAll();
    }

    @RequestMapping(value = "/empupdate",method = RequestMethod.GET)
    @Modifying
    @Query("update Employee o set o.age=:age where o.id=:id")
    public List<Employee> update(@Param("id") Long id, @Param("age") String age){

        return employeeJPA.findAll();
    }
}
