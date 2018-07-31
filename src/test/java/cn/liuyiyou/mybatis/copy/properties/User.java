package cn.liuyiyou.mybatis.copy.properties;

import java.util.Date;

/***
 * @author: liuyiyou
 * @date: 2018/2/11
 */
public class User {

    private Integer id;
    private String userName;
    private int age;
    private Date birthDay;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", birthDay=" + birthDay +
                '}';
    }
}
