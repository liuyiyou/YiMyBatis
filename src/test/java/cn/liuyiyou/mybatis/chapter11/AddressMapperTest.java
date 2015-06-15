package cn.liuyiyou.mybatis.chapter11;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.liuyiyou.mybatis.domain.chapter11.Address;
import cn.liuyiyou.mybatis.mapper.chapter11.AddressMapper;



/**
 * 单元测试基类。继承AbstractTransactionalJUnit4SpringContextTests之后，在执行sql的时候，会进行回滚。
 * 如果不需要回滚，则不继承它。需要注意的是：如果不进行事务回滚，在打包的时候会运行该单元测试
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:chapter11/spring-config.xml" })
public class AddressMapperTest extends AbstractTransactionalJUnit4SpringContextTests{


	@Autowired
	@Qualifier("addressMapper")
	private AddressMapper addressMapper;

	@Test
	public void selectByIdTest() {
		Address address = addressMapper.selectById(1);
		System.out.println(address.getCity());

	}

	
}
