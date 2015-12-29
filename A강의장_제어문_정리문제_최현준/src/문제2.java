/*
 * 2번문제
 * 임의의 수를 입력받아 짝수인지 홀수인지 출력해 보세요
 */

import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해주세요:");
		int num = scan.nextInt();
		//짝수 홀수 판단
		if(num%2==0)
		System.out.println(num+"는(은)짝수 입니다.");
		else
		System.out.println(num+"는(은)홀수 입니다.");
	}

}
