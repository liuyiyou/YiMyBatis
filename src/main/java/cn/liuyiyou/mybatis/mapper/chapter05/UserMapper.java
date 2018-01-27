package cn.liuyiyou.mybatis.mapper.chapter05;


import cn.liuyiyou.mybatis.domain.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAll();
}
