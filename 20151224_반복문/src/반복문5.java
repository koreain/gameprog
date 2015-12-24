/*
 *  난수 발생 ==> o,x 
 *  맞춘횟수 x 10
 * 
 */
import java.util.Scanner;
public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count=0;
		for (int i=1; i<=10; i++)
		{
			int dap=(int)(Math.random()*2);
			//1(x),0(o)
			Scanner scan=new Scanner(System.in);
			System.out.print("X(0),O(1)입력:");
			int user=scan.nextInt();
			if(dap==0)
			{
				System.out.println("답: O");
			}
			if(dap==1)
			{
				System.out.println("답: X");				
			}
			if(user==0)
			{
				System.out.println("나: O");				
			}
			if(user==1)
			{
				System.out.println("나: X");				
			}
			//결과값
			if(dap==user){
				count++;
			}
			System.out.println("채점결과: "+(count*10)+"점");
		}
	}

}
