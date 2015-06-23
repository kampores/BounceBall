package bounceBall;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window{
	
	private JLabel l;
	private Ball b;
	private JFrame f;
	private JPanel p;
	
	public Window(int width,int height){
		l = new JLabel("");
		f = new JFrame("");
		p = new JPanel();
		p.setBackground(Color.WHITE);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(width, height);
		f.setTitle("Bounce Ball");
		f.add(p);
		f.setVisible(true);
	}
	
	public void writeLabel(){
		l.setText("X:"+b.getBallPositionX()+"Y:"+b.getBallPositionY());			
	}
}
