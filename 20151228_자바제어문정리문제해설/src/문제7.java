// 1~50 ==> 5�� ���, 5�� ��� ��
public class ����7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0; i<50; i++)
		{
			if(i%5==0)
			{
				System.out.print(i+"\t");
				sum+=i;	
			}
		}
		System.out.println("\n5�� ��� ��:"+sum);
	}

}
