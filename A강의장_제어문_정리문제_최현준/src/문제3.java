/*
 *	3번문제
 *	for문을 사용하여 1부터 100까지 수중 
 *	짝수합, 홀수합을 구해 보세요.
 * 
 */
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even=0;
		int odd=0;
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			even+=i;
			else
			odd+=i;	
		}
		System.out.println("짝수합:"+even);
		System.out.println("홀수합:"+odd);
	}

}
