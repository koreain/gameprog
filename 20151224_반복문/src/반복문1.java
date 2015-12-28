/*
 *  자바 => 반복문
 *  for : 반복 횟수가 지정된 경우
 *  while : 반복 횟수가 지정이 없는 경우에 
 *  do~while : 무조건 한번 이상을 수행할 경우
 *  
 	do{
 	*실행문장 ==>1 => ㅈ
 	 while (조건문) 
 	 : ㅁ자
 	 {
 	 
 	 
 *  
 * ==> for 문
 * 	 	 	 1번	   2번   4번
 * 형식) for (초기값; 조건식;증가식)
 * 	   {
 * 		반복 실행 문장 3
 * 	   }
 * 	
 * 		1 > 2 > 3 > 4
 * 			2 > 3 > 4
 * 			2 > 3 > 4
 * 			2 > 3 > 4
 * 			2 > 3 > 4
 *  	    2번이 false가 되면 for을 중단
 *  
 *  for(int i=1; i<=10, i++)
 *  {
 *  	i=1 ==> i<=10 true ==> 문장수행 (i++)
 *  				.
 *  				.
 *  				.
 *      i=11 ==> i<=10 false ==> false 종료
 *  }
 *  
 *  
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10;i++){
			System.out.println("i="+i+"\t");
		}
	}

}
