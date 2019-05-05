package cn.liuyiyou.mybatis.mapper.generator;

import cn.liuyiyou.mybatis.entity.Subs;
import cn.liuyiyou.mybatis.entity.SubsExample;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubsMapper {


    int deleteByExample(SubsExample example);


    List<Subs> selectByExample(SubsExample example);


    int insert(Subs record);

    int insertSelective(Subs record);




}