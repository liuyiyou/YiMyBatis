package cn.liuyiyou.mybatis.generator;

import cn.liuyiyou.mybatis.entity.Subs;
import cn.liuyiyou.mybatis.entity.SubsExample;
import cn.liuyiyou.mybatis.service.ISubsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 单元测试基类。继承AbstractTransactionalJUnit4SpringContextTests之后，在执行sql的时候，会进行回滚。
 * 如果不需要回滚，则不继承它。需要注意的是：如果不进行事务回滚，在打包的时候会运行该单元测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:generator/spring-config.xml"})
//@ContextConfiguration(classes = AppConfig.class)
public class GeneratorMapperTest {//extends AbstractTransactionalJUnit4SpringContextTests {


    @Autowired
    private ISubsService subsService;

    @Test
    public void selectByIdTest() {
        SubsExample subsExample = new SubsExample();
        subsExample.createCriteria().andSubsIdEqualTo(5L);
        List<Subs> subs = subsService.selectByExample(subsExample);
        System.out.println(subs.size());

    }


}
