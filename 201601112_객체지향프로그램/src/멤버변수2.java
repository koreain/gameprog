import javax.swing.JOptionPane;

public class �������2 {
	static int hakbun;
	static int kor,eng,math;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=JOptionPane.showInputDialog("��������:");
		kor=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("��������:"); //str �����
		eng=Integer.parseInt(str);
		str=JOptionPane.showInputDialog("��������:"); //str �����
		math=Integer.parseInt(str);
		String result="����:"+(kor+eng+math)+"\n"
				     +"���"+((kor+eng+math)/3);
		JOptionPane.showInputDialog(null,result);
	}

}
