/*
 *   년 월 일을 받아서 해당 요일을 계산 
 *   1) 윤년 조건
 *   	4년  366일
 *   	100년 364일
 *   	400년 366일
 *   
 *   2) 총날수  1년도 1월 1일 ~~~ 2015년년 12월 28일 ==> %7
 */
import java.util.Scanner;
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		System.out.println("월 입력:");
		int month=scan.nextInt();
		
		System.out.println("일 입력:");
		int day=scan.nextInt();
		// 전년도 까지
		int total = (year-1)*365
					 +(year-1)/4
					 -(year-1)/100
					 +(year-1)/400;
		//현재연도까지
		int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		//2015년 12월 28일  전달까지
		for(int i=0; i<month-1;i++)
		{
			total+=lastDay[i];
		}
		total+=day;
		System.out.println();
		
		total+=1;
		int week=total%7;
		
		char[] strWeek={'일','월','화','수','목','금','토'};
		//System.out.println(strWeek[week]);
		System.out.println(year+"년도"+month+"월");
		for(int i=0; i<7; i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println();
		for(int i=1; i<=lastDay[month-1];i++)
		{
		 if(i==1)
		 {
			 for(int j=1; j<week; j++)
			 {
			 System.out.print("\t");
			 }
		 }
		 System.out.print(i+"\t");
		 week++;
		 if(week>6)
		 {
			 System.out.println();
			 week=0;
		 }
		}
	/*	switch(week)
		{
		case 0:
			System.out.println("일");
			break;
		case 1:
			System.out.println("월");
			break;
		case 2:
			System.out.println("화");
			break;
		case 3:
			System.out.println("수");
			break;
		case 4:
			System.out.println("목");
			break;
		case 5:
			System.out.println("금");
			break;
		default:
			System.out.println("토");
		break;
		}*/
		
	}

}
