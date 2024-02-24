package com.vq;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestLo {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblCul_Ya;
	private JLabel _Me;
	private JLabel _Te;
	private JLabel _Ku_Da;
	private JButton btnNewButton_SAiiiii;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestLo window = new TestLo();
					window.frame.setVisible(true);
					Thread tr = new Thread(new Runnable() {
						@Override
						public void run() {
							window.start();
						}
					});
					tr.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestLo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit()
				.getImage("E:\\Thư mục mới\\Oxygen-Icons.org-Oxygen-Apps-accessories-calculator.32.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("My Frame");
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(154, 67, 126, 46);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel = new JLabel("Cal");
		lblNewLabel.setVisible(false);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 4, 43, 35);
		panel.add(lblNewLabel);

		lblCul_Ya = new JLabel("cul");
		lblCul_Ya.setVisible(false);
		lblCul_Ya.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblCul_Ya.setBounds(47, 11, 31, 24);
		panel.add(lblCul_Ya);

		_Me = new JLabel("at");
		_Me.setVisible(false);
		_Me.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		_Me.setBounds(76, 11, 19, 24);
		panel.add(_Me);

		_Te = new JLabel("o");
		_Te.setVisible(false);
		_Te.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		_Te.setBounds(95, 9, 19, 24);
		panel.add(_Te);

		_Ku_Da = new JLabel("");
		_Ku_Da.setVisible(false);
		_Ku_Da.setIcon(new ImageIcon("E:\\Thư mục mới\\Iconoir-Team-Iconoir-Question-mark.16.png"));
		_Ku_Da.setHorizontalAlignment(SwingConstants.CENTER);
		_Ku_Da.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		_Ku_Da.setBounds(100, 9, 19, 10);
		panel.add(_Ku_Da);
		
		btnNewButton_SAiiiii = new JButton("Stat");
		btnNewButton_SAiiiii.setVisible(false);
		btnNewButton_SAiiiii.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Onichann--");
				Yamate y = new Yamate();
				y.setLocationRelativeTo(null);
				y.setVisible(true);
				end();
			}
		});
		btnNewButton_SAiiiii.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton_SAiiiii.setBounds(171, 139, 89, 23);
		frame.getContentPane().add(btnNewButton_SAiiiii);
	}
	
	public void start() {
	  	 try {
			Thread.sleep(400);
			this.lblNewLabel.setVisible(true);
			System.out.println("1");
			Thread.sleep(400);
			this.lblCul_Ya.setVisible(true);
			System.out.println("2");
			Thread.sleep(400);
			this._Me.setVisible(true);
			System.out.println("3");
			Thread.sleep(400);
			this._Te.setVisible(true);
			System.out.println("4");
			Thread.sleep(1000);
			this._Ku_Da.setVisible(true);
			System.out.println("5");
			Thread.sleep(1000);
			btnNewButton_SAiiiii.setVisible(true);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void end() {
		this.frame.setVisible(false);
	}
}
