package com.jl.modelSpringDI.dao;

/**
 * @ClassName User
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/5/9 17:48
 * @Version 1.0
 */
public class User {
    private String name;
    private String age;
    private String sex;

    public User() {
    }

    public User(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
