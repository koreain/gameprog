// 10�� ���� ���� ==> ����, ���, �ִ�, �ּ�
public class ����11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] student=new int[10];
		int hap=0;
		double avg=0.0;
		int max=0;
		int min=100;
		for(int i=0; i<10;i++)
		{
			student[i]=(int)(Math.random()*101);
					//0~100 ���� �߻�
			hap+=student[i];
		}
		avg=hap/10.0;
		for(int i=0; i<10; i++)
		{
			if(max<student[i])
				max=student[i];
			if(min>student[i])
				min=student[i];
		}
		//���
		System.out.println("����:"+hap);
		System.out.println("���:"+avg);
		System.out.println("�ְ���:"+max);
		System.out.println("������:"+min);
	}

}
