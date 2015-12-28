/*
 *  2차 for  (숫자  비교에 유용하게 쓸 수 있다)
 *   형식)	  1	    2    7
 *   	for (초기값; 조건식; 증가식)
 *   	{        3     4    6
 *   		for(초기값; 조건식; 증가식)
 *   		{   
 *   			실행문장 5
 *   	    }
 *   	}
 *  
 *  	1-2--> 
 *  	 (3-4-5-6, 4-5-6, 4번이 false면 7번으로 전송)
 *  	  2번이 false면 종료
 *  
 *  ****1차 for : 줄수
 *      2차 for : 실행문장
 *      
 *  ****
 *  ****
 *  ****
 *  ****
 *  
 *  for(int i=1; i<=4; i++)
 *  {
 *  	for (int j=1; j<=4; j++)
 *  	{
 *  	 System.out.print("*");
 *  	}
 *  }
 *  
 *      *
 *     **
 *    ***
 *  *****
 *  
 *  i   j   k
 *  줄수  공백    별표
 *  1   3   1
 *  2   2   2
 *  3   1   3
 *  4   0   4
 *  
 *  i+j=4 ==> j=4-i
 *  
 *  ****
 *   ***
 *    **
 *     *
 *     i j k
 *     i=j+1 ==>  j=i-1
 *     i+k=5 ==>  k=5-i
 *     
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int i=1; i<=4; i++)
			   {
			   	for (int j=1; j<=i-1; j++)
			   	{
			   		System.out.print(" ");
			   	}
			   	for (int k=1; k<=5-i; k++)
			   	{
		   		     System.out.print("*");
			   	}
			   	 System.out.println();
			   }
	}

}
