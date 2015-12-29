/*
 * 정수를 입력받아 세 수중 가장 큰값을 구해 보세요.
 */

import java.util.Scanner;
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.println("첫번째 정수 입력:");
		nums[0]=scan.nextInt();
		System.out.println("두번째 정수 입력:");
		nums[1]=scan.nextInt();
		System.out.println("세번째 정수 입력:");
		nums[2]=scan.nextInt();
		int max=0;
		//값 비교 시작
		for(int i=0; i<nums.length;i++)
		{
		  if(nums[i]>max)
			  max=nums[i];
		}
		System.out.println("최대값은 "+max+"입니다.");
	}

}
