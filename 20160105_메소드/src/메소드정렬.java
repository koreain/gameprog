import java.util.Arrays;

/*
 *  ����
 *   1) ���� ���� (�պ��� ����)
 *   	ASC
 *   	30 20 40 10 50
 *      == ==
 *      20 30
 *      ==    ==
 *      ==       ==
 *      10		 20
 *      ==          ==
 *      ////////////////
 *      10 30 40 20 50
 *         == ==
 *         ==    ==
 *		   20    30
 *         ==       ==
 *      /////////////////   
 *      10 20 40 30 50   
 *         	  == ==
 *            30 40
 *            ==    ==
 *      //////////////////      
 *      10 20 30 40 50
 *      		 == == 
 *      //////////////////         
 *   2) ���� ���� (�ں��� ����)
 *   30 20 40 10 50
 *   == ==
 *   20 30
 *      == ==
 *      30 40
 *         == ==
 *         10 40
 *         	  == ==
 *            40 50
 *   20 30 10 40 50
 *   == ==
 *   20 30
 *      == ==
 *      10 30
 *         == ==
 *         30 40
 *            == ==
 *               50
 *   20 10 30 40 50
 *   == ==
 *   10 20
 *      == ==
 *      20 30
 *         == ==
 *         30 40
 *            == ==
 *               50
 *   10 20 30 40 50         
 */

public class �޼ҵ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0; i<5;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("������:");
		for(int i=0; i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("������:");
		for(int i=0; i<arr.length-1;i++)
		{
			
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0; i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		/*Arrays.sort(arr);
		for(int i=0; i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
	}

}
