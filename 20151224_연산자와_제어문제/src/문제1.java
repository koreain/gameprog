/*
 * 278970원(int형 변수로 저장)
 */
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin=278970;
		int man=coin/10000;
		int och=(coin%10000)/5000;
		int ch=(coin%5000)/1000; //int ch=((coin%10000)%5000)/1000;
		int ob=(coin%1000)/500; //int ob=(((coin%10000)%5000)%1000)/500;
		int b =(coin%500)/100; //int b =((((coin%10000)%5000)%1000)%500)/100;
		int os=(coin%100)/50; //int os=(((((coin%10000)%5000)%1000)%500)%100)/50;
		int s=(coin%50)/10;  //int s=((((((coin%10000)%5000)%1000)%500)%100)%50)/10;
		
		System.out.println("소유금액 ="+coin);
		System.out.println("10000원 ="+man);
		System.out.println("5000원 ="+och);
		System.out.println("1000원 ="+ch);
		System.out.println("500원 ="+ob);
		System.out.println("100원 ="+b);
		System.out.println("50원 ="+os);
		System.out.println("10원 ="+s);
		
	}

}
