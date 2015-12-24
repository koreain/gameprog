/*
 * 
 * =======================================
 *           &(*)        |(+)        ^
 * =======================================
 * 00		 0			 0			 0
 * =======================================
 * 01		 0			 1			 1
 * =======================================
 * 10		 0			 1			 1
 * =======================================
 * 11		 1			 1			 0
 * =======================================
 * 
 * 17 | 10
 * 10001
 * 01010
 * =====
 * 11011 ==> 27
 *  
 */
public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=a&5;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println("c = "+c);
		
		System.out.println("10|5 = "+(10|5));
		System.out.println("12|8 = "+(12|8));
		System.out.println("12|10 = "+(12|10));
		System.out.println("13|5 = "+(13|5));
		System.out.println("21|7 = "+(21|7));
		
		System.out.println("10&5 = "+(10&5));
		System.out.println("12&8 = "+(12&8));
		System.out.println("12&10 = "+(12&10));
		System.out.println("13&5 = "+(13&5));
		System.out.println("21&7 = "+(21&7));
		
		System.out.println("10^5 = "+(10^5));
		System.out.println("12^8 = "+(12^8));
		System.out.println("12^10 = "+(12^10));
		System.out.println("13^5 = "+(13^5));
		System.out.println("21^7 = "+(21^7));
	}

}
