/*
 * 프로그램 구현 방법
 * 	1) 데이터저장 => 변수 
 * 	2) 데이터 연산처리 => 연산자
 *  3) 처리된 결과 출력	 => System.out.println()
 *     => System.out.println() : new Line
 *        System.out.println("abc");
 *        System.out.println("def");
 *        abc
 *        def
 *     	  System.out.print() : 가로 출력
 *        System.out.print("abc");
 *     	  System.out.print("def");
 *        abcdef
 *        System.out.printf() : 서식을 가지고 있는 출력
 *        System.out.printf("%d%d%d",10,20,30);
 *        102030 	
 *        System.out.printf("%5d%5d%5d",10,20,30);
 * 		  10 20 30
 * 
 *        자바: SUN ==> Oracle
 *            ===	  =======
 *            1.7		1.8  => pointer   <-람다식, 나즈혼
 *                          c + 파이썬
 * 
 *  * 비트이동 연산자 (<< 왼쪾이동, >> 오른쪽이동)
 * 10<<2 ==> 이진법으로 변환후에 뒤에 0을 2개 붙여라.
 * 10=> 1010 (1010 00) 
 * x << y ==> x*2^y
 * 
 * 10>>2 ==> 이진법으로 변환후에 뒤에서 2개 제외
 * 10 => 10(10)ㅌ == 10(2)
 * x>>2 ==> x/(2^y)
 *  * 
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		System.out.printf("%5d%5d%5d",10,20,30);
		System.out.printf("%-5d%-5d%-5d",10,20,30);*/
		
		int a=10;
		int b=2;
		int c=a<<b;
		int d=a>>b;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		//System.out.println(Integer.toBinaryString(a));
		//System.out.println(Integer.toBinaryString(c));
	}

}
