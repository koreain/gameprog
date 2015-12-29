/*
 * 국어, 영어 점수입력받아 학점구하기 (if)
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
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("국어성적:");
		int kor = scan.nextInt();
		System.out.println("영어성적:");
		int eng = scan.nextInt();
		double avg = (kor+eng)/2.0;
		int i;
		char grd[]={'A','B','C','D','F'};
		if(avg>=90)
			i=0;
		else if(avg>=80 && avg<90)
			i=1;
		else if(avg>=70 && avg<80)
			i=2;
		else if(avg>=60 && avg<70)
			i=3;
		else 
			i=4;
		System.out.println("학점:"+grd[i]);
	}

}
