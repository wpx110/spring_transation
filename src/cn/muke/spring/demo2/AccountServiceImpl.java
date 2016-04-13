package cn.muke.spring.demo2;

/**
 * ת�˰�����ҵ���ʵ����
 */
public class AccountServiceImpl implements AccountService {
	// ע��ת�˵�DAO����
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	/**
	 * @param out	��ת�����˺�
	 * @param in	��ת����˺�
	 * @param money	��ת�˵Ľ��
	 */
	public void transfer( String out,  String in,  Double money) {
				accountDao.outMoney(out, money);
				//int i =1/0;
				accountDao.inMoney(in, money);
	}

}
