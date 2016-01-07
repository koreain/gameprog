/*
 *  charAt : 문자열에서 원하는 문자를 한개 받는다
 *  String str="abcdef";
 *  			012345
 *  char c=str.charAt(1);
 *  c? ==> b
 */
import java.util.Scanner;
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자를 입력: ");
		String str=scan.next();
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			{
				if(c=='a' || c=='A')
					cnt++;

			}
		}
		System.out.println("총 a,A개수는: "+cnt+"개 입니다.");
	}

}
