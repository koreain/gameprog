/*
 * 버블정렬
 * 
 */
public class 버블정렬 {
	static int[] nansu()
	{
		boolean chk;
		int a=(int)(Math.random()*9+2);
		int[] origin=new int[a];
		for(int i=0; i<a; i++)
		{
			chk=true;
			while(chk)
			{
				chk=false;
				int su=(int)(Math.random()*100+1);
				for(int j=0;j<i;j++)
				{
					if(su==origin[j])
						chk=true;
				}
				origin[i]=su;
			}
			
		}
		/*for(int i=0;i<origin.length;i++)
		{
			System.out.print(origin[i]+" ");	
		}*/
		return origin;
	}
	
	//비교
	static int[] comp(int[] ini)
	{
		int temp;
		for(int i=0;i<ini.length-1;i++)
		{
			for(int j=0;j<ini.length-i-1;j++)
			{
				if(ini[j]>ini[j+1])
				{
					temp=ini[j];
					ini[j]=ini[j+1];
					ini[j+1]=temp;
				}
			}
		}
		/*for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");	
		}*/
		return ini;
	}
	//조립 및 출력
	static void process()
	{
		int[] a=nansu();
		System.out.print("초기값: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");	
		}
		int[] b = comp(a);
		System.out.print("\n정렬값: ");	
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
