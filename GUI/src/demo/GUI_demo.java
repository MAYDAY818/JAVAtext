package demo;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GUI_demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JFrame jframe = new JFrame();
		jframe.setTitle("测试");
		jframe.setSize(500,500);
		JLabel jlabel = new JLabel("1");
		FlowLayout flowlayout = new FlowLayout(FlowLayout.RIGHT);
		
		
		Container container = jframe.getContentPane();
		
		
		JPanel jpanel = new JPanel();
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		jpanel.add(button1);
		jpanel.add(button2);
		JRadioButton jradiobutton1 = new JRadioButton("男");
		JRadioButton jradiobutton2 = new JRadioButton("女");
		ButtonGroup buttongroup=new ButtonGroup();
		buttongroup.add(jradiobutton1);
		buttongroup.add(jradiobutton2);
		jpanel.add(jradiobutton1);
		jpanel.add(jradiobutton2);
		button1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				String num = null;
				// TODO 自动生成的方法存根
				jlabel.setText(num+"");
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}
			
			
		});
		JMenuBar menuBar= new JMenuBar();
		JMenu menuFile = new JMenu("文件");
		JMenuItem menuItemOpen = new JMenuItem("打开");
		JMenu menuNew = new JMenu("新建");
		JMenuItem menuItemTxt = new JMenuItem("TEXT");
		menuBar.add(menuFile);
		menuFile.add(menuNew);
		menuFile.add(menuItemOpen);
		menuNew.add(menuItemTxt);
		jpanel.add(menuBar);
		
		
		JPopupMenu popupMenu = new JPopupMenu();
		JMenu menuFile1 = new JMenu("文件");
		JMenuItem menuItemOpen1 = new JMenuItem("打开");
		JMenu menuNew1 = new JMenu("新建");
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
			//调用show方法显示弹出式菜单
			popupMenu.show(jpanel,e.getX(),e.getY());
			}
			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO 自动生成的方法存根
				
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
		jframe.setResizable(false);//防止大小改变
		
		
		
	}

}
