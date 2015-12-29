/*
 * 10명 학생의 점수를 입력받아 배열에 저장하고 
 * 점수의 
 * 총합, 평균, 최대점수, 최소점수 구하기
 */

import java.util.Scanner;
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//배열 
		char id[]={'A','B','C','D','E','F','G','H','I','J'};
		int[] score=new int[10];
		//총합, 최대, 최소값 변수 설정
		int sum=0;
		int max=0;
		int min=1000;
		
		for(int i=0; i<id.length;i++)
		{
			System.out.println(id[i]+"학생점수:");
			score[i]=scan.nextInt();
		}

		for(int i=0; i<score.length; i++)
		{
			if(min>score[i])
				min=score[i];
			if(max<score[i])
				max=score[i];
			sum+=score[i];
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f\n",(sum/10.0));
		System.out.println("최고점수:"+max);
		System.out.println("최저점수:"+min);
	}

}
