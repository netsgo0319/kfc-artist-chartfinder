package com.yejin.main.util;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingUtil extends JFrame implements ActionListener {
	JPanel background;
	JPanel[] p;
	static JTextField artistName;
	JButton ok, exit;
	JLabel artistLabel;

	public SwingUtil(){ 
		setSize(450,130);
		Dimension frameSize = getSize();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screenSize.width/2 - frameSize.width/2),
				(screenSize.height/2 - frameSize.height/2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Melon 똥꾸씨 (하트)");
		setResizable(false);
		setLayout(null);
		setVisible(true);

		background = new JPanel() {
			public void paintComponent(Graphics g) {
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		add(background);
		background.setBounds(0, 0, 1000, 200);

		background.setLayout(null);

		artistLabel = new JLabel("검색하려는 아티스트를 입력하세요.");
		background.add(artistLabel);
		artistLabel.setBounds(30,20,300,25);

		artistName = new JTextField();
		background.add(artistName);
		artistName.setBounds(215,20,200,25);
		artistName.requestFocus();

		ok = new JButton("생성(O)");
		background.add(ok);
		ok.setBounds(115,60,100,25);

		exit = new JButton("나가기(Q)");
		background.add(exit);
		exit.setBounds(215,60,100,25);


		ok.addActionListener(this);
		exit.addActionListener(this);

		ok.setMnemonic('O');
		exit.setMnemonic('Q');
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			if (artistName.getText().trim().length() != 0) {
				artistName.requestFocus();
				JOptionPane.showMessageDialog(this,artistName.getText()+"의 파일이 생성되었습니다.","파일 생성",JOptionPane.INFORMATION_MESSAGE);
				artistName.setText("");
			} else {
				JOptionPane.showMessageDialog(null, "빈칸을 입력해 주세요.");
			}
		} else if (e.getSource() == exit) {
			System.exit(0);
		}
	}
}