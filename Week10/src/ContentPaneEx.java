import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane and JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		Container cp = getContentPane();
		cp.setBackground(new Color(255,215,0));
		cp.setLayout(new FlowLayout());
		
		cp.add(new JButton("감자"));
		cp.add(new JButton("고구마"));
		cp.add(new JButton("옥수수"));
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();

	}

}
