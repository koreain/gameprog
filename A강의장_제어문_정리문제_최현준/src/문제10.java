/*
 * 1부터 100까지 수중 3의 배수합을 구하고 3의 배수 출력하기 (do~while 이용)
 * 변형(특정 범위 내의 3의 배수 값을 출력하고 그 합을 구해보자)
 */
import java.util.Scanner;
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">> 시작값과 종료값 사이의 3배수를 출력하고 그 합을 구합니다. <<");
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값 입력");
		int start=scan.nextInt();
		System.out.println("종료값 입력");
		int end=scan.nextInt();
		int sum=0;
		do
		{
			if(start%3==0)
			{
			System.out.print(start+" ");
			sum+=start;
			}
			start++;
		}
		while(start<=end);
		System.out.println();
		System.out.println("3의 배수합:"+sum);
	}

}
