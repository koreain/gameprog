/*
 * 2~9단
 */
import java.util.Scanner;
public class 반복문2 {
	static void gugudan(){
		Scanner scan = new Scanner(System.in);
		System.out.print("단입력: ");
		int dan=scan.nextInt();
		//단을 받아서 구구단 출력
		System.out.println("While 처리");
		int i=1;
		while(i<=9)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		
		System.out.println("do~While 처리");
		i=1;
		do
		{
			System.out.println(dan+"*"+i+"="+dan*i);
			i++;
		}
		while(i<=9);
		
		//==> 변수는 사용 후에 재사용이 가능 
	};
	 //여기서 변수가 선언되면 전역 변수가 된다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan();
	}

}
