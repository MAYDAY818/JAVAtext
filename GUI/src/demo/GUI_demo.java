package demo;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GUI_demo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		JFrame jframe = new JFrame();
		jframe.setTitle("����");
		jframe.setSize(500,500);
		JLabel jlabel = new JLabel("1");
		FlowLayout flowlayout = new FlowLayout(FlowLayout.RIGHT);
		
		
		Container container = jframe.getContentPane();
		
		
		JPanel jpanel = new JPanel();
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		jpanel.add(button1);
		jpanel.add(button2);
		JRadioButton jradiobutton1 = new JRadioButton("��");
		JRadioButton jradiobutton2 = new JRadioButton("Ů");
		ButtonGroup buttongroup=new ButtonGroup();
		buttongroup.add(jradiobutton1);
		buttongroup.add(jradiobutton2);
		jpanel.add(jradiobutton1);
		jpanel.add(jradiobutton2);
		button1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				String num = null;
				// TODO �Զ����ɵķ������
				jlabel.setText(num+"");
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}
			
			
		});
		JMenuBar menuBar= new JMenuBar();
		JMenu menuFile = new JMenu("�ļ�");
		JMenuItem menuItemOpen = new JMenuItem("��");
		JMenu menuNew = new JMenu("�½�");
		JMenuItem menuItemTxt = new JMenuItem("TEXT");
		menuBar.add(menuFile);
		menuFile.add(menuNew);
		menuFile.add(menuItemOpen);
		menuNew.add(menuItemTxt);
		jpanel.add(menuBar);
		
		
		JPopupMenu popupMenu = new JPopupMenu();
		JMenu menuFile1 = new JMenu("�ļ�");
		JMenuItem menuItemOpen1 = new JMenuItem("��");
		JMenu menuNew1 = new JMenu("�½�");
		JMenuItem menuItemTxt1 = new JMenuItem("TEXT");
		popupMenu.add(menuFile1);
		menuFile1.add(menuNew1);
		menuFile1.add(menuItemOpen1);
		menuNew1.add(menuItemTxt1);
		
		jpanel.addMouseListener(new MouseListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void mousePressed(MouseEvent e) {
			int mods=e.getModifiers();
			if((mods&InputEvent.BUTTON3_MASK)!=0){
			//����show������ʾ����ʽ�˵�
			popupMenu.show(jpanel,e.getX(),e.getY());
			}
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}
			});
		
		
		//jpanel.setBackground(Color.blue);
		container.add(jpanel);
		
		
/*		JPanel jpanel2 = new JPanel();
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		jpanel.add(button3);
		jpanel.add(button4);
		
		jpanel.setBackground(Color.red);
		container.add(jpanel2);*/
		
		

		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jframe.setResizable(false);//��ֹ��С�ı�
		
		
		
	}

}
