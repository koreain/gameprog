/*
 *  단일 IF
 *    if(조건문)
 *     문장1
 *     
 *    if(조건문)
 *     문장1
 *     문장2
 *     
 *    if(조건문){
 *     문장1
 *     문장2
 *     } 
 */
public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='a'; //char => 연산자가 들어가면 정수
		if(ch>='A' && ch<='Z') // && : 범위포함 경우, || : 범위를 벗어난 경우
		  System.out.println("대문자");
		if(ch>='a' && ch<='z')
		  System.out.println("소문자");
		
		/*
		 * if(!(ch>='Z' && ch<='A'))
		 * System.out.println("소문자");	
		 * 바로 위와 같은 결과를 내는 코딩이지만 방식은 이처럼 여러가지가 될 수 있다.
		 * 따라서 일정패턴. 코딩을 하는 자신만의 패턴을 정착시키는 것이 차후
		 * 코딩 시 빠르고 익숙하게 코딩을 할 수 있는 길이 된다.
		 * 
		 * 1) !
		 * 2) 관계연산자 (==, !=, >, <, >=, <=, instanceof)
		 * 3) 논리연산자 (!, &, |, &&, ||)
		 * 
		 */
		 
		
	}

}
