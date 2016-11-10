package com.awt;
//20161104
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test5 extends Frame implements ActionListener {

	private static final long serialVersionUID = -3381193909072344799L;
	private TextField[] tf = new TextField[4];
	private Label result = new Label("", Label.CENTER);
	private Button btn1,btn2;
	
	public Test5(){
		String[] title = {"�̸�","����","����","����","����"};
		
		setTitle("����ó��");
		setLayout(null);//���̾ƿ��ʱ�ȭ(������ġ)
		
		for(int i=0;i<5;i++){
			Label lbl = new Label();
			
			lbl.setText(title[i]);
			lbl.setBounds(10, (i+1)*30, 50, 20);//x,y,w,h
			add(lbl);
			
			if(i!=4){
				tf[i] = new TextField();
				tf[i].setBounds(80, (i+1)*30, 70, 20);
				tf[i].addKeyListener(new MyKey());
				add(tf[i]);
			}else{
				result.setBounds(80, (i+1)*30, 70, 20);
				add(result);
			}
		}//end..for
		
		//��ư
		btn1 = new Button("���");
		btn1.setBounds(180, 30, 60, 20);
		add(btn1);
		btn1.addActionListener(this);
		btn1.addKeyListener(new MyKey());
		//
		btn2 = new Button("����");
		btn2.setBounds(180, 60, 60, 20);
		add(btn2);
		btn2.addActionListener(this);
		//
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setSize(260, 180);
		setResizable(false);//<-�ִ�ȭ��ư�� ��Ȱ��ȭ��
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if(ob instanceof Button){
			Button b = (Button)ob;
			
			if(b==btn1)
				//�հ�
				execute();
			else if(b==btn2)
				//����
				System.exit(0);
		}
	}//end..AP
	
	private void execute(){
		int tot = 0;
		
		try {
			for(int i=1;i<=3;i++){
				tot+=Integer.parseInt(tf[i].getText());
				result.setText(Integer.toString(tot));
				//result.setText(""+tot);
				//tf[0].setText("");
				//tf[i].setText("");
				//tf[0].requestFocus();
			}
		} catch (Exception e2) {
			result.setText("�Է¿���!!");
		}
	}
	
	class MyKey extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			Object ob = e.getSource();
			
			if(e.getKeyCode()!=KeyEvent.VK_ENTER)
				return;
			//��ư-����
			if(ob instanceof Button){
				Button b = (Button)ob;
				if(b==btn1)
					//�հ�
					execute();
				return;
			}
			
			//TextField-����
			if(ob instanceof TextField){
				TextField t =(TextField)ob;
				for (int i = 0; i < tf.length; i++)
					if(i!=3&&tf[i]==t){
						tf[i+1].requestFocus();
						return;
					}else if(tf[3]==t){
						btn1.requestFocus();
						return;
					}
			}
		}
	}
}
