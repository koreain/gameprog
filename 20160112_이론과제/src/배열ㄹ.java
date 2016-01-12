/*
 * static int k=0;
 * static int[][] a=new int[5][5];
 * static int begin=0;
 * static int end=4;
 * static int sw=1;
 * static int temp=0;
 * 
 */
public class 배열ㄹ {
	// 
	static int[][] arr()
	{	
		int k=0;                
		int[][] a=new int[5][5];
		int begin=1;            
		int end=5;              
		int sw=1;               
		int temp;  
		
	  for(int i=0;i<5;i++)
	  {
		  for(int j=begin-1;(end==5)?j<end:j>=end-1;j+=sw)
			{
				a[i][j]=k+1;
				k++;
			}  
			  temp = begin;
			  begin= end;
			  end=temp;
			  sw=-sw;
	  }
	  return a;
	}
	
	static void output(int[][] b)
	{
		for(int i=0;i<5;i++)
		{
			
			for(int j=0;j<5;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	//조립 (입/출)
	static void process()
	{
		int[][] c=arr();
		output(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		process();
	}

}
