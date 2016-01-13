import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel{
	
	Image back;
	Image move;
	int x=15;
	int y=470;
	String[] img={"right.gif","left.gif","enter.gif","enter2.gif"};
	
	GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\이미지\\abc.jpg");
		move=Toolkit.getDefaultToolkit().getImage("c:\\이미지\\right.gif");	
	}
	
	void setImage(int no)
	{
		move=Toolkit.getDefaultToolkit().getImage("c:\\이미지\\"+img[no]);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
		g.drawImage(move, x, y, this);
	}

	
}




