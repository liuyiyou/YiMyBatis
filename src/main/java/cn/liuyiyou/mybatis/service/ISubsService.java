package cn.liuyiyou.mybatis.service;

import cn.liuyiyou.mybatis.entity.Subs;
import cn.liuyiyou.mybatis.entity.SubsExample;

import java.util.List;

public interface ISubsService {


    int deleteByExample(SubsExample example);


    List<Subs> selectByExample(SubsExample example);


    int insert(Subs record);

    int insertSelective(Subs record);


}