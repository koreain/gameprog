import java.util.Scanner;

public class �޼ҵ���ھ߱����� {

	
	/*
	 * �������� : ������
	 * 		  ���������� �ݵ�� �ʱ�ȭ
	 * 		 => ����  �Է�
	 * 			int a=10;
	 * 		 => scan.nextInt()
	 * 		 => Math.random()
	 * 
	 * ������ => {}
	 * for(int i=0; i<=10; i++)
	 * {
	 * } //i�� �޸𸮿��� ����
	 * System.out.println(i); => error
	 * 
	 * ���������� ����
	 * 	1) �޼ҵ�ȿ� ����
	 *  2) �Ű�����
	 *  3) ��������, ��������, ����ġ����, �÷���......
	 * 
	 * 	for()
	 *  
	 * 
	 * 
	 */
	
	static int[] getRand()
	{
		int[] com=new int[3];
		int su=0; //���� �߻��� ������ ����
		boolean bDash=false; //�ߺ����θ� Ȯ��
		for(int i=0; i<3; i++)
		{ bDash=true;
			while(bDash) //���� �߻�, �ߺ� üũ
			{
				
				//�����߻�
				su=(int)(Math.random()*9)+1;
				//1~9
				//�ߺ�üũ
				bDash=false;
				for(int j=0;j<i;j++)
				{
					if(com[j]==su)
					{
						bDash=true; //while�� �ٽ� ����
						break;
						/*
						 * break
						 * continue
						 *  : �ڽ��� �ݺ����� ����
						 */
					}
				}
			}
			com[i]=su;
		}
		
		return com;
	}
	/*
	 * ���ϰ��� 1����
	 * 	=> �����Ͱ� ������ = �迭, Ŭ����
	 */
	
	// ����� �Է�
	
	static int[] userInput()
	{
		Scanner scan=new Scanner(System.in);
		int[] user=new int[3];
		int input=0;
		while(true)
		{
			System.out.println("���ڸ� ������ �Է�:");
			input=scan.nextInt();
			
			if(input<100||input>999)
			{
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("�ߺ��� ���� ����� �� ����");
				continue;
			}
			break;
		}
		
		return user;
	}
	
	//��
	
	static int compare(int[] com, int[] user)
	{
		int s=0,b=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(com[i]==user[j])
				{
					if(i==j)
						s++;
					else
						b++;
				}
			}
		}
		hint(user,s,b);
		return s;
	}
	
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d-%d-%d, Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	
	// ����
	static boolean isEnd(int s)
	{
		boolean bCheck=false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	
	
	static void process()
	{
		int[] com=getRand();
		while(true)
		{
			int[] user=userInput();
			int s=compare(com, user);
			if(isEnd(s))
			{
				Scanner scan=new Scanner(System.in);
				System.out.println("������ �ٽ� �ұ��(y/n)?");
				String res=scan.nextLine();
				char ch=res.charAt(0); //���ڸ��� �������� ��ɹ� charAt
				if(ch=='y')
				{
					System.out.println("�������� ���۵Ǿ����ϴ�.");
					process();
				}
				else
				{
					System.out.println("Game Over!!");	
					System.exit(0);
				}
			}
		}
		
		/*for(int i=0; i<3; i++)
		{
			System.out.print(com[i]+" ");
		}
		System.out.println();
		for(int i=0; i<3; i++)
		{
			System.out.print(user[i]+" ");
		}*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			process();
	}

}
