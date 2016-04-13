package cn.muke.spring.demo1;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *转账案例的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)//spring和junit4整合的包
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

	//测试业务类:
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test//Junit4测试方法注解
	public void demo1(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
