import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oy.test.mapper.UserMapper;
import com.oy.test.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	
	@Resource
	private UserService userService;
	
	@Test
	public void test(){
		System.out.println(userService.getUserById(2).getUsername());
		System.out.println(userService.getUserById(2).getPassword());
	}
}
