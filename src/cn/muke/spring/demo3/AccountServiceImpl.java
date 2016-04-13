package cn.muke.spring.demo3;

/**
 * 转账案例的业务成实现类
 */
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
