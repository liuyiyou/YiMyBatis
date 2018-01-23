package cn.liuyiyou.mybatis.mapper.chapter02;


import cn.liuyiyou.mybatis.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();

    User selectOne();

    User selectById(Integer id);
}
