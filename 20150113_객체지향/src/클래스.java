/*
 * 	Ŭ���� ���� ����
 * 		���� ==> �迭 ==> ����ü  ==> Ŭ����
 * 		: �����͸� ��Ƽ� ����
 * 		���� : ���� �����͸� �����ؼ� ���
 * 		�迭 : ���� ũ���� �����͸� �����ؼ� ���
 * 		����ü : �ٸ� ũ���� �����͸� ��Ƽ� ��� (��� ������=>����)
 * 		Ŭ���� : ����ü + �޼ҵ� (�����)
 * 
 * 		Ŭ������ ���� ���
 * 			������(�Ӽ�)
 * 				=> �������
 * 					���뺯�� (Ŭ����) ==> static
 * 					��ü���� (�ν��Ͻ� ����) ==> (X)
 * 					����
 * 					 class A
 * 					 {
 * 						int a;
 * 						static int b;
 * 					 }
 * 					 b������ Ŭ������ ����ӽ� �о�� ��쿡 ����
 * 					 a������ ���� ���� �����Ŀ� ����� ����(new)
 * 					 A aa=new A();
 * 					
 * 					 stack
 * 					 === aa
 * 					 100
 * 					 ===			heap
 * 									=== 100
 * 									 a
 * 									===
 * 			�޼ҵ�(���) : ����� ������ ���ؼ� ���� ����
 * 
 * 			Ŭ���� ����
 * 			1) �߻�ȭ �۾�: ����(�𵨸�)
 * 				=> ���Ǽ����� ��� �繰�� �ܼ�ȭ
 * 	
 * 				���
 * 				==========
 * 				 �̸�
 *  			 ����
 *  			 �ֹι�ȣ
 *  			 ��
 *  			 ��
 *  			 ��
 *  			 ��
 *  			==========
 *  			 ��=> ���ϴ�
 *  			 ��=> ��´�
 *  			 ��=> ����
 *  		 	==========
 *  
 * 			2) ��üȭ �۾�: �𵨸� ������ �ùķ��̼�
 * 			
 * 			1) ���� ==> �迭 , Ŭ����
 * 			2) ��ɹ� ������ �޼ҵ�
 * 			3) Ŭ���� ==> ��Ű�� (��Ʈ�� �ʼ� ��Ű������ 3��, ����/Ŭ���̾�Ʈ/����)
 * 					��Ű��:����... // ��Ű���� import�� �θ���. // 
 * 			===============================================
 * 			Ŭ���� ����( java )
 * 			1) package
 * 			2) import ==> ������
 *			3) class className
 *			   {
 *				 ���� ����
 *				=============
 *				 �޼ҵ� ����
 *				=============
 *				 ������ ���� => �������� (������ ������ Ȱ���� ��, �α��� ���� ���(�������� ����)
 *				=============
 *			    }
 *
 *		���ھ߱�����
 *		  1 ����        ==> com[]
 *		  2 �Է�        ==> user[] 
 *		  3 ��        ==> com[] user[] ==> s,b
 *		  4 ��Ʈ        ==> s,b
 *	 	  5 ����        ==> s
 *
 *		   ����� ��� ���� �������� ���̴� �������� ���̰� �̸�.. ��������� ��´�.
 *
 *		 void test()
 *		 {
 *		   int a=10;
 *		   System.out.println(a);
 *		   a++;
 *		 }
 *
 *		 test();   ==> 10
 *		 test();   ==> 10	
 *		 test();   ==> 10
 *
 *       int a=10;
 * 		 void test()
 *		 {
 *		   System.out.println(a);
 *		   a++;
 *		 }
 *
 *		 test();   ==> 10
 *		 test();   ==> 11	
 *		 test();   ==> 12
 *
 */
import javax.swing.*;
/*
 * 		����: 1. extends Object ( . �����ϱ� ������ �����µ� �̰� Object�� ������ �ִ� ��� ���� Ȱ���Ҽ� �ִٴ� �ǹ�)
 * 		     2. import (java.lang.* :  String, System, Math . . . .)
 *			 3. ����ó�� ==> ���� �� ���� (����ó�� ����)
 *						   ������ �� ���� 
 */
public class Ŭ���� {
	
	//�������
	int[] com=new int[3];
	int[] user=new int[3];
	int s,b; //������� ==> �ڵ����� 0�ʱ�ȭ
	
	void getRand()
	{
		int su=0;
		boolean bDash=false;
		for(int i=0; i<3;i++)
		{
			bDash=true;
			while(bDash)
			{
				bDash=false;
				su=(int)(Math.random()*9+1);
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}
	
	void userInput()
	{
		
		while(true)
		{
			String input=
					JOptionPane.showInputDialog("���ڸ� ���� �Է�:");
			if(input.length()!=3)
			{
				JOptionPane.showMessageDialog(null,"�߸��� �Է��Դϴ�.");
				continue;
			}
			user[0]=input.charAt(0)-'0'; // '1' ==> 49
			user[1]=input.charAt(1)-'0'; // '2'
			user[2]=input.charAt(2)-'0'; // '3'
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				JOptionPane.showMessageDialog(null,"�ߺ��� ���� ����� �� �����ϴ�.");
				continue;
			}
		  break;
		}
	}
	
	void compare()
	{
	  s=0;
	  b=0;
	  
	  for(int i=0;i<3;i++)
	  {
		for(int j=0; j<3; j++)
		{
			if(com[i]==user[j])
			{
				if(i==j)
				s++;
				else
				b++;
			}
		}
	  }
		
	}
	
	void hint()
	{
		System.out.printf("Input Number:%d-%d-%d,Result:%dS-%dB\n",
							user[0],user[1],user[2],s,b);
	}
	
	boolean isEnd()
	{
		if(s==3)
			return true; //��� �޼ҵ�� return�� ������ ����
			return false;
	}
	
	
	void process()
	{
		getRand();
		while(true)
		{
			userInput();
			compare();
			hint();
			if(isEnd())
			{
				int a=JOptionPane.showConfirmDialog(null, "�����ұ��?","����"
													,JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null, "������ �����մϴ�.");
					System.exit(0);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "�� ������ �����մϴ�.");
				process();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ŭ���� a=new Ŭ����();
		a.process();
	}

}
