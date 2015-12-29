/*
 * for 문을 사용해서 1부터 50까지 수 중 5의 배수를 출력하고 5의 배수의 합도 구해보세요
 * 
 * 결과
 * 5 10 15 20 --- 50
 * 5의 배수합: xx
 * 
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("5의 배수들");
		for(int i=1;i<=50;i++)
		{
			if(i%5==0)
			{
			 System.out.print(i+" ");
			 sum+=i;		
			}
		}
		System.out.println();
		System.out.println("5의 배수합:"+sum);
	}

}
