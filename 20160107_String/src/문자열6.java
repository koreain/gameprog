/*
 * trim() : �¿��� ������ ������ ��  (����ڰ� �Է���  �α��� ���̵�, �н������ db�� �� �ÿ� �⺻������ ���Ǵ� ���)
 * ���̹� �α���, ����Ʈ �α��� ������ (trim ���� /������)
 */
public class ���ڿ�6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id=" ad min "; 
		System.out.println("���ڱ���: "+id.length());
		String res=id.trim();
		System.out.println("���ڱ���: "+res.length());
		String tid=id.replace(" ","");
		System.out.println("���ڱ���: "+tid.length());
	}

}
