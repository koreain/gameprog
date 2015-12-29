/*
 * 단을 입력받아 for문을 사용해서 해당 구구단을 출력해보세요
 */

import java.util.Scanner;
public class 문제8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("단 입력:");
		int dan = scan.nextInt();
		System.out.println(dan+"단 출력");
		for(int i=1; i<=9; i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
	}
}
