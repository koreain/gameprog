import java.util.Scanner;
public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("임의의 정수 입력: ");
		int num=scan.nextInt();
		if(num%3==0){
			System.out.println("3의 배수입니다.");
		}
		if(num%5==0){
			System.out.println("5의 배수입니다.");			
		}
		if(num%8==0){
			System.out.println("8의 배수입니다.");
		}
		else{
			System.out.println("3,5,8 어느 값의 배수도 아닙니다");
		}
	}

}
