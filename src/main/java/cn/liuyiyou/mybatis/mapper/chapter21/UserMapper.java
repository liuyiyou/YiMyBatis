package cn.liuyiyou.mybatis.mapper.chapter21;


import cn.liuyiyou.mybatis.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectById(Integer id);

    int update(User user);


}
