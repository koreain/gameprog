//1~100 3의배수 및 3의배수합
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int val=0;
		do{
			if(i%3==0)
			{
				System.out.print(i+"\t");
			    val+=i;
			}
			i++;
		}
		while(i<=100);
		System.out.println("\n3의 배수합:"+val);
	}

}
