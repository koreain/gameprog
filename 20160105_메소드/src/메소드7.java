/*
 * //단을 입력받아서 => 구구단을 출력
 * 
 * static 을 빼면, 해당 메소드 안에서만 (이 경우 메소드7)사용하게 된다.
 * static을 넣으면 공통사용으로 빠진다.
 * 
 * public은 다른 폴더에서도 해당 메소드를 사용 가능하다.
 */
import java.util.Scanner;
public class 메소드7 {

	static int dan()
	{
		Scanner user=new Scanner(System.in);
		System.out.println("출력하고자 하는 구구단 단수를 입력: ");
		int dan=user.nextInt();
		return dan;
	}
	
	static void output(int dan)
	{
		System.out.print(dan+"단 출력 (");
		for(int i=0;i<dan;i++)
		{
			System.out.print("*");
		}
		System.out.println(")");
		for(int i=1; i<10; i++)
		{
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=dan();
		output(a);
		
	}

}
