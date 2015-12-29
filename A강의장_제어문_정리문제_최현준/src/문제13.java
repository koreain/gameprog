/*
 * 5명 학생의 
 * 국어, 영어, 수학점수를 입력받아 
 * 총점, 
 * 평균을 구하세요 (배열사용)
 */
import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		char id[]={'A','B','C','D','E'};
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];

		for(int i=0; i<id.length;i++)
		{
			System.out.println(id[i]+"학생성적입력");
			
				System.out.println("국어점수:");
				kor[i]=scan.nextInt();
				System.out.println("영어점수:");
				eng[i]=scan.nextInt();
				System.out.println("수학점수:");
				math[i]=scan.nextInt();
				sum[i]=kor[i]+eng[i]+math[i];
				avg[i]=sum[i]/3.0;
			if(i==id.length-1)
				{
			    	System.out.println("국어\t영어\t수학\t총점\t평균");
					for(int j=0; j<id.length;j++)
					{
						System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",kor[j],eng[j],math[j],sum[j],avg[j]);
					}
				}
					
		}
	}
}
