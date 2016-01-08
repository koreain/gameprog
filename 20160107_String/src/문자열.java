/*
 * 
 * 	���ڿ� ==> ���� ������ ��� ���
 * 		   ===========
 * 			  char[] ==> �����ؼ� ���� Ŭ���� : String
 * 
 * 	1) ��� ����
 * 		String	������ = "��";
 * 		======  ===	  ====
 *  	  Ŭ���� 	��ü	  ��ü������ => ��ü: ����� ���� ���������� ���� ������
 *		String ������ = new String("��");
 *					====
 *					���ο� �޸� ���� => ����
 *					malloc() �޸� ���� => free()�޸� ���� (c���)
 *					new => System.gc() (�ڹ�)
 *
 *		String str = new String("java")
 *		�ڹٸ޸�
 *		===============================
 *		method ����
 *		===============================
 *		stack => �޸𸮿� ���� ���� (��������, �Ű�����)
 *		===============================
 *		heap => �����ڰ� ���� (new�� �̿��ؼ� �Ҵ�)
 *		===============================
 *
 *		String str=new String("java");
 *		==========	   ===============
 *		  str			    (java)
 *		  100				 100
 *		==========	   ===============				
 *		 stack����		   heap����
 *
 *		 �������� ..�� �Ѵ�.
 *		 �������� : �迭, String
 *
 *		String : ��������, ��� (Ŭ������ ������)
 *		1) equals : ���ڿ� ��
 *		2) length : ����ũ��
 *		3) substring : ���ں���
 *		4) split : ���ں���
 *		5) startsWith, endsWith : �ڵ� �ϼ���
 *		6) trim : �¿� ���� ����
 *		7) indexOf, lastIndexOf : ���ϴ� ��ġ�� ���� ��ġ
 *		8) replace : �ٸ� ������ ����
 *		9) valueOf : ��� ���������� ���ڿ��� ����
 *	   10) chatAt : �ش� ���ڿ����� Ư����ġ�� ���� �Ѱ��� ������ �� ��
 *		"java".concat("aaa")=> javaaaa
 *		"java"+"aaa" => javaaaa (�� ����)
 *
 *
 *
 */
public class ���ڿ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello");
		if(str==str1)
			System.out.println("str�� str1�� ����(�ּ�)");
		if(str==str2)
		{
			System.out.println("str�� str2�� ����(�ּ�)");
		}
		else
		{
			System.out.println("str�� str2�� �ٸ���(�ּ�)");
		}
		
		if(str.equalsIgnoreCase(str2)) //��ҹ��� ���� ����.
		{
			System.out.println("str�� str2�� ����(���ڿ�)");
		}
		else
		{
			System.out.println("str�� str2�� �ٸ���(���ڿ�)");
		}
		
		
	}

}
