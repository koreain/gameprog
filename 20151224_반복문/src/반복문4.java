/*
 * 
 * for
 *  형식)
 *  			  6		5
 *   		1     2     4
 *     for(초기화; 조건식; 증가식)
 *      {
 *             실행문장1
 *             실행문장2 
 * 			==========3 7
 * 
 *	1 => 2 (조건 검색)
 *		   => true ==> 3 ==> 4.증가식
 *         => false ==> 종료
 *      증가후에 ==> 2 (조건검색) 
 * 
 *////////////////////////////////////////*
 /* 무한루프!!!
 * 
 * for(;;)
 * 안에 break 문이 꼭 있어줘야한다.
 * (continue는  특정 부분을 뺴고 진행된다.)
 * 
 * 1~5까지하고 break 걸면 1,2,3,4 끝
 *         continue 걸면 1,2,3,4,6,7,8,9,10
 *  
 */
// 1-2+3-4+5-6+7-8+9-10
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int val=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0)
				val-=i;
			if(i%2!=0) //else
				val+=i;
		}
		System.out.println(val);*/
		
		for(char i='A'; i<='Z'; i++){ //초기값은  정수,실수,문자가 될 수 있다.
			System.out.print((char)(i+32)+" ");
		}
	}

}
