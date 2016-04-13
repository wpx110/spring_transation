package cn.muke.spring.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Spring������ʽ�������ķ�ʽ��������AspectJ��XML��ʽ�����á�
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo3 {

	@Resource(name="accountService")
	private AccountService accountService;
	@Test
	/**
	 * ת�˰���
	 */
	public void demo1(){
		accountService.transfer("aaa", "bbb", 200d);
	}
}
