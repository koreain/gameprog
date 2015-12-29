/*
 * 임의의 수를 입력받아 입력받은 수까지 합을 구해 보세요. (while)사용
 */

import java.util.Scanner;
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("임의의 수를 입력받아 입력받은 수까지 합을 구합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 수를 입력:");
		int num=scan.nextInt();
		int sum=0;
		int i=1;
		while(i<=num)
		{
			sum+=i;
			i++;
		}
		System.out.println("1부터 "+num+"까지의 총합:"+sum);
	}

}
