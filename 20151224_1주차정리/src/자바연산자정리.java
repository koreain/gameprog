/*
 * 1) 단항연산자 ( 증감 (++, --), 부정(!))
 * 
 *  전치연산
 *    형식) int a=10;
 *    		int b= ++a;
 *    		=> a를 1개 증가
 *          => 증가된 값을 b에 대입
 *          
 *  후치연산
 *        int a=10;
 *        int b=a++;
 *        => a값을 b에 먼저 대입
 *        => a값을 1개 증가
 *        
 *  2) 부정 연산자 (조건문 => if)
 *  boolean bCheck=false;
 *  bCheck=!bCheck;
 *  bCheck=true
 *  =====> false => true, true => false
 *  
 *  
 *  이항연산자
 *  
 *  1)산술 (+,-,*,/,%)
 *   => 형변환 (=> 연산 시 큰 데이터형으로 변환)
 *   	예) int + long = long
 *   	   int + int + double = double
 *   	   ***** int 이하는 연산시 => int
 *    	        예) char + char = int
 *    		  byte + byte = int
 *    
 *    => / (나누기)
 *     0으로 나누면 error
 *     정수/정수 =정수 (실수점을 제외)
 *     5/2 => 2.5(x), 2(o)
 *    
 *    => %
 *       남는 값은 항상 왼쪽편의 부호를 유지
 *       -5%-2 ==> -1  
 *  
 *  2)관계 (==, !=, <, >, <=, >=)
 *  	 결과값 : true, false (boolean)
 *  	==> (<==)    < || ==
 *  		 5<=6  5<6 || 5==6
 *  
 *  3)논리 (&&, ||)  최적화연산
 *  && ==> 한쪽이라도 false 일 때 ==> false
 *  || ==> 한쪽이라도 true 일 떄 ==> true
 *  
 *  4)대입(=, +=, -=)
 *  int a=10;
 *  a+=1, a=a+1
 *  a-=1, a=a-1
 *  
 * 
 */

// 년도를 입력을 받아서 윤년인지 여부를 확인
/*
 *    4년마다 한번씩 오고
 *    100년마다 윤년에서 제외
 *    400년마다 윤년
 *
 *    if((year%4==0 && year%100!=0)||(year%400==0))
 */
/*
 *   제어문
 *    if(조건문)
 *    
 *    형식)
 *       if(조건문)
 *       {
 *         //조건문이 true일 경우에 수행하는 문장
 *       }
 *       *** {}이 없는 경우에는 바로 밑에 한 문장만 제어한다.
 *       
 *       if(조건문){
 *       {조건문이 true일 경우에 실행하는 문장)
 * 		 }
 * 
 * 		 else if{
 *  	  *       {조건문이 true일 경우에 실행하는 문장)}
 *  
 *  	 else{
 *    		if 조건상이 없는 경우에 수행하는 문장	
 *    		}
 *  (
 *  
 * 		  ㅑㄹ(whrjsas
 * 
 */
import java.util.Scanner;
public class 자바연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도입력: ");
		int year=scan.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0)){
			System.out.println(year+"년도는 윤년입니다.");
		}
		else{
			System.out.println(year+"년도는 윤년이 아닙니다.");
		}
	}

}
