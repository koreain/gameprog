/*
 * 버블정렬
 */
public class hw1 {
	static int[] getData()
	{
		int[] data=new int[5];
		for(int i=0; i<data.length;i++)
		{
			data[i]=(int)(Math.random()*100)+1;
		}
		return data;
	}
	
	static int[] sort(int[] arr)
	{
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	static void process()
	{
		int[] arr=getData();
		System.out.println("정렬전");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
		System.out.println("정렬후");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
