/*
 * �������ϱ�
 * 
 * 1. �� ����� ������ ���� ������ �˷��� �ٸ� ������ ������ ���� ���� �ȴ�.
 * 2. �ٸ� ����� ������ ���ϴٰ� �ڽź��� ������ ���� ����� ������ �ڽ��� ������ 1�� ������Ű�� �ȴ�.
 * 3. TypeA: �迭 ���� �� ���
 *    TypeB: �ٷ� ���
 *    
 */
import java.util.Scanner;
public class �������ϱ� {
	static int[] jumsu=new int[5]; //�ݺ� ��� �Ű����� ���� (��������)
	static int[] rank=new int[5];
	static char[] id={'A','B','C','D','E'};
	//�����Է¹ޱ�
	static int[] input()
	{
		for(int i=0; i<5; i++)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println(id[i]+"�л��� ���� �Է�: ");
			jumsu[i]=scan.nextInt();
		}
		/*for(int i=0;i<5;i++)
		{
			System.out.println(id[i]+"����: "+jumsu[i]+"��");	
		}*/
		return jumsu;
	}
	//������
	static int[] comp(int[] a)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(jumsu[i]<jumsu[j])
				  rank[i]=rank[i]+1;
			}
		}
/*		for(int i=0; i<5;i++)
		{
			System.out.println(id[i]+"�л����:"+rank[i]);
		}
*/
		return a;
	}
	
	//���
	static void output()
	{
		char temp1='A';
		int temp2=0;
		for(int i=0; i<5;i++)
		{

			for(int j=i+1;j<5-i;j++)
			{
				if(rank[i]>rank[j])
				{
					temp1=id[i];
					id[i]=id[j];
					id[j]=temp1;
					
					temp2=jumsu[i];
					jumsu[i]=jumsu[j];
					jumsu[j]=temp2;
					
				}
			}
			
		}
		System.out.println("����\t�л�\t����");
		for(int i=0; i<5; i++)
		{
			System.out.println(i+1+"��\t"+id[i]+"\t"+jumsu[i]);
			
		}
	}
	//����
	static void process()
	{
		input();
		comp(jumsu);
		output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
