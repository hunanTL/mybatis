package com.cn.pojo;

import javax.persistence.*;

/**
 * @author <a href="mailto:lei.tan@vtradex.net">谭磊/a>
 * @since 2019-05-21 10:25
 */
@Entity
@Table(name="t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="t_id")
    private  Long id;
    @Column(name="t_name")
    private String name;
    @Column(name="t_age")
    private String age;
    @Column(name = "t_address")
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
