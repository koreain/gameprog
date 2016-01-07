/*
 * 
 * String (char x) 클래스
 *  1. 문자열 저장이 가능
 *  2. 기능수행(메소드)
 *  
 *  " " 이것이 바로 주소 ,, 따라서 "hello", "hello"는 둘다 같은 주소.
 *  String str = "hello"  str이라는 메모리 공간에 hello 100번지값을 갖게 된다.
 *  but,
 *  String str2 = new 
 *  
 *  문자열은 equals로 비교한다. (대소문자 구분)
 *  equals ignore case (대소문자 구분 안함)
 *  
 *  모든 클래스 선언 시,, 무조건 주소가 저장되는 것. 그런데 주소는 항상 4바이트로 저장되기 때문에 처음 선언시 무조건 4byte가 저장된다.
 *  
 *   String str2="java"
 *   
 *   기능들!!!!
 *   
 *    1) 문자열 비교     	  equals
 *    2) 좌우공백을 제거하는      trim
 *    3) 다른문자로 대체            replace
 *    4) 문자분리                      substring   str.substring(a,b) a번째 배열부터 출력해서 b-1번째 배열까지 출력
 * 	  5) 문자길이 		  length
 *    6) indexOf
 *    7) lastIndexOf
 *    8) valueof 윈도우나 웹은 정수나 실수 개념없이 문자열밖에 없다. 따라서 해당 메소드는 대상데이터를 모두 string 문자열로 바꾸어준다.
 *    9) startswith, endswith --> 특정 단어로 시작, 끝나냐를 보는 메소드. (자동검색기능 구현시 많이 활용)
 *   10) split 문자를 잘라서 저정할 때 쓰는 (리턴형이 String[])
 *   
 *   
 *   ********** java 예외처리. (db 초기 수업중에 완벽하게 정리하도록..)
 *   
 */

public class 필기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abc";
		String a2 = a.substring(1, 2);
		System.out.println(a2);
		int d=a.indexOf('c');
		System.out.println(d);
		int e=a.lastIndexOf('c');
		System.out.println(e);
		
	}

}
