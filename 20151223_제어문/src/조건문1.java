/*
 *   제어문  프로그램에 맞게 제어를 하는 프로그램
 *   조건문
 *    단일 if
 *     1) 형식
 *        => if(조건문)
 *              문장    ====> 조건문이 true면 문장이 수행
 *              	====> 조건문이 false면 문장을 수행하지 않는다.
 *        => 여러개의 문장을 동시에 제어
 *           if(조건문)
 *           {
 *             문장1
 *             문장2
 *           }
 *           ****** 자바에서 제어문은 {}블록이 없는 경우에
 *           		바로 밑에 있는 문장 1개만 제어를 한다.
 *           
 *        => 조건이 true, false일 때, 다른 문장을 수행
 *           if(조건문)
 *             문장1
 *           else
 *             문장2   
 *             
 *             자바에서 클래스를 가져올때는 import!!
 */

import java.util.Scanner;
//Scanner : 키보드 입력값을 받는 경우

public class 조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수  Math.random() => 0.0~0.99
		//int rand=(int)(Math.random()*100)+1;
		//System.out.println("rand = "+rand);
		/*Scanner scan=new Scanner(System.in);
		System.out.print("정수입력:");
		int num=scan.nextInt(); //nextInt!!이기 때문에 정수만 받아온다.
		System.out.println("num="+num);*/
		int com=(int)(Math.random()*3); //0,1,2 0일 때 가위, 1일때 바위, 2일때 보
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) 입력:");
		int user=scan.nextInt();
		
		if(user==0)
			System.out.println("사용자:가위");
		if(user==1)
			System.out.println("사용자:바위");
		if(user==2)
			System.out.println("사용자:보");
		
		if(com==0)
			System.out.println("컴퓨터:가위");
		if(com==1)
			System.out.println("컴퓨터:바위");
		if(com==2)
			System.out.println("컴퓨터:보");
		
		// 결과
		
/*		if(com==0) //컴퓨터 가위
		{if(user==0) 
			System.out.println("비겼다");
		 if(user==1)
			System.out.println("사용자가 이겼다");
		 if(user==2)
			System.out.println("컴퓨터가 이겼다");
		}
		
		if(com==1) //컴퓨터 바위
		{if(user==0) 
			System.out.println("컴퓨터가 이겼다");
		 if(user==1)
			System.out.println("비겼다");
		 if(user==2)
			System.out.println("사용자가 이겼다");
		}
		
		if(com==2) //컴퓨터 보
		{if(user==0) 
			System.out.println("사용자가 이겼다");
		 if(user==1)
			System.out.println("컴퓨터가 이겼다");
		 if(user==2)
			System.out.println("사용자가 이겼다");
		}
	*/
		/*
		컴퓨터
		 0    사용자 
		     0==>0   	비김
		     1==>-1		유저
		     2==>-2		컴
		컴퓨터
		 1      사용자
		  	 0==>1		컴
		  	 1==>0		비김
		  	 2==>-1		유저
		컴퓨터
		 2      사용자
		     0==>2		유저
		     1==>1		컴
		     2==>0	  	비김
		
		*  ==> user: -1, 2 
		*  ==> com: -2, 1
		*  ==> 비김: 0
		*/	
		int res=com-user;
		if(res==-1 || res==2)
			System.out.println("유저가 이겼다");
		if(res==-2 || res==1)
			System.out.println("컴퓨터가 이겼다");
		if(res==0)
			System.out.println("비겼다");
	}

}
