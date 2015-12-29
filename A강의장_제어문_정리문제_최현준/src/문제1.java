/*
 * 1번문제
 * 
 * 국어 90
 * 영어 78
 * 수학 85
 * 총점 256
 * 평균 85
 * 
 * (부분점수를 고려하여 실수입력 및 출력으로 코딩해 보았습니다.)
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("국어점수:");
		double kor = scan.nextDouble();
		System.out.println("영어점수:");
		double eng = scan.nextDouble();
		System.out.println("수학점수:");
		double math = scan.nextDouble();
		
		double total=kor+eng+math;
		double avg = total/3.0;
		
		System.out.println("총점:"+total+"점 입니다.");
		System.out.printf("평균:%.2f점 입니다.",avg);

	}

}
