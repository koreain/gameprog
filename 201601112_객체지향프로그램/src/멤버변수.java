/*
 * ������� (�𷡽� ����ñ��� ����� ����)
 * 	= static : Ŭ�������� (Ŭ�������� ���ؼ� ����� ����)
 * 				=> ���� Ŭ���� ��ü�� �������� ���Ǵ� ����
 * 				=> ������ �ÿ� �޸� �Ҵ�ȴ�. (��, JVM�� Ŭ�����δ��� ���ؼ� �ε�Ǿ��� ��.)
 * 	  class A
 * 	  {
 * 		static int age;
 * 	  }
 * 	  A a=new A(); //age;
 *    A a1=new A(); //age;
 * 	= instance : ��ü���� (��ü�� �����ϰ� ����� ����)
 * 				=> heap����
 */
import javax.swing.*;
public class ������� {
	String name="��û��"; //�ʱ� null�� (�ּҰ��� ����)
	String tel;
	String addr;
	void setAaa()
	{
		String name="ȫ�浿"; //��������� ���������� ��Ī�� ������ ��, ���������� �켱�Ѵ�.
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		������� a=new �������(); //name������ ����
		a.name=JOptionPane.showInputDialog("�̸� �Է�");
		a.tel=JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
		a.addr=JOptionPane.showInputDialog("�ּ� �Է�");
		String result="�̸�:"+a.name+"\n"
					 +"��ȭ:"+a.tel+"\n"	
					 +"�ּ�:"+a.addr;
		JOptionPane.showInputDialog(null, result);
	}

}
