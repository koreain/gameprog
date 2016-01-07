/*
 * trim() : 좌우의 공백을 제거할 때  (사용자가 입력한  로그인 아이디, 패스워드와 db와 비교 시에 기본적으로 사용되는 기능)
 * 네이버 로그인, 네이트 로그인 차이점 (trim 적용 /미적용)
 */
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id=" ad min "; 
		System.out.println("문자길이: "+id.length());
		String res=id.trim();
		System.out.println("문자길이: "+res.length());
		String tid=id.replace(" ","");
		System.out.println("문자길이: "+tid.length());
	}

}
