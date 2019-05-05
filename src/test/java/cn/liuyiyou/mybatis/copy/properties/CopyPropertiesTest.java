package cn.liuyiyou.mybatis.copy.properties;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PropertyFilter;
import org.junit.Test;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/***
 * @author: liuyiyou
 * @date: 2018/2/11
 */
public class CopyPropertiesTest {

    @Test
    public void commonCopy() {
        Person person = getPerson();
        System.out.println(person);
        User user = new User();
        user.setId(person.getId());
        user.setAge(person.getAge());
        user.setBirthDay(person.getBirthDay());
        user.setUserName(person.getName());
        System.out.println(user);

    }

    //name无法进行copy
    @Test
    public void commonBeanUtilsCopy() throws InvocationTargetException, IllegalAccessException {
        Person person = getPerson();
        System.out.println(person);
        User user = new User();
        org.apache.commons.beanutils.BeanUtils.copyProperties(user, person);
//        org.apache.commons.beanutils.BeanUtils.populate();
        System.out.println(user);
    }

    @Test
    public void commonSpringBeanUtilsCopy() throws InvocationTargetException, IllegalAccessException {
        Person person = getPerson();
        System.out.println(person);
        User user = new User();
        BeanUtils.copyProperties(person,user);
        System.out.println(user);
    }


    @Test
    public void withJsonCopy() throws InvocationTargetException, IllegalAccessException {
        Person person = getPerson();
        JSON.toJSONString(person, new PropertyFilter() {
            @Override
            public boolean apply(Object object, String name, Object value) {
                return false;
            }
        });
        System.out.println(person);
        User user = new User();
        BeanUtils.copyProperties(person,user);
        System.out.println(user);
    }

    public static Person getPerson() {
        Person person = new Person();
        person.setId(1);
        person.setAge(18);
        person.setBirthDay(new Date());
        person.setName("lyy");
        return person;
    }
}
