package cn.muke.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例的业务成实现类
 */
public class AccountServiceImpl implements AccountService {
	// 注入转账的DAO的类
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	// 注入事务管理的模板
	private TransactionTemplate transactionTemplate;

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	/**
	 * @param out	：转出的账号
	 * @param in	：转入的账号
	 * @param money	：转账的金额
	 */
	public void transfer(final String out, final String in, final Double money) {
		//transactionTemplate.execute()方法使outMoney()和inMoney()组合为一个事务
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
				int i =1/0;
				accountDao.inMoney(in, money);
			}
		});
	}

}
