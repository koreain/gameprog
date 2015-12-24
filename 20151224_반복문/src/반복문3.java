/*
 *  up-down 게임
 */
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 임의의 난수를 발생 => 1~100
		int com=(int)(Math.random()*100)+1;
		int count=0; //시도 횟수 카운팅 위해.
		
		
		
		for(;;) //무한루프
		{
			System.out.print("1~100까지 사이의 정수 입력: ");
			int user=scan.nextInt();

			if(user<1 || user>=100)
			{
				System.out.println("잘못된 입력입니다.");
				continue; //continue는 처음부터 다시 돌아가는 것이고, break는 끝내는 것.
			}
			
			//비교
			count++;  //시도횟수 증감연산자
			
			if(com>user)
			{
				System.out.println("더 높은 숫자를 입력해보세요!!!");
			}
			else if(com<user)
			{
				System.out.println("더 낮은 숫자를 입력해보세요!!!");
			}
			else
			{
				System.out.println("정답입니다!!!");
				System.out.println("총 시도횟수:"+count+"번");
				break;
			}
		}
		
		
		
	}

}
