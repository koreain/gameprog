/*
 * 
 * String (char x) Ŭ����
 *  1. ���ڿ� ������ ����
 *  2. ��ɼ���(�޼ҵ�)
 *  
 *  " " �̰��� �ٷ� �ּ� ,, ���� "hello", "hello"�� �Ѵ� ���� �ּ�.
 *  String str = "hello"  str�̶�� �޸� ������ hello 100�������� ���� �ȴ�.
 *  but,
 *  String str2 = new 
 *  
 *  ���ڿ��� equals�� ���Ѵ�. (��ҹ��� ����)
 *  equals ignore case (��ҹ��� ���� ����)
 *  
 *  ��� Ŭ���� ���� ��,, ������ �ּҰ� ����Ǵ� ��. �׷��� �ּҴ� �׻� 4����Ʈ�� ����Ǳ� ������ ó�� ����� ������ 4byte�� ����ȴ�.
 *  
 *   String str2="java"
 *   
 *   ��ɵ�!!!!
 *   
 *    1) ���ڿ� ��     	  equals
 *    2) �¿������ �����ϴ�      trim
 *    3) �ٸ����ڷ� ��ü            replace
 *    4) ���ںи�                      substring   str.substring(a,b) a��° �迭���� ����ؼ� b-1��° �迭���� ���
 * 	  5) ���ڱ��� 		  length
 *    6) indexOf
 *    7) lastIndexOf
 *    8) valueof �����쳪 ���� ������ �Ǽ� ������� ���ڿ��ۿ� ����. ���� �ش� �޼ҵ�� ������͸� ��� string ���ڿ��� �ٲپ��ش�.
 *    9) startswith, endswith --> Ư�� �ܾ�� ����, �����ĸ� ���� �޼ҵ�. (�ڵ��˻���� ������ ���� Ȱ��)
 *   10) split ���ڸ� �߶� ������ �� ���� (�������� String[])
 *   
 *   
 *   ********** java ����ó��. (db �ʱ� �����߿� �Ϻ��ϰ� �����ϵ���..)
 *   
 */

public class �ʱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abc";
		String a2 = a.substring(1, 2);
		System.out.println(a2);
		int d=a.indexOf('c');
		System.out.println(d);
		int e=a.lastIndexOf('c');
		System.out.println(e);
		
	}

}
