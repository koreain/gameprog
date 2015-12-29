/*
 * 2,3,4단
 * 5,6,7단
 * 8,9단
 * 
 * 
 */
public class 추가숙제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int k=1; k<=3;k++)
	{
		for(int i=1; i<=9; i++)
		 {
			System.out.println();
		    for(int j=3*k-1; j<=3*k+1;j++)
		    {
		      if(j!=10)
		      System.out.printf(j+"*"+i+"="+i*j+"\t");
		    }
		 }
	}	
 }
}
