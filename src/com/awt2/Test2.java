package com.awt2;
//20161107
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

//Swing
public class Test2 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 8639555644480525912L;
	
	private JLabel lbl;
	
	public Test2() {
		lbl = new JLabel("�޼���", JLabel.CENTER);
		getContentPane().add(lbl);
		
		//�޴��߰�
		JMenuBar mbar = new JMenuBar();
		JMenu menu;
		JMenuItem mi;
		
		menu = new JMenu("�޼�����ȭ����");
		mi = new JMenuItem("�޼���");
		menu.add(mi);
		mi.addActionListener(this);
		mi = new JMenuItem("�Է�");
		menu.add(mi);
		mi.addActionListener(this);
		mi=new JMenuItem("����");
		menu.add(mi);
		mi.addActionListener(this);
		mbar.add(menu);
		
		setJMenuBar(mbar);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("��ȭ����");
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Test2();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		
		if(str.equals("�޼���"))
			JOptionPane.showMessageDialog(this, 
					"������ ������!!", "����", JOptionPane.INFORMATION_MESSAGE);
		else if(str.equals("�Է�")){
			String age = JOptionPane.showInputDialog(this,
					"����� ����Դϱ�?", "����", JOptionPane.QUESTION_MESSAGE);
			lbl.setText("����� ���̴� " + age + "�� �Դϴ�");
		}else if(str.equals("����")){
			int result;
			result = JOptionPane.showConfirmDialog(this, 
					"���α׷��� �����Ͻðڽ��ϱ�?", "����Ȯ��", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			if(result==JOptionPane.YES_OPTION)
				System.exit(0);
				//lbl.setText(Integer.toString(result));
		}
	}
}
