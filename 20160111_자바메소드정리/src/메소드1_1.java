/* 1번예제
 * ============================
 * 1
 * ============================
 * 2  3
 * ============================
 * 4  5  6
 * ============================
 * 7  8  9  10
 * ============================
 * 11 12 13 14 15
 * ============================
 * 2번예제
 * ============================
 * 1  2  3	4  5
 * ============================
 * 6  7  8  9
 * ============================
 * 10 11 12
 * ============================
 * 13 14
 * ============================
 * 15
 * ============================
 * 3번예제
 * ============================
 * 							1  
 * ============================
 * 						2   3
 * ============================
 * 					4   5   6
 * ============================
 * 			7    8   9   10
 * ============================
 *  11 12 13 14 15
 * ============================
 */
public class 메소드1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1번예제
		 
		int[][] arr = new int[5][5];
		int k=1;
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<=i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0; j<5;j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		//2번예제
		/*int[][] arr = new int[5][5];
		int k=1;
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<=4-i;j++)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0; j<5;j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		int[][] arr = new int[5][5];
		int k=1;
		for(int i=0;i<5;i++)
		{
			for(int j=4; j<=4-i;j--)
			{
				arr[i][j]=k;
				k++;
			}
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0; j<5;j++)
			{
				if(arr[i][j]==0)
					System.out.print("\t");
				else
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
