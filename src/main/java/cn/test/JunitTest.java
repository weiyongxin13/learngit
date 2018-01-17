package cn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.entity.User;
import cn.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-config.xml")
public class JunitTest {

	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testName() throws Exception {
		
		User user = userMapper.selectUserInfo("youcong");
		System.out.println(user.getPassWord());
		
	}
}
