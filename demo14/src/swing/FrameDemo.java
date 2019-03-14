package swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FrameDemo {
	public static int num=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jFrame = new JFrame();
		jFrame.setTitle("测试窗口");
		jFrame.setSize(500, 500);
		Container contentPane = jFrame.getContentPane();
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		JPanel jPanel = new JPanel(flowLayout);
		jPanel.setSize(200, 200);
		JLabel jLabel = new JLabel("0");
		jPanel.add(jLabel);
		JButton button= new JButton("button1");
		button.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				num++;
				jLabel.setText(num+"");
			}
		});
		
		
		JButton button2= new JButton("button2");
		jPanel.add(button);
		jPanel.add(button2);
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		jPanel.add(new JButton("button3"));
		
		JRadioButton jRadioButton1= new JRadioButton("男");
		JRadioButton jRadioButton2= new JRadioButton("女");
		ButtonGroup buttonGroup= new ButtonGroup();
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		jPanel.add(jRadioButton1);
		jPanel.add(jRadioButton2);
//		jPanel.setBackground(Color.BLUE);
		contentPane.add(jPanel);

//		//第二个panel
//		JPanel jPanel2 = new JPanel();
//		jPanel2.setSize(200, 200);
//		JButton button3= new JButton("button3");
//		JButton button4= new JButton("button4");
//		jPanel2.add(button3);
//		jPanel2.add(button4);
//		jPanel2.setBackground(Color.red);
//		contentPane.add(jPanel2);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setResizable(false);

		jFrame.setVisible(true);
	}

}
