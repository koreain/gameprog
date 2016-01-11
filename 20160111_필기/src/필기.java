/*
 * 1) �޼ҵ�
 *  => a. �׷α׷� -> ��ɹ�
 *  			  ��ɹ�: �����ִ� �ͳ��� ��� ���
 *     b. ���-> �Ѱ��� ��ɼ����������..
 *     c. ���� (�Ű������� 3�� �̻��̸� Ŭ���� Ȱ���� ����϶�. 
 *     			DTO(Data Transfer Object~VO(Value Object)-- �ܼ� ������ ����, ���� ����)
 *     	 [1] ����� (������)
 *     	 [2] �Է°� (�Ű�����)
 *     	 
 *     d. ����
 *     		 ������ | �Ű�����
 *     		  O  |   O    ex) string substring(int s, int e)
 *        	  O  |   X    ex) nextInt()
 *        	  X  |   O	  ex) println()
 *        	  X  |   X    ex) static void name(){}
 *       
 *       
 * 2) String
 * 	  => �������� (char 2���� �迭 Ȱ��)
 * 	  => Ŭ����
 * 
 * 		 String s="hello";
 * 		 	
 * 		 String s=new String("hello");
 * 
 * 	  a. (string) substring(int, int)
 * 	  b. (int) length(string)
 *    c. (string) trim(string)
 *    d. (int) lastIndexOf(string)
 *    e. (int) indexOf(string)
 *    f. (boolean) startsWith(string)
 *    g. (boolean) endsWith (string)
 *    h. (string) valueOf (other data type)
 *    i. (string) replace (string) / replaceAll
 *    j. (char) charAt (string)
 *    
 * 
 * 
 * 
 * 3) ������ ����
 * 	 >> �������� : a:static(����), b:instance(����) ���� ����.
 * 		�������� : ��� �� ��� ó���� ���� ����.
 * 		*��ü������ 3�� Ư��: ����ȭ(������ ���߱�) / ĸ��ȭ(���氡��) / ���(����-�ٿ뼺-���� modify(override))
 * 														   (����-Ȯ�� new(overload))-�޼ҵ���� ������ �Ű������� �ٸ����.	
 * 		
 */
public class �ʱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c=" abcdefg";
		
		System.out.println("substring return: "+c.substring(2, 5));
		System.out.println("index of return: "+c.indexOf('c'));
		String d=c.trim();
		System.out.println("trim return: "+d);
		int a = c.lastIndexOf('a');         
		System.out.println("lastIndexOf return a index: "+a);             
		System.out.println("startsWith return: "+c.startsWith("ab"));
		System.out.println("startsWith return: "+c.endsWith("fg")); 
		System.out.println("value of return: "+ String.valueOf(a));             
		System.out.println("replace return: "+c.replace("ab", "cc")); 	
		System.out.println("replaceAll return: "+c.replaceAll("cd","cc"));
		System.out.println("charAt return: "+c.charAt(2));
		 
	}

}
