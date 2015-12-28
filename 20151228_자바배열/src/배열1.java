/*
 * 	배열
 * 	 = 같은 데이터형의 변수를 모아서 관리
 *	        변수(한옥집), 배열(아파트)
 *	 = 일반변수 : 변수(5)
 *     변수명 5개 int a=1, b=2, c=3, d=4, e=5
 *     배열은 1개의 배열명으로 여러개 데이터 처리
 *     연속적으로 메모리 배치 (관리가 쉽다)
 *     3개 이상의 변수는 배열을 잡고 코딩하는게 효율적이다.
 *     
 *     1) 형식
 *     
 *       int[] 배열명={1,2,3,4,5}; 5개의 데이터가 배치되었음.
 *      (데이터형)
 *      
 *      int[] a={1,2,3,4,5}
 *      ===================================
 *      1		2		3		4		5
 *      ===================================
 *      a[0]   a[1]	   a[2]	   a[3]	   a[4] ==> 일반 변수와 동일
 *      
 */
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=(int)(Math.random()*45)+1;
		int a2=(int)(Math.random()*45)+1;
		int a3=(int)(Math.random()*45)+1;
		int a4=(int)(Math.random()*45)+1;
		int a5=(int)(Math.random()*45)+1;
		int a6=(int)(Math.random()*45)+1;
		System.out.println("첫번쨰 번호:"+a1);
		System.out.println("두번쨰 번호:"+a2);
		System.out.println("세번쨰 번호:"+a3);
		System.out.println("네번쨰 번호:"+a4);
		System.out.println("다섯번쨰 번호:"+a5);
		System.out.println("여섯번쨰 번호:"+a6);
		
		int[] arr= new int[6]; //int를 6개 만들어 주는데 0으로 초기화시키는 방법.
		for(int i=0; i<6; i++)
		{
			arr[i]=(int)(Math.random()*45+1);
			System.out.println(arr[i]);
		}
		
	}

}
