package cn.muke.spring.demo1;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *ת�˰����Ĳ�����
 */
@RunWith(SpringJUnit4ClassRunner.class)//spring��junit4���ϵİ�
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {

	//����ҵ����:
	@Resource(name="accountService")
	private AccountService accountService;
	
	@Test//Junit4���Է���ע��
	public void demo1(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
