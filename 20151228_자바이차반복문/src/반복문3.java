/*
 * 2*1=1		-------------   9*1
 * 2*2
 * 2*3
 * 2*4
 * --
 * --
 * 2*9=18		--------------  9*9
 * 
 */
public class ¹Ýº¹¹®3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=9; i++)
		{
			for(int j=2; j<=9; j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				
			}
			System.out.println();
		}
	}

}
