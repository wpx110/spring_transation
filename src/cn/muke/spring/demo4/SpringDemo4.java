package cn.muke.spring.demo4;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *Spring�������������ķ�ʽ��������ע����������ķ�ʽ�� 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo4 {

	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	/**
	 * ת�˵İ���
	 */
	public void demo1(){
		accountService.transfer("aaa", "bbb", 200d);
		
	}
}
