/*
 * Ŭ������ ����
 * Class class_name
 * {
 * 		�������� => �������� (�������) Ŭ���� ��� ����
 * 		�޼ҵ� ����
 * 		main()
 * 		{
 * 		}
 * }
 * 
 * Ŭ������ �������
 * 	1) ����
 *  2) �޼ҵ� => ������ + ���
 * 
 */

public class Sawon {
	
	static int sabun; //���� => ������(���뺯��)
	String name; //��ü�� �����ø��� ���� ���� ����(��ü����)
	String dept;
	String loc;
	long pay;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s=new Sawon(); //s�� �ּҸ� �ޱ⶧���� 4byte �޸�.
		// int malloc(sizeof(Sawon))==> new 
		s.sabun=10;
		s.name="ȫ�浿";
		Sawon s2=s;
		System.out.println(s);
		Sawon s1=new Sawon();
		s1.sabun=20;
		s1.name="��û��";
		s2.name="������";
		System.out.println(s1);
		System.out.println(s.sabun);
		System.out.println(s.name);
		System.out.println(s1.name);
	}

}
