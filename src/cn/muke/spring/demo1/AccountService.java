package cn.muke.spring.demo1;
/**
 * ת�˰�����ҵ���ӿ�
 *
 */
public interface AccountService {

	/**
	 * @param out	��ת�����˺�
	 * @param in	��ת����˺�
	 * @param money	��ת�˵Ľ��
	 */
	public void transfer(String out,String in,Double money );
}
