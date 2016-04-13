package cn.muke.spring.demo4;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ת�˰�����ҵ���ʵ����
 */
/**
 *@Transationalע���е����ԣ� 
 * propagation	:����Ĵ�����Ϊ
 * isolation	:����ĸ��뼶��
 * readOnly		:ֻ��
 * rollbackFor	:������Щ�쳣�ع�
 * noRollbackFor:������Щ�쳣���ع�
 */
@Transactional(propagation=Propagation.REQUIRED)
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
