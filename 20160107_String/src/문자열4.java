/*
 * substring => ���ڸ� �и�
 * 
 * 		substring(int startIndex)
 * 		substring(3) 3�� ����� ������.
 * 		substring(int startIndex, endIndex)
 * 		substring(3,7) 3������� 7-1(6)�������.
 */
import java.io.*;
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String str="0123456789";
		String res1=str.substring(3);
		System.out.println(res1);
		String res2=str.substring(3,7);
		System.out.println(res2);*/
	File dir=new File("C:\\Users\\aa\\gitJava\\20160105_�޼ҵ�\\src");
	File[] files=dir.listFiles();
	for(int i=0;i<files.length;i++)
	{
		//System.out.println(files[i].getName());
		String name=files[i].getName();
		String ext=name.substring(name.lastIndexOf('.')+1);
		if(ext.equals("java"))
		{
			System.out.println(name);	
		}
		
	}
	
	}

}
