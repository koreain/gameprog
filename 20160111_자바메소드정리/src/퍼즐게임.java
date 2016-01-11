/*
 * ��ɵ��� > ��������
 * 
 * 1) ���� ���� ==> �迭 ����
 * 2) ��� ==> ��� (�迭)
 * 3) �Է� ==> ���� 
 * 4) ���� ==> �迭�� ���� ��
 * 5) ����
 * 
 *  ����
 *  1)������ ����
 *  				�޸���ġ       / �޸� ���� ����     /  ������
 *    ============================================================
 *     static		   method	 �����Ͻÿ� �ڵ�            Ŭ���� ��ü
 *        ==> ���뺯��, Ŭ���� ����
 *        	    Ŭ�����̸�.������
 *        	  ==> �޸� ���� 1��
 * 	  ============================================================
 * 	   instance		   heap		 new������ ���ÿ�	Ŭ���� ��ü
 * 		  ==> ��ü����
 * 			    ��ü�̸�.������
 * 			  ==> new ��� ������ŭ ����
 * 	  ============================================================
 * 	   local		   stack	 �޼ҵ� ȣ���		�޼ҵ� �ȿ�����
 * 		  ==> �������� (����� ���������� �����)
 *    ============================================================
 */
import java.util.Scanner;
public class ������� {

	static int[][] panCount = new int[3][3]; //������� ���� (���� static ����)
	static int brow, bcol; //������� ���� (���� static ����)
	//// �̷��� ��������� => �ڵ����� �ʱ�ȭ(int=0, String=null...)
	
	//�����߻�
	static void getRand()
	{
		int[] temp=new int[9];
		int su=0;
		boolean bDash=false;
		for(int i=0;i<9;i++)
		{
			bDash=true;
			while(bDash)
			{
				//���� �߻�
				bDash=false;
				su=(int)(Math.random()*9);
				for(int j=0; j<i;j++)
					if(temp[j]==su)
					{
						bDash=true;
						break;
					}

			}
			temp[i]=su;
			panCount[i/3][i%3]=temp[i];
			if(su==8)
			{
				brow=i/3;
				bcol=i%3;
			}
		}

		/*
		 *  	0 		  1 		 2
		 *   0/3,0&3   0/3,1&3    0/3,0&3
		 *    (0,0)     (0,1)      (0,2)
		 *  	3 		  4 	     5
		 *  	6 		  7	 		 8
		 *  ��! 1���� �迭�� 2�������� �ٲ� ��, �� ������ ������ �ذ�(��), �������� ������ ������(��)
		 *  ����! 2���� �迭�� 1�������� �ٲ� ��, ��*������+��
		 */
	}
	
	static void display()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i==brow && j==bcol)
					System.out.print("  ");
				else
					System.out.print((panCount[i][j]+1)+" ");
			}
			System.out.println();
		}
	}
	
	static void process()
	{	boolean Dash=true;
		getRand();
		display();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("1~8���� �����Է�: ");
			int input=scan.nextInt();
			int a=0;
			int b=0;
			for(int i=0; i<3;i++)
			{ 

				for(int j=0; j<3;j++)
				{
					if(panCount[i][j]+1==input)
					{
						a=i;
						b=j;
						break;
					}
					
				}
				
			}
			panCount[brow][bcol]=panCount[a][b];
			panCount[a][b]=8;
			brow=a;
			bcol=b;
			display();
			if(isEnd()){
				System.out.println("Game Over!!");
				break;
			}
		}
	
	}
	
	static boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
	return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
