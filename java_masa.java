package java_ballistik;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class java_masa extends JFrame{
	private Image backgroundimage = new ImageIcon("src/java_ballistik.image/ȣ��Ʈ.jpg").getImage();
    public java_masa() {
       setTitle("History escape room");
       getContentPane().setLayout(new FlowLayout());
       JLabel label1 = new JLabel("���� ��Ż�� ���ӿ� ���� ������ ȯ���մϴ�.");
       getContentPane().add(label1);
       setVisible(true);
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    public void paint(Graphics g) {
       g.drawImage(backgroundimage,0,0,null);
    }
	public static void main(String[] args) {
		new java_masa();

	}

}
