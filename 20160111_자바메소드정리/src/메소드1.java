/*
 * 	메소드 구성요소
 * 		=> 결과값 (리턴형)
 * 		=> 입력값 (사용자) => 매개변수 (지역변수)
 * 		   : 메소드 안에서 사용하는 변수
 * 			* 사용자 입력값
 * 			* 다른 메소드로 전송
 * 			   =====> 전체에서 사용하는 변수 (멤버변수)
 * 			   변수)
 * 				멤버변수 : 프로그램 종료시에 사라진다.
 * 				 = instance 변수 (객체변수)
 * 				 	저장이 따로 된다.
 * 				 = static 변수
 * 					저장공간이 하나다. (공유변수)
 * 				지역변수
 * 				 = {} 안에서만 사용되는 변수
 * 
 *       1) 리턴형 O, 매개변수 O
 *       	String substring (int s, int e)
 *       2) 리턴형 O, 매개변수 X
 *       	double random()
 *       3) 리턴형 X, 매개변수 O
 *       	void print(String s)
 *       4) 리턴형 X, 매개변수 X
 *       	void actionPerformed()
 *       
 *       
 *    => 형식)
 *    	 	선언부
 *    	 	구현부
 *    		String substring(int s, int e)  ===> 선언부 (선언부만 있는 클래스를 추상클래스, 인터페이스라 한다.)
 *			{
 *				구현부
 *			}    		
 *
 *		String Class 
 *		사용법	 ┌ 주소값을 저장한다.
 *		  String s = 값
 *		  ====== == 변수
 *		   데이터형 (사용자 정의)
 *
 *		   같은 값을 새로운 메모리에 저장 : new
 *		 String s1 = new String("aaa");
 *		 String s2 = new String("aaa");			
 *		 String s3 = new String("aaa");
 *		 String s4 = new String("aaa");
 *		 String s5 = new String("aaa");
 *		 String s6 = "aaa";
 *		 String s7 = "aaa";
 *
 *		=> 주요기능
 *			1) substring
 *			2) indexOf, lastIndexOf
 *			3) startsWith, endsWith
 *			4) trim()
 *			5) length()
 *			6) split
 *			7) valueOf
 *			8) replace, replaceAll
 *			9) charAt()
 *================================================================
 *
 *		이차원배열 : 일차원배열 여러개를 모아서 관리
 *		형식)
 *		     데이터형[행][열] 배열명;
 *		  데이터형 배열명 [행][열];
 *		데이터형[행] 배열명[열];
 *		행 : 줄수 => 일차 for
 *		열 : 데이터 갯수 => 이차 for
 *
 *		예)
 *			5명의 학생
 *				국어, 영어, 수학, 총점, 평균, 학점
 *			[5][6]
 *
 */
public class 메소드1 {
	static boolean tf(String a, String b)
	{
		boolean bCheck = false;
		if(a==b)
		{
			bCheck = true;	
		}
		return bCheck;
	}
	
	static boolean tf2(String a, String b)
	{
		boolean bCheck = false;
		if(a.equals(b)==true)
		{
			bCheck = true;	
		}
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 //메소드1 a=new 메소드1();
			 //System.out.println(a); //a는 주소값을 저장한다.
			 String a = new String("aaa");
			 String b = new String("aaa");			
			 String c = new String("aaa");
			 String d = new String("aaa");
			 String e = new String("aaa");
			 String f = "aaa";
			 String g = "aaa";
			 System.out.println("a: "+a);
			 System.out.println("b: "+b);
			 System.out.println("c: "+c);
			 System.out.println("d: "+d);
			 System.out.println("e: "+e);
			 System.out.println("f: "+f);
			 System.out.println("g: "+g);
			 
			 System.out.println("a-b address comparison: "+tf(a,b));
			 System.out.println("b-c address comparison: "+tf(b,c));
			 System.out.println("c-d address comparison: "+tf(c,d));
			 System.out.println("d-e address comparison: "+tf(d,e));
			 System.out.println("e-f address comparison: "+tf(e,f));
			 System.out.println("f-g address comparison: "+tf(f,g));
			 
			 System.out.println("a-b contents comparison: "+tf2(a,b));
			 System.out.println("b-c contents comparison: "+tf2(b,c));
			 System.out.println("c-d contents comparison: "+tf2(c,d));
			 System.out.println("d-e contents comparison: "+tf2(d,e));
			 System.out.println("e-f contents comparison: "+tf2(e,f));
			 System.out.println("f-g contents comparison: "+tf2(f,g));
			 
			 
	}

}
