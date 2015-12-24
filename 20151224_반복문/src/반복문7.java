
public class 반복문7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++)
		{
			if(i%2==0) continue; //아래 문장 실행전에 바로 증가식으로 올라가는 것이다. (제외시키고 초기화)
			System.out.println("i="+i); 
		}
	}

}
