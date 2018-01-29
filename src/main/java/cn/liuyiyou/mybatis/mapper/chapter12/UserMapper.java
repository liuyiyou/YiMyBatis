package cn.liuyiyou.mybatis.mapper.chapter12;


import cn.liuyiyou.mybatis.domain.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 测试#和$的区别，源码debug
     * @param params
     * @return
     */
    List<User> selectUserByNameOrderById(Map<String,Object> params);
}
