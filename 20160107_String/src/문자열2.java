/*
 *  charAt : ���ڿ����� ���ϴ� ���ڸ� �Ѱ� �޴´�
 *  String str="abcdef";
 *  			012345
 *  char c=str.charAt(1);
 *  c? ==> b
 */
import java.util.Scanner;
public class ���ڿ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է�: ");
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
		System.out.println("�� a,A������: "+cnt+"�� �Դϴ�.");
	}

}
