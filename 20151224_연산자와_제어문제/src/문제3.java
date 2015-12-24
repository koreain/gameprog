import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("첫번쨰 실수 입력: ");
		double first=scan.nextDouble();
		System.out.println("두번쨰 실수 입력: ");
		double second=scan.nextDouble();
		double sum=first+second;
		double dif=first-second;
		double exp=first*second;
		System.out.println("합: "+sum);
		System.out.println("차: "+dif);
		System.out.println("곱: "+exp);
	}

}
