/*
 * 국어, 영어 점수를 받아 학점 구하기 (switch)
 * 평균 90 이상  A학점
 * 평균 80 이상  B학점
 * 평균 70 이상  C학점
 * 평균 60 이상  D학점
 * 평균 60 미만  F학점
 * 
 * 출력결과
 * 국어: 90
 * 영어: 80
 * 학점: B
 */

import java.util.Scanner;
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수:");
		int kor = scan.nextInt();
		System.out.println("영어점수:");
		int eng = scan.nextInt();
		int avg = (kor+eng)/2;
		int i;
		char grd[]={'A','B','C','D','F'};
		
		switch(avg/10)
		{
		case 10:
		case 9:
			i=0;
			break;

		case 8:
			i=1;
			break;

		case 7:
			i=2;
			break;

		case 6:
			i=3;
			break;
		default :
			i=4;
		}
		System.out.println("학점:"+grd[i]);

	}

}
