/*
 * //���� �Է¹޾Ƽ� => �������� ���
 * 
 * static �� ����, �ش� �޼ҵ� �ȿ����� (�� ��� �޼ҵ�7)����ϰ� �ȴ�.
 * static�� ������ ���������� ������.
 * 
 * public�� �ٸ� ���������� �ش� �޼ҵ带 ��� �����ϴ�.
 */
import java.util.Scanner;
public class �޼ҵ�7 {

	static int dan()
	{
		Scanner user=new Scanner(System.in);
		System.out.println("����ϰ��� �ϴ� ������ �ܼ��� �Է�: ");
		int dan=user.nextInt();
		return dan;
	}
	
	static void output(int dan)
	{
		System.out.print(dan+"�� ��� (");
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
