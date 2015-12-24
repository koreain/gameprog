//정수를 입력을 받아서 
/*
 * 
 * 3*9=27
 */


import java.util.Scanner;
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner scan= new Scanner(System.in);
		System.out.print("정수(2~9)입력: ");
		int dan=scan.nextInt();
		for(int i=1; i<=9; i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			}
		}
	*/
     //for을 이용해서 1~100까지의 정수를 누적한 값을 출력
		/*
		int sum=0;
		for(int i=1; i<=100; i++){
			sum+=i;
		}
		System.out.println("누적값:"+sum);
		*/
	// 1~100 : 짝수의 합, 홀수의 합과 전체의 합을 출력
/*
		int even=0;
		int odd=0;
		int sum=0;
		for (int i=1; i<=100; i++){
			if(i%2==0){
				even+=i;
			}
			else{
				odd+=i;
			}
			sum+=i
		)
		System.out.println("1~100의  짝수합: "+even);
		System.out.println("1~100의  홀수합: "+odd);
		System.out.println("1~100의  누적값: "+sum);
*/	
	int n3=0;
	int n5=0;
	int n7=0;
	for(int i=1; i<=100; i++)
	{
	if(i%3==0)
		n3+=i;
	if(i%5==0)
		n5+=i;
	if(i%7==0)
		n7+=i;
	}
	
	System.out.println("3배수합: "+n3);
	System.out.println("5배수합: "+n5);
	System.out.println("7배수합: "+n7);
	
	}
}