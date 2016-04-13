package cn.muke.spring.demo3;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *ת�˰�����DAO��ʵ����
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	/**
	 * @param out	:ת���˺�
	 * @param money	:ת�˽��
	 */
	public void outMoney(String out, Double money) {
		String sql = "update account set money = money - ? where name = ? ";
		this.getJdbcTemplate().update(sql, money ,out);
	}
	/**
	 * @param in	:ת���˺�
	 * @param money	:ת�˽��
	 */
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money + ? where name = ? ";
		this.getJdbcTemplate().update(sql, money , in);
	}

}
