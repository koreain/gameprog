/*
 * 	�޼ҵ� �������
 * 		=> ����� (������)
 * 		=> �Է°� (�����) => �Ű����� (��������)
 * 		   : �޼ҵ� �ȿ��� ����ϴ� ����
 * 			* ����� �Է°�
 * 			* �ٸ� �޼ҵ�� ����
 * 			   =====> ��ü���� ����ϴ� ���� (�������)
 * 			   ����)
 * 				������� : ���α׷� ����ÿ� �������.
 * 				 = instance ���� (��ü����)
 * 				 	������ ���� �ȴ�.
 * 				 = static ����
 * 					��������� �ϳ���. (��������)
 * 				��������
 * 				 = {} �ȿ����� ���Ǵ� ����
 * 
 *       1) ������ O, �Ű����� O
 *       	String substring (int s, int e)
 *       2) ������ O, �Ű����� X
 *       	double random()
 *       3) ������ X, �Ű����� O
 *       	void print(String s)
 *       4) ������ X, �Ű����� X
 *       	void actionPerformed()
 *       
 *       
 *    => ����)
 *    	 	�����
 *    	 	������
 *    		String substring(int s, int e)  ===> ����� (����θ� �ִ� Ŭ������ �߻�Ŭ����, �������̽��� �Ѵ�.)
 *			{
 *				������
 *			}    		
 *
 *		String Class 
 *		����	 �� �ּҰ��� �����Ѵ�.
 *		  String s = ��
 *		  ====== == ����
 *		   �������� (����� ����)
 *
 *		   ���� ���� ���ο� �޸𸮿� ���� : new
 *		 String s1 = new String("aaa");
 *		 String s2 = new String("aaa");			
 *		 String s3 = new String("aaa");
 *		 String s4 = new String("aaa");
 *		 String s5 = new String("aaa");
 *		 String s6 = "aaa";
 *		 String s7 = "aaa";
 *
 *		=> �ֿ���
 *			1) substring
 *			2) indexOf, lastIndexOf
 *			3) startsWith, endsWith
 *			4) trim()
 *			5) length()
 *			6) split
 *			7) valueOf
 *			8) replace, replaceAll
 *			9) charAt()
 *================================================================
 *
 *		�������迭 : �������迭 �������� ��Ƽ� ����
 *		����)
 *		     ��������[��][��] �迭��;
 *		  �������� �迭�� [��][��];
 *		��������[��] �迭��[��];
 *		�� : �ټ� => ���� for
 *		�� : ������ ���� => ���� for
 *
 *		��)
 *			5���� �л�
 *				����, ����, ����, ����, ���, ����
 *			[5][6]
 *
 */
public class �޼ҵ�1 {
	static boolean tf(String a, String b)
	{
		boolean bCheck = false;
		if(a==b)
		{
			bCheck = true;	
		}
		return bCheck;
	}
	
	static boolean tf2(String a, String b)
	{
		boolean bCheck = false;
		if(a.equals(b)==true)
		{
			bCheck = true;	
		}
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 //�޼ҵ�1 a=new �޼ҵ�1();
			 //System.out.println(a); //a�� �ּҰ��� �����Ѵ�.
			 String a = new String("aaa");
			 String b = new String("aaa");			
			 String c = new String("aaa");
			 String d = new String("aaa");
			 String e = new String("aaa");
			 String f = "aaa";
			 String g = "aaa";
			 System.out.println("a: "+a);
			 System.out.println("b: "+b);
			 System.out.println("c: "+c);
			 System.out.println("d: "+d);
			 System.out.println("e: "+e);
			 System.out.println("f: "+f);
			 System.out.println("g: "+g);
			 
			 System.out.println("a-b address comparison: "+tf(a,b));
			 System.out.println("b-c address comparison: "+tf(b,c));
			 System.out.println("c-d address comparison: "+tf(c,d));
			 System.out.println("d-e address comparison: "+tf(d,e));
			 System.out.println("e-f address comparison: "+tf(e,f));
			 System.out.println("f-g address comparison: "+tf(f,g));
			 
			 System.out.println("a-b contents comparison: "+tf2(a,b));
			 System.out.println("b-c contents comparison: "+tf2(b,c));
			 System.out.println("c-d contents comparison: "+tf2(c,d));
			 System.out.println("d-e contents comparison: "+tf2(d,e));
			 System.out.println("e-f contents comparison: "+tf2(e,f));
			 System.out.println("f-g contents comparison: "+tf2(f,g));
			 
			 
	}

}
