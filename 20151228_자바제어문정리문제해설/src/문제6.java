/*
 * 3�� ����, ����, ���� ������ �Է¹޾Ƽ�
 * ����, ���, ����, ����� ���ؼ� ���
 * 
 * ����  ����  ����   ����   ���   ����   ���
 * 90 80 70 240 80  B  X
 * 
 * �迭(array)
 *  => �������� �޸� ��ġ
 *  => ���� ���������� ��Ƽ� ����
 * 	����)
 * 	   ���������� [] �迭��; ==> �������
 *   �������� �迭��[]; (*�ַ� c��� ����)
 *   
 *   ��)
 *   	int[] a;
 *      a = new int[5];
 *      
 *      =======================================
 *       10 	 20 	 30  	  40  	  50
 *      =======================================
 *      a[0] 	a[1] 	a[2]	 a[3]	 a[4] ===> �Ϲ� ������ ����
 *      
 *      *&(a+0) *&(a+0) *&(a+0) *&(a+0) *&(a+0) (*�� ������, ���� �ǹ�, &     
 */

import java.util.Scanner;
public class ����6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor[] = new int[3];
		int eng[] = new int[3];
		int math[] = new int[3];
		int total[] = new int[3];
		double[] avg = new double[3];
		char[] hak = new char[3];
		int[] rank = new int[3];
		// int[][] jumsu=new int[3][7];
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<3;i++)
		{
			System.out.printf("%d��° �������� �Է�:",(i+1));
			kor[i]=scan.nextInt();
			System.out.printf("%d��° �������� �Է�:",(i+1));
			eng[i]=scan.nextInt();
			System.out.printf("%d��° �������� �Է�:",(i+1));
			math[i]=scan.nextInt();
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
		}
		
		// ���
		
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
					rank[i]++;
			}
		}		
		// ����
		
		char score='A';
		for(int i=0; i<3;i++)
		{
			switch((int)avg[i]/10)
			{
			case 10:
			case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
				break;
			}
			hak[i]=score;
		}
		
		System.out.printf("%10s%10s%10s%14s%20s%10s%10s\n","����","����","����","����","���","����","���");
		for(int i=0; i<3; i++)
		{
		 System.out.printf("%5d%5d%5d%7d%10.2f%5c%5d\n",
				 kor[i],eng[i],math[i],total[i],avg[i],hak[i],rank[i]);
		}
	}

}
