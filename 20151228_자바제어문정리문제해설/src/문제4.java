/*
 *  1~100
 *  
 *  2차 for
 *  	 1	   2 	4
 *  for(초기값; 조건식; 증가식) : 줄수
 *  {
 *    ========================================
 *    	   1    2 	  4
 *    for(초기값; 조건식; 증가식) : 한줄에 출력하는 데이터
 *    	{
 *    		반복 실행문장 3
 *    	}
 *    ======================================== 3
 *  }
 *  
 */
public class 문제4 {

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
