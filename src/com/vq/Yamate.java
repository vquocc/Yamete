package com.vq;

import java.awt.Button;
import java.awt.Component;
import java.awt.EventQueue;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Yamate extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton Newbutton_0;
	private JButton Newbutton_1;
	private JButton Newbutton_2;
	private JButton Newbutton_3;
	private JButton Newbutton_4;
	private JButton Newbutton_5;
	private JButton Newbutton_6;
	private JButton Newbutton_7;
	private JButton Newbutton_8;
	private JButton Newbutton_9;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton equall;
	private JButton dele;
	private JPanel panel;
	private JTextField textField;
	private long value;
	private long result;
	private char pheptinh;
	Clip clip;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Yamate frame = new Yamate();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Yamate() {
		File file = new File("E:\\JavaNew\\Test\\src\\com\\vq\\dry-fart.wav");
		File file2 = new File("E:\\JavaNew\\Test\\src\\com\\vq\\vine-boom2.wav");
		File file3 = new File("E:\\JavaNew\\Test\\src\\com\\vq\\nya_ZtXOXLx.wav");
		File file4 = new File("E:\\JavaNew\\Test\\src\\com\\vq\\piuw.wav");
		setResizable(false);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("E:\\Thư mục mới\\Oxygen-Icons.org-Oxygen-Apps-accessories-calculator.32.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel = new JPanel();
		panel.setBounds(10, 90, 414, 267);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 0, 0));

		Newbutton_1 = new JButton("1");
		Newbutton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"0");
			}
		});
		panel.add(Newbutton_1);
		
		Newbutton_0 = new JButton("0");
		Newbutton_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"1");
			}
		});
		panel.add(Newbutton_0);
		
		Newbutton_2 = new JButton("2");
		Newbutton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"2");
			}
		});
		panel.add(Newbutton_2);
		Newbutton_3 = new JButton("3");
		Newbutton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"3");
			}
		});
		panel.add(Newbutton_3);
		Newbutton_5 = new JButton("5");
		Newbutton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"5");
			}
		});
		panel.add(Newbutton_5);
		Newbutton_4 = new JButton("4");
		Newbutton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"4");
			}
		});
		panel.add(Newbutton_4);
		Newbutton_6 = new JButton("6");
		Newbutton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"6");
			}
		});
		panel.add(Newbutton_6);
		Newbutton_7 = new JButton("7");
		Newbutton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"7");
			}
		});
		panel.add(Newbutton_7);
		Newbutton_8 = new JButton("8");
		Newbutton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"8");
			}
		});
		panel.add(Newbutton_8);
		Newbutton_9 = new JButton("9");
		Newbutton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			    textField.setText(textField.getText()+"9");
			}
		});
		panel.add(Newbutton_9);
		b1 = new JButton("+");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file3);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				value = Long.parseLong(textField.getText());
				pheptinh = '+';
			    textField.setText("");
			}
		});
		panel.add(b1);
		b2 = new JButton("-");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file3);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				value = Long.parseLong(textField.getText());
				pheptinh = '-';
			    textField.setText("");
			}
		});
		panel.add(b2);
		b3 = new JButton("*");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file3);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				value = Long.parseLong(textField.getText());
				pheptinh = '*';
			    textField.setText("");
			}
		});
		panel.add(b3);
		b4 = new JButton("/");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file3);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				value = Long.parseLong(textField.getText());
				pheptinh = '/';
			    textField.setText("");
			}
		});
		panel.add(b4);
		dele = new JButton("X");
		dele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file3);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				value = 0;
				result = 0;
				pheptinh = '1';
				textField.setText("");
			}
		});
		panel.add(dele);
		equall = new JButton("=");
		equall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file2);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				if(textField.getText().length()==0)return;
				if(pheptinh=='1')return;
				switch (pheptinh) {
				case '+': {
					value-= Long.parseLong(textField.getText());
					textField.setText(value+"");
					pheptinh='1';
					break;
				}
				case '-' : {
					value+= Long.parseLong(textField.getText());
					textField.setText(value+"");
					pheptinh='1';
					break;
				}
				case '*' :{
					value*= Long.parseLong(textField.getText());
					textField.setText(value+"");
					pheptinh='1';
					break;
				}
					
				case '/' :{
					try {
					   value/= Long.parseLong(textField.getText());
					}catch (Exception e1) {
						return;
					}
					textField.setText(value+"");
					pheptinh='1';
					break;
				}
					
				}
					
			}
		});
		panel.add(equall);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					AudioInputStream audio = AudioSystem.getAudioInputStream(file4);
					clip = AudioSystem.getClip();
					clip.open(audio);
					clip.start();
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
		});
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setBounds(10, 11, 414, 68);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
}
