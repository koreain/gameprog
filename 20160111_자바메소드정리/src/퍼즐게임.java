/*
 * 기능도출 > 변수도출
 * 
 * 1) 난수 생성 ==> 배열 저장
 * 2) 출력 ==> 출력 (배열)
 * 3) 입력 ==> 정수 
 * 4) 종료 ==> 배열의 순서 비교
 * 5) 조립
 * 
 *  변수
 *  1)변수의 종류
 *  				메모리위치       / 메모리 저장 시점     /  사용범위
 *    ============================================================
 *     static		   method	 컴파일시에 자동            클래스 전체
 *        ==> 공통변수, 클래스 변수
 *        	    클래스이름.변수명
 *        	  ==> 메모리 공간 1개
 * 	  ============================================================
 * 	   instance		   heap		 new연산자 사용시에	클래스 전체
 * 		  ==> 객체변수
 * 			    객체이름.변수명
 * 			  ==> new 사용 개수만큼 생성
 * 	  ============================================================
 * 	   local		   stack	 메소드 호출시		메소드 안에서만
 * 		  ==> 지역변수 (블록을 빠져나가면 사라짐)
 *    ============================================================
 */
import java.util.Scanner;
public class 퍼즐게임 {

	static int[][] panCount = new int[3][3]; //멤버변수 예시 (전역 static 변수)
	static int brow, bcol; //멤버변수 예시 (전역 static 변수)
	//// 이러한 멤버변수는 => 자동으로 초기화(int=0, String=null...)
	
	//난수발생
	static void getRand()
	{
		int[] temp=new int[9];
		int su=0;
		boolean bDash=false;
		for(int i=0;i<9;i++)
		{
			bDash=true;
			while(bDash)
			{
				//난수 발생
				bDash=false;
				su=(int)(Math.random()*9);
				for(int j=0; j<i;j++)
					if(temp[j]==su)
					{
						bDash=true;
						break;
					}

			}
			temp[i]=su;
			panCount[i/3][i%3]=temp[i];
			if(su==8)
			{
				brow=i/3;
				bcol=i%3;
			}
		}

		/*
		 *  	0 		  1 		 2
		 *   0/3,0&3   0/3,1&3    0/3,0&3
		 *    (0,0)     (0,1)      (0,2)
		 *  	3 		  4 	     5
		 *  	6 		  7	 		 8
		 *  즉! 1차원 배열을 2차원으로 바꿀 때, 열 개수로 나누어 준값(행), 열개수로 나누고 나머지(열)
		 *  또한! 2차원 배열을 1차원으로 바꿀 때, 행*열개수+열
		 */
	}
	
	static void display()
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i==brow && j==bcol)
					System.out.print("  ");
				else
					System.out.print((panCount[i][j]+1)+" ");
			}
			System.out.println();
		}
	}
	
	static void process()
	{	boolean Dash=true;
		getRand();
		display();
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("1~8까지 정수입력: ");
			int input=scan.nextInt();
			int a=0;
			int b=0;
			for(int i=0; i<3;i++)
			{ 

				for(int j=0; j<3;j++)
				{
					if(panCount[i][j]+1==input)
					{
						a=i;
						b=j;
						break;
					}
					
				}
				
			}
			panCount[brow][bcol]=panCount[a][b];
			panCount[a][b]=8;
			brow=a;
			bcol=b;
			display();
			if(isEnd()){
				System.out.println("Game Over!!");
				break;
			}
		}
	
	}
	
	static boolean isEnd()
	{
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(panCount[i][j]!=k)
					return false;
				k++;
			}
		}
	return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
