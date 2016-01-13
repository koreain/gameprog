/*
 * 	클래스 발전 과정
 * 		변수 ==> 배열 ==> 구조체  ==> 클래스
 * 		: 데이터를 모아서 관리
 * 		변수 : 단일 데이터를 저장해서 사용
 * 		배열 : 같은 크기의 데이터를 저장해서 사용
 * 		구조체 : 다른 크기의 데이터를 모아서 사용 (모든 데이터=>공개)
 * 		클래스 : 구조체 + 메소드 (비공개)
 * 
 * 		클래스의 구성 요소
 * 			데이터(속성)
 * 				=> 멤버변수
 * 					공통변수 (클래스) ==> static
 * 					객체변수 (인스턴스 변수) ==> (X)
 * 					사용법
 * 					 class A
 * 					 {
 * 						int a;
 * 						static int b;
 * 					 }
 * 					 b변수는 클래스를 가상머신 읽어올 경우에 저장
 * 					 a변수는 저장 공간 만든후에 사용이 가능(new)
 * 					 A aa=new A();
 * 					
 * 					 stack
 * 					 === aa
 * 					 100
 * 					 ===			heap
 * 									=== 100
 * 									 a
 * 									===
 * 			메소드(기능) : 저장된 변수에 대해서 동작 수행
 * 
 * 			클래스 제작
 * 			1) 추상화 작업: 설계(모델링)
 * 				=> 현실세계의 모든 사물을 단순화
 * 	
 * 				사람
 * 				==========
 * 				 이름
 *  			 성별
 *  			 주민번호
 *  			 입
 *  			 눈
 *  			 코
 *  			 귀
 *  			==========
 *  			 입=> 말하다
 *  			 귀=> 듣는다
 *  			 눈=> 본다
 *  		 	==========
 *  
 * 			2) 구체화 작업: 모델링 내용을 시뮬레이션
 * 			
 * 			1) 변수 ==> 배열 , 클래스
 * 			2) 명령문 모으면 메소드
 * 			3) 클래스 ==> 패키지 (네트웍 필수 패키지유형 3개, 서버/클라이언트/공통)
 * 					패키지:폴더... // 패키지는 import로 부른다. // 
 * 			===============================================
 * 			클래스 형식( java )
 * 			1) package
 * 			2) import ==> 여러개
 *			3) class className
 *			   {
 *				 변수 선언
 *				=============
 *				 메소드 선언
 *				=============
 *				 생성자 선언 => 생략가능 (생성자 선언을 활용한 예, 로그인 유지 기능(실행하자 마자)
 *				=============
 *			    }
 *
 *		숫자야구게임
 *		  1 난수        ==> com[]
 *		  2 입력        ==> user[] 
 *		  3 비교        ==> com[] user[] ==> s,b
 *		  4 힌트        ==> s,b
 *	 	  5 종료        ==> s
 *
 *		   기능을 잡다 보면 공통으로 쓰이는 변수들이 보이고 이를.. 멤버변수로 잡는다.
 *
 *		 void test()
 *		 {
 *		   int a=10;
 *		   System.out.println(a);
 *		   a++;
 *		 }
 *
 *		 test();   ==> 10
 *		 test();   ==> 10	
 *		 test();   ==> 10
 *
 *       int a=10;
 * 		 void test()
 *		 {
 *		   System.out.println(a);
 *		   a++;
 *		 }
 *
 *		 test();   ==> 10
 *		 test();   ==> 11	
 *		 test();   ==> 12
 *
 */
import javax.swing.*;
/*
 * 		생략: 1. extends Object ( . 찍으니까 여러개 나오는데 이게 Object가 가지고 있는 모든 것을 활용할수 있다는 의미)
 * 		     2. import (java.lang.* :  String, System, Math . . . .)
 *			 3. 예외처리 ==> 실행 시 예외 (예외처리 생략)
 *						   컴파일 시 예외 
 */
public class 클래스 {
	
	//멤버변수
	int[] com=new int[3];
	int[] user=new int[3];
	int s,b; //멤버변수 ==> 자동으로 0초기화
	
	void getRand()
	{
		int su=0;
		boolean bDash=false;
		for(int i=0; i<3;i++)
		{
			bDash=true;
			while(bDash)
			{
				bDash=false;
				su=(int)(Math.random()*9+1);
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true;
						break;
					}
				}
			}
			com[i]=su;
		}
	}
	
	void userInput()
	{
		
		while(true)
		{
			String input=
					JOptionPane.showInputDialog("세자리 정수 입력:");
			if(input.length()!=3)
			{
				JOptionPane.showMessageDialog(null,"잘못된 입력입니다.");
				continue;
			}
			user[0]=input.charAt(0)-'0'; // '1' ==> 49
			user[1]=input.charAt(1)-'0'; // '2'
			user[2]=input.charAt(2)-'0'; // '3'
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				JOptionPane.showMessageDialog(null,"중복된 수는 사용할 수 없습니다.");
				continue;
			}
		  break;
		}
	}
	
	void compare()
	{
	  s=0;
	  b=0;
	  
	  for(int i=0;i<3;i++)
	  {
		for(int j=0; j<3; j++)
		{
			if(com[i]==user[j])
			{
				if(i==j)
				s++;
				else
				b++;
			}
		}
	  }
		
	}
	
	void hint()
	{
		System.out.printf("Input Number:%d-%d-%d,Result:%dS-%dB\n",
							user[0],user[1],user[2],s,b);
	}
	
	boolean isEnd()
	{
		if(s==3)
			return true; //모든 메소드는 return이 있으면 종료
			return false;
	}
	
	
	void process()
	{
		getRand();
		while(true)
		{
			userInput();
			compare();
			hint();
			if(isEnd())
			{
				int a=JOptionPane.showConfirmDialog(null, "종료할까요?","선택"
													,JOptionPane.YES_NO_OPTION);
				if(a==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(null, "게임을 종료합니다.");
					System.exit(0);
				}
				else
				{
				JOptionPane.showMessageDialog(null, "새 게임을 시작합니다.");
				process();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		클래스 a=new 클래스();
		a.process();
	}

}
