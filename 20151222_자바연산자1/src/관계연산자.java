/*
 * 관계연산자 ==> 결과값 (true/false) boolean
 *   == 같다 (*********)
 *   != 같지 않다
 *   < 작다
 *   > 크다
 *   <= 작거나 같다
 *   >= 크거나 같다
 */
public class 관계연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
	/*	boolean result=(a== ++b); //a=10, b=10
		System.out.println("result = "+result);
		result=(a== b++); //a=10, b=10
		System.out.println("result = "+result);
		result=(a== b); //a=10, b=11
		System.out.println("b = "+b);
		System.out.println("result = "+result);
		*/
		boolean result=(a!=b); //true
		System.out.println("result = "+result);
		
		System.out.println("b = "+b);		
		int c=b++;
		System.out.println("b = "+b);		
		/*
		 * int a=10;
		 * int c = ++a ==> c:11
		 * 
		 * int c = a++ ==> c:10
		 */
		result=(a!=c);
		System.out.println("c = "+c);
		System.out.println("result = "+result);

	}

}
