import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어점수: ");
		int kor=scan.nextInt();
		Scanner scan1=new Scanner(System.in);
		System.out.println("영어점수: ");
		int eng=scan.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.println("수학점수: ");
		int math=scan.nextInt();
		int total=kor+eng+math;
		double avg=total/3.0;
		
		System.out.println("총점 : "+total+"점");
		System.out.printf("평균: %.2f점",avg);
	}

}
