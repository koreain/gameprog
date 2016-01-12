/*
 * 석차구하기
 * 
 * 1. 한 사람의 점수에 대한 석차를 알려면 다른 사람들과 점수를 비교해 보면 된다.
 * 2. 다른 사람의 점수와 비교하다가 자신보다 점수가 높은 사람이 있으면 자신의 석차를 1씩 증가시키면 된다.
 * 3. TypeA: 배열 저장 후 출력
 *    TypeB: 바로 출력
 *    
 */
import java.util.Scanner;
public class 석차구하기 {
	static int[] jumsu=new int[5]; //반복 사용 매개변수 설정 (전역변수)
	static int[] rank=new int[5];
	static char[] id={'A','B','C','D','E'};
	//점수입력받기
	static int[] input()
	{
		for(int i=0; i<5; i++)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println(id[i]+"학생의 성적 입력: ");
			jumsu[i]=scan.nextInt();
		}
		/*for(int i=0;i<5;i++)
		{
			System.out.println(id[i]+"점수: "+jumsu[i]+"점");	
		}*/
		return jumsu;
	}
	//점수비교
	static int[] comp(int[] a)
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(jumsu[i]<jumsu[j])
				  rank[i]=rank[i]+1;
			}
		}
/*		for(int i=0; i<5;i++)
		{
			System.out.println(id[i]+"학생등수:"+rank[i]);
		}
*/
		return a;
	}
	
	//출력
	static void output()
	{
		char temp1='A';
		int temp2=0;
		for(int i=0; i<5;i++)
		{

			for(int j=i+1;j<5-i;j++)
			{
				if(rank[i]>rank[j])
				{
					temp1=id[i];
					id[i]=id[j];
					id[j]=temp1;
					
					temp2=jumsu[i];
					jumsu[i]=jumsu[j];
					jumsu[j]=temp2;
					
				}
			}
			
		}
		System.out.println("순위\t학생\t점수");
		for(int i=0; i<5; i++)
		{
			System.out.println(i+1+"등\t"+id[i]+"\t"+jumsu[i]);
			
		}
	}
	//조립
	static void process()
	{
		input();
		comp(jumsu);
		output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
