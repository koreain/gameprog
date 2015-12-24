/*
 * 3.6.9 출력
 * 
 */
public class 반복문369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=60; i++){
			if(i%10==3 || i%10==6 || i%10==9)
			{
				System.out.println("짝!");
			}
			else
			{
				System.out.println(i);
			}
				
		}
	}

}
