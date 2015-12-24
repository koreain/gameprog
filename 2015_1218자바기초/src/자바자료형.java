/*
 *  자료형 : 메모리 크기 ==> 데이터 저장시마다 메모리 크기를 결정
 *   (1byte, 2byte, 4byte, 8byte)
 *   
 *   1) 정수 저장
 *       byte (1byte) -128 ~ 127        2의7승까지
 *       short (2byte) -32768 ~ 32767   2의16승
 *       int (4byte) -21억 4천 ~ 21억4천            2의64승 (default) 왜냐, 메모리가 대부분 4byte로 되어있기때문에
 *       long (8byte) 100L, 100 100L은 8바이트 Long으로, 100은 4바이트 int로 인식  
 *   2) 실수 저장
 *       float (4byte)  10.5F => 소수점 6자리
 *       double (8byte) 10.5 (default) => 소수점 15자리
 *   3) 문자 저장 (2byte) => 음수값이 없다. (0~65535)
 *       싱글바이트 (1byte) : ASC
 *       멀티바이트 (2byte) : Unicode (자바는 유니코드를 사용한다)
 *       char
 *   4) 논리 저장
 *       boolean => true/false
 *   5) 참조 ==> 클래스, 배열 (데이터를 모아서 사용하는 것) 데이터는 모을 수록 활용하기 쉬워짐
 */
public class 자바자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double d=123456.78;
		float d =123456.78F; // float인 경우 double과 다르게 부동소수점에 영향을 받지 않아서 78로 나온다
		int i=(int)((d-123456)*100);//(int)0.78 * 100 = 0*100 = 0
									//(int)(0.78*100) = (int)(77) 부동소수점 때문에
		System.out.println(i);
		System.out.println((int)'A');
		System.out.println((char)65);
		System.out.println((int)10.5);
	/*
	 * byte < short < int < long < float < double
	 *        char
	 * = 변환
	 *   UP DOWN
	 *   (char)65 down 변환
	 *   (int)10.5 down 변환
	 *   (double)10 up 변환
	 *   
	 *   자동형변환
	 *   10 + 10.5 = 20.5
	 *   int  double  double
	 *   
	 *   ===
	 *   10.0 (먼저 int가 double형태로 자동 형변환 된 후에 연산된다.)
	 *        + 10.5 = 20.5
	 *        
	 *  'A' + 1 ==> 66
	 *  ==
	 *  65 (char가 int로 자동 형변환 된다)
	 *      + 1 ==> 66      
	 *      
	 *  byte+byte = int
	 *  short+byte = int
	 *  short+short = int
	 *  char+char = int
	 */ 
		char ch1=0x41;
		System.out.println(ch1);
		double e1=7.125;
		
		long n1=10000000000L;
		
		System.out.println(e1);
		System.out.println(n1);
		
	}

}
