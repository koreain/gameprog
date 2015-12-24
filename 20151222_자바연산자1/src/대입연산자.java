/*
 * 	대입연산자
 *  =
 *  +=
 *  -=
 *  *=
 *  /=
 *  op=
 *  
 *  int a=10;
 *  ==================
 *  a+=1  a=a+1
 *  ==================
 *  a-=1  a=a-1
 *  ==================
 *  a*=3  a=a*3
 *  ==================
 *  a/=3  a=a/3
 *  ==================
 *  한개 증가 할 경우 (다음 4가지 중에 
 *  ++a
 *  a++
 *  a+=1
 *  a=a+1
 */
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*******
		int a=10;
		//*******
		a+=5; //a=a+5 a=15
		System.out.println("a = "+a);
		//*******
		a-=5; //a=a-5 a=10
		System.out.println("a = "+a);
		a*=2; //a=a*2 a=20
		System.out.println("a = "+a);
		a/=3;  //a=a/3 a=6
		System.out.println("a = "+a);		
		a<<=2; //6 * 2^2
		System.out.println("a = "+a);
		a>>=3; // 24/(2^3) = 3
		System.out.println("a = "+a);
	}

}
