/*
 *  1~100
 *  
 *  2�� for
 *  	 1	   2 	4
 *  for(�ʱⰪ; ���ǽ�; ������) : �ټ�
 *  {
 *    ========================================
 *    	   1    2 	  4
 *    for(�ʱⰪ; ���ǽ�; ������) : ���ٿ� ����ϴ� ������
 *    	{
 *    		�ݺ� ���๮�� 3
 *    	}
 *    ======================================== 3
 *  }
 *  
 */
public class ����4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++)
		{
			System.out.println();
			for(int j=1; j<=10; j++)
			{
				System.out.print(i+"\t");
			}
		}
	}

}
