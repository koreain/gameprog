/*
 * 
 *   3,5,7의 배수
 * 
 * 
 * 
 */
public class 조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 단일 if문을 통해 다중 출력
		/*
		int num=21;
		if(num%3==0)
			System.out.println(num+"(은)는 3의 배수입니다.");
		if(num%5==0)
			System.out.println(num+"(은)는 5의 배수입니다.");
		if(num%7==0)
			System.out.println(num+"(은)는 7의 배수입니다.");
		// 합 구하기?
		*
		*
		*/
		int num=10;
		if(num%2!=0){
		// if 소속 문장	
			System.out.println(num+"는(은) 짝수다");
		// 아래문장은 if소속이 아니라 무조건 돌아간다.
			System.out.println("Program End");		
		}
	}

}
