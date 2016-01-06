import java.util.Scanner;

public class 메소드숫자야구게임 {

	
	/*
	 * 지역변수 : 사용범위
	 * 		  지역변수는 반드시 초기화
	 * 		 => 직접  입력
	 * 			int a=10;
	 * 		 => scan.nextInt()
	 * 		 => Math.random()
	 * 
	 * 사용범위 => {}
	 * for(int i=0; i<=10; i++)
	 * {
	 * } //i는 메모리에서 삭제
	 * System.out.println(i); => error
	 * 
	 * 지역변수의 종류
	 * 	1) 메소드안에 선언
	 *  2) 매개변수
	 *  3) 누적변수, 루프변수, 스위치변수, 플러그......
	 * 
	 * 	for()
	 *  
	 * 
	 * 
	 */
	
	static int[] getRand()
	{
		int[] com=new int[3];
		int su=0; //난수 발생시 저장할 변수
		boolean bDash=false; //중복여부를 확인
		for(int i=0; i<3; i++)
		{ bDash=true;
			while(bDash) //난수 발생, 중복 체크
			{
				
				//난수발생
				su=(int)(Math.random()*9)+1;
				//1~9
				//중복체크
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true; //while문 다시 수행
						break;
						/*
						 * break
						 * continue
						 *  : 자신의 반복문만 제어
						 */
					}
				}
			}
			com[i]=su;
		}
		
		return com;
	}
	/*
	 * 리턴값은 1개다
	 * 	=> 데이터가 여러개 = 배열, 클래스
	 */
	
	// 사용자 입력
	
	static int[] userInput()
	{
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		int input=0;
		while(true)
		{
			System.out.println("세자리 정수를 입력:");
			input=scan.nextInt();
			
			if(input<100||input>999)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("중복된 수는 사용할 수 없다");
				continue;
			}
			break;
		}
		
		return user;
	}
	
	//비교
	
	static int compare(int[] com, int[] user)
	{
		int s=0,b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
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
		hint(user,s,b);
		return s;
	}
	
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d-%d-%d, Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	
	// 종료
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	
	static void process()
	{
		int[] com=getRand();
		while(true)
		{
			int[] user=userInput();
			int s=compare(com, user);
			if(isEnd(s))
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("게임을 다시 할까요(y/n)?");
				String res=scan.nextLine();
				char ch=res.charAt(0); //한자리만 가져오는 명령문 charAt
				if(ch=='y')
				{
					System.out.println("새게임이 시작되었습니다.");
					process();
				}
				else
				{
					System.out.println("Game Over!!");	
					System.exit(0);
				}
			}
		}
		
		/*for(int i=0; i<3; i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.println();
		for(int i=0; i<3; i++)
		{
			System.out.print(user[i]+" ");
		}*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			process();
	}

}
