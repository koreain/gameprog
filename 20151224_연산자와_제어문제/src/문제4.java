import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("10000이하의 정수 입력:");
		int num=scan.nextInt();
		int a=num/2;
		if(num<0 || num>10000){
			System.out.println("10000이하의 정수를 입력해 주시기 바랍니다.");
		}
		else{
			if(num%2==0){
				System.out.println("홀수와 짝수 모두 "+a+"개 입니다.");
			}
			else{
				System.out.println("홀수 개수는"+(a+1)+"개이며, 짝수 개수는"+a+"개 입니다.");
			}
		}
			
	}

}
