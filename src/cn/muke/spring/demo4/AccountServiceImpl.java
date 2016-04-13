package cn.muke.spring.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * 转账案例的业务成实现类
 */
/**
 *@Transational注解中的属性： 
 * propagation	:事务的传播行为
 * isolation	:事务的隔离级别
 * readOnly		:只读
 * rollbackFor	:发生哪些异常回滚
 * noRollbackFor:发生哪些异常不回滚
 */
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {
	// 注入转账的DAO的类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * @param out	：转出的账号
	 * @param in	：转入的账号
	 * @param money	：转账的金额
	 */
	public void transfer( String out,  String in,  Double money) {
				accountDao.outMoney(out, money);
				//int i =1/0;
				accountDao.inMoney(in, money);
	}

}
