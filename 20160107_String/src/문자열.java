/*
 * 
 * 	문자열 ==> 문자 여러개 묶어서 사용
 * 		   ===========
 * 			  char[] ==> 조작해서 만든 클래스 : String
 * 
 * 	1) 사용 형식
 * 		String	변수명 = "값";
 * 		======  ===	  ====
 *  	  클래스 	객체	  객체변수값 => 객체: 사용자 정의 데이터형에 대한 변수명
 *		String 변수명 = new String("값");
 *					====
 *					새로운 메모리 생성 => 저장
 *					malloc() 메모리 생성 => free()메모리 해제 (c언어)
 *					new => System.gc() (자바)
 *
 *		String str = new String("java")
 *		자바메모리
 *		===============================
 *		method 영역
 *		===============================
 *		stack => 메모리에 의해 저장 (지역변수, 매개변수)
 *		===============================
 *		heap => 개발자가 저장 (new를 이용해서 할당)
 *		===============================
 *
 *		String str=new String("java");
 *		==========	   ===============
 *		  str			    (java)
 *		  100				 100
 *		==========	   ===============				
 *		 stack범위		   heap범위
 *
 *		 참조변수 ..라 한다.
 *		 참조변수 : 배열, String
 *
 *		String : 데이터형, 기능 (클래스기 때문에)
 *		1) equals : 문자열 비교
 *		2) length : 문자크기
 *		3) substring : 문자분해
 *		4) split : 문자분해
 *		5) startsWith, endsWith : 자동 완성기
 *		6) trim : 좌우 공백 제거
 *		7) indexOf, lastIndexOf : 원하는 위치의 문자 위치
 *		8) replace : 다른 값으로 변경
 *		9) valueOf : 모든 데이터형을 문자열로 변경
 *	   10) chatAt : 해당 문자열에서 특정위치의 문자 한개를 가지고 올 때
 *		"java".concat("aaa")=> javaaaa
 *		"java"+"aaa" => javaaaa (더 편함)
 *
 *
 *
 */
public class 문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String str1="hello";
		String str2=new String("Hello");
		if(str==str1)
			System.out.println("str과 str1은 같다(주소)");
		if(str==str2)
		{
			System.out.println("str과 str2은 같다(주소)");
		}
		else
		{
			System.out.println("str과 str2은 다르다(주소)");
		}
		
		if(str.equalsIgnoreCase(str2)) //대소문자 구분 안함.
		{
			System.out.println("str과 str2은 같다(문자열)");
		}
		else
		{
			System.out.println("str과 str2은 다르다(문자열)");
		}
		
		
	}

}
