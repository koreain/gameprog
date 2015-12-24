/*
 * 다중조건문
 *  형식)
 *    if (조건문)
 *     문장1
 *    else if(조건문)
 *     문장2
 *    else if(조건문)
 *     문장3
 *    else
 *     문장4
 * 
 *  여기서 else를 모두 빼면 단일 if문이 된다.
 *  단일 if문 같은 경우 여러개의 값을 반환할 수 있다
 *  모든 if문을 수행한다
 *  but!!
 *  다중 조건문은 하나의 값만을 반환한다.
 * 
 */
public class 조건문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다중if문
		int jumsu=85;
		char hak;
		if(jumsu>=90)
			hak='A';
		else if(jumsu>=80)
			hak='B';
		else if(jumsu>=70)
			hak='C';
		else if(jumsu>=60)
			hak='D';
		else
			hak='F';
		System.out.println("학점: "+hak);
	}

}
