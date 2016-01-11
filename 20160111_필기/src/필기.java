/*
 * 1) 메소드
 *  => a. 그로그램 -> 명령문
 *  			  명령문: 관련있는 것끼리 묶어서 사용
 *     b. 기능-> 한가지 기능수행목적으로..
 *     c. 구성 (매개변수는 3개 이상이면 클래스 활용을 고려하라. 
 *     			DTO(Data Transfer Object~VO(Value Object)-- 단순 데이터 전달, 값만 포함)
 *     	 [1] 결과값 (리턴형)
 *     	 [2] 입력값 (매개변수)
 *     	 
 *     d. 형식
 *     		 리턴형 | 매개변수
 *     		  O  |   O    ex) string substring(int s, int e)
 *        	  O  |   X    ex) nextInt()
 *        	  X  |   O	  ex) println()
 *        	  X  |   X    ex) static void name(){}
 *       
 *       
 * 2) String
 * 	  => 데이터형 (char 2차원 배열 활용)
 * 	  => 클래스
 * 
 * 		 String s="hello";
 * 		 	
 * 		 String s=new String("hello");
 * 
 * 	  a. (string) substring(int, int)
 * 	  b. (int) length(string)
 *    c. (string) trim(string)
 *    d. (int) lastIndexOf(string)
 *    e. (int) indexOf(string)
 *    f. (boolean) startsWith(string)
 *    g. (boolean) endsWith (string)
 *    h. (string) valueOf (other data type)
 *    i. (string) replace (string) / replaceAll
 *    j. (char) charAt (string)
 *    
 * 
 * 
 * 
 * 3) 변수의 종류
 * 	 >> 전역변수 : a:static(공통), b:instance(개인) 변수 구분.
 * 		지역변수 : 블록 내 기능 처리를 위한 변수.
 * 		*객체지향의 3대 특성: 은닉화(데이터 감추기) / 캡슐화(변경가능) / 상속(재사용-다용성-변경 modify(override))
 * 														   (재사용-확장 new(overload))-메소드명은 같은데 매개변수가 다른경우.	
 * 		
 */
public class 필기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c=" abcdefg";
		
		System.out.println("substring return: "+c.substring(2, 5));
		System.out.println("index of return: "+c.indexOf('c'));
		String d=c.trim();
		System.out.println("trim return: "+d);
		int a = c.lastIndexOf('a');         
		System.out.println("lastIndexOf return a index: "+a);             
		System.out.println("startsWith return: "+c.startsWith("ab"));
		System.out.println("startsWith return: "+c.endsWith("fg")); 
		System.out.println("value of return: "+ String.valueOf(a));             
		System.out.println("replace return: "+c.replace("ab", "cc")); 	
		System.out.println("replaceAll return: "+c.replaceAll("cd","cc"));
		System.out.println("charAt return: "+c.charAt(2));
		 
	}

}
