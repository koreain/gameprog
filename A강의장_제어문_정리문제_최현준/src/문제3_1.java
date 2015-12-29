/*
 * 1~101
 * 짝수 / 홀수 개수
 * 
 */
public class 문제3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		
		for(int i=1; i<=101;i++)
		{
			if(i%2==0)
				even++;
			if(i%2!=0)
				odd++;
			
		}
			System.out.println("짝수 개수: "+even);
			System.out.println("홀수 개수: "+odd);
			/*
			 *  단항연산자
			 *  = 증감연산자 (++, --)
			 *    한개 증가, 감소
			 *    => 전치 연산자
			 *       ++a => 먼저 증가후에 다른 연산 수행
			 *       int a=10;
			 *       int b=++a;
			 *        1) ++a;
			 *        2) b=a
			 *    => 후치 연산자
			 *    	 a++ => 다른 연산 수행후 증가한다.
			 *    	 int a=10; 
			 *       int b=a++;
			 *       1)b=a
			 *       2)a++
			 *  = 부정연산자 (!) : boolean
			 *  	true => false
			 *  	false => true
			 */
	}

}
