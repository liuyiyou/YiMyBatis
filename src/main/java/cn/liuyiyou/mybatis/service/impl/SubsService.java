package cn.liuyiyou.mybatis.service.impl;

import cn.liuyiyou.mybatis.entity.Subs;
import cn.liuyiyou.mybatis.entity.SubsExample;
import cn.liuyiyou.mybatis.mapper.generator.SubsMapper;
import cn.liuyiyou.mybatis.service.ISubsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubsService implements ISubsService {


    @Autowired
    private SubsMapper subsMapper;


    @Override
    public int deleteByExample(SubsExample example) {
        return subsMapper.deleteByExample(example);
    }


    @Override
    public List<Subs> selectByExample(SubsExample example) {
        return subsMapper.selectByExample(example);
    }


    @Override
    public int insert(Subs record) {
        return subsMapper.insert(record);
    }

    @Override
    public int insertSelective(Subs record) {
        return subsMapper.insertSelective(record);
    }


}