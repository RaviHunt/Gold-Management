package sapp;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JToolBar;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import java.awt.TextField;
import java.lang.NumberFormatException;
import java.awt.Button;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Mainform extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField TI;
	private JTextField TW;
	private JTextField TT;
	private JTextField TE;
	private JTextField TN;
	private JTextField TH;
	private JTextField Ttouch;
	private JTextField TP;
	private JTextField TF;
	private JTextField TS;
	private JTextField TH1;
	private JTable table_1;
	private JTable table_2;
	private JTable table;
	private JPanel panel_6;
	private JTextField TP1;
	private JTextField TH11;
	private JTextField TI1;
	private JTextField Ttouch1;
	private JTextField TW1;
	private JTextField TT1;
	private JTextField TE1;
	private JTextField TN1;
	private JTextField TF1;
	private JTextField TS1;
	private JTextField TH12;
	private JButton button_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainform frame = new Mainform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mainform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 700);
		JPanel contentPane = new JPanel();
		contentPane.setName("");
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(24, 41, 1228, 592);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(143, 188, 143));
		tabbedPane.addTab("Receive", null, panel_1, null);
		panel_1.setLayout(null);
		
		TP1 = new JTextField();
		TP1.setForeground(new Color(0, 0, 255));
		TP1.setColumns(10);
		TP1.setBounds(117, 17, 203, 26);
		panel_1.add(TP1);
		
		JLabel label_1 = new JLabel("P_name  :");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(31, 11, 89, 28);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("Date        :");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(31, 75, 89, 28);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Touch      :");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(31, 137, 89, 28);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Item        :");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(31, 206, 89, 28);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Hisab      :");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(31, 293, 89, 28);
		panel_1.add(label_5);
		
		TH11 = new JTextField();
		TH11.setForeground(new Color(0, 0, 255));
		TH11.setColumns(10);
		TH11.setBounds(117, 293, 203, 26);
		panel_1.add(TH11);
		
		TI1 = new JTextField();
		TI1.setForeground(new Color(0, 0, 255));
		TI1.setColumns(10);
		TI1.setBounds(117, 206, 203, 26);
		panel_1.add(TI1);
		
		Ttouch1 = new JTextField();
		Ttouch1.setForeground(new Color(0, 0, 255));
		Ttouch1.setColumns(10);
		Ttouch1.setBounds(117, 143, 203, 26);
		panel_1.add(Ttouch1);
		
		JDateChooser TD1 = new JDateChooser();
		TD1.setForeground(new Color(0, 0, 255));
		TD1.setBounds(117, 83, 203, 28);
		panel_1.add(TD1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(255, 182, 193));
		panel_7.setBounds(348, 11, 349, 229);
		panel_1.add(panel_7);
		
		JLabel label_6 = new JLabel("Weight    :");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(10, 11, 89, 28);
		panel_7.add(label_6);
		
		JLabel label_7 = new JLabel("Tag.Wt    :");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_7.setBounds(10, 62, 89, 28);
		panel_7.add(label_7);
		
		JLabel label_8 = new JLabel("Etc.Wt     :");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_8.setBounds(10, 119, 89, 28);
		panel_7.add(label_8);
		
		JLabel label_9 = new JLabel("Net.Wt    :");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(10, 172, 89, 28);
		panel_7.add(label_9);
		
		TW1 = new JTextField();
		TW1.setForeground(new Color(0, 0, 255));
		TW1.setColumns(10);
		TW1.setBounds(99, 11, 189, 26);
		panel_7.add(TW1);
		
		TT1 = new JTextField();
		TT1.setForeground(new Color(0, 0, 255));
		TT1.setColumns(10);
		TT1.setBounds(99, 64, 189, 26);
		panel_7.add(TT1);
		
		TE1 = new JTextField();
		TE1.setForeground(new Color(0, 0, 255));
		TE1.setColumns(10);
		TE1.setBounds(99, 119, 189, 26);
		panel_7.add(TE1);
		
		TN1 = new JTextField();
		TN1.setForeground(new Color(0, 0, 255));
		TN1.setColumns(10);
		TN1.setBounds(99, 178, 189, 26);
		panel_7.add(TN1);
		
		JButton button = new JButton("enter");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TW1!=null && TT1!=null && TE1!=null)
				{ try
				   {
					float w=Float.parseFloat(TW1.getText());
					float w1=Float.parseFloat(TT1.getText());
					float w2=Float.parseFloat(TE1.getText());
					float w3=w-w1-w2;
					String rs1=String.valueOf(w3);
					TN1.setText(rs1);
				   }catch(Exception w)
				{
					   
				}
				}
			}
		});
		button.setBounds(290, 180, 49, 23);
		panel_7.add(button);
		
		TF1 = new JTextField();
		TF1.setForeground(new Color(0, 0, 255));
		TF1.setColumns(10);
		TF1.setBounds(117, 384, 203, 26);
		panel_1.add(TF1);
		
		JButton button_1 = new JButton("cal");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					float f=Float.parseFloat(TN1.getText());
					float f1=Float.parseFloat(Ttouch1.getText());
					float f2=Float.parseFloat(TH11.getText());
					float f3=f1+f2;
					float f4=f*f3;
					float f5=f4/100;
					String rs2=String.valueOf(f5);
					TF1.setText(rs2);
					}catch(Exception ee)
					{
						
					}
			}
		});
		button_1.setBounds(318, 387, 54, 23);
		panel_1.add(button_1);
		
		TS1 = new JTextField();
		TS1.setForeground(new Color(0, 0, 255));
		TS1.setColumns(10);
		TS1.setBounds(117, 448, 203, 26);
		panel_1.add(TS1);
		
		TH12 = new JTextField();
		TH12.setForeground(new Color(0, 0, 255));
		TH12.setColumns(10);
		TH12.setBounds(117, 504, 203, 26);
		panel_1.add(TH12);
		
		button_2 = new JButton("ReSet");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP1.setText("");
				Ttouch1.setText("");
				
				TH11.setText("");
				TH12.setText("");
				TW1.setText("");
				TT1.setText("");
				TN1.setText("");
				TI1.setText("");
				TF1.setText("");
				TS1.setText("");
				TE1.setText("");
				JOptionPane.showMessageDialog(null,"ReSet Success");
		
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(447, 502, 102, 28);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Save");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=MyConnection.getConnection();
				PreparedStatement ps;
				SimpleDateFormat df=new SimpleDateFormat();
				String bd=String.valueOf(TD1.getDate());
				
					try {
						ps=(PreparedStatement) con.prepareStatement("INSERT INTO Issue(P_name,Date, Touch, Item, Hisab, Weight, Tag_Wt,Etc_Wt,Net_Wt, Fine, Stone_Rs, Hm_Rs) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
						ps.setString(1,TP1.getText());
						ps.setString(2,bd);
						ps.setString(3,Ttouch1.getText());
						ps.setString(4,TI1.getText());
						ps.setString(5,TH11.getText());
						ps.setString(6,TW1.getText());
						ps.setString(7,TT1.getText());
						ps.setString(8,TE1.getText());
						ps.setString(9,TN1.getText());
						ps.setString(10,TF1.getText());
						ps.setString(11,TS1.getText());
						ps.setString(12,TH12.getText());
					
						if(ps.executeUpdate()>0)
						{
							JOptionPane.showMessageDialog(null,"new Data is add");
						}
					} catch(SQLException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(595, 499, 102, 28);
		panel_1.add(button_3);
		
		JLabel label_10 = new JLabel("Fine         :");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(31, 384, 89, 28);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("Stone Rs:");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(31, 448, 89, 28);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("HM Rs.    :");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_12.setBounds(31, 506, 89, 28);
		panel_1.add(label_12);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Party", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 11, 685, 542);
		panel_3.setBackground(Color.PINK);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPartyname = new JLabel("Party_name : ");
		lblPartyname.setBounds(10, 26, 115, 14);
		lblPartyname.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(lblPartyname);
		
		textField = new JTextField();
		textField.setBounds(134, 25, 186, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblHisab = new JLabel("Hisab           : ");
		lblHisab.setBounds(10, 76, 111, 14);
		lblHisab.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(lblHisab);
		
		JButton btnSetItemAnd = new JButton("set Item and rate");
		btnSetItemAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Item i=new Item();
				i.setVisible(true);
         
			}
		});
		btnSetItemAnd.setBounds(134, 74, 186, 23);
		panel_3.add(btnSetItemAnd);
		
		JLabel lblNewLabel = new JLabel("Item            :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 134, 125, 31);
		panel_3.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 145, 195, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 199, 46, 14);
		panel_3.add(label);
		
		JLabel lblRate = new JLabel("Rate            :");
		lblRate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRate.setBounds(10, 199, 125, 31);
		panel_3.add(lblRate);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(134, 206, 195, 20);
		panel_3.add(textField_2);
		
		JButton btnList = new JButton("list");
		btnList.setBounds(718, 0, 89, 23);
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=MyConnection.getConnection();
				PreparedStatement ps;
				try {
					ps=(PreparedStatement) con.prepareStatement("SELECT * FROM party_name");
					ResultSet rs=ps.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
				
					
				} catch(SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
		});
		panel_2.add(btnList);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(718, 47, 480, 227);
		panel_2.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "item", "rate"
			}
		));
		scrollPane_1.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 218, 185));
		tabbedPane.addTab("Isue", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblPname = new JLabel("P_name  :");
		lblPname.setBounds(10, 32, 89, 28);
		lblPname.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblPname);
		
		JLabel lblDate = new JLabel("Date        :");
		lblDate.setBounds(10, 96, 89, 28);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblDate);
		
		JDateChooser TD = new JDateChooser();
		TD.setBounds(96, 104, 203, 28);
		panel.add(TD);
		
		JLabel lblTouch = new JLabel("Touch      :");
		lblTouch.setBounds(10, 158, 89, 28);
		lblTouch.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblTouch);
		
		JLabel lblItem = new JLabel("Item        :");
		lblItem.setBounds(10, 227, 89, 28);
		lblItem.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblItem);
		
		TI = new JTextField();
		TI.setBounds(96, 227, 203, 26);
		panel.add(TI);
		TI.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(327, 32, 349, 229);
		panel_4.setBackground(new Color(255, 182, 193));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblWeight = new JLabel("Weight    :");
		lblWeight.setBounds(10, 11, 89, 28);
		panel_4.add(lblWeight);
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblTagwt = new JLabel("Tag.Wt    :");
		lblTagwt.setBounds(10, 62, 89, 28);
		panel_4.add(lblTagwt);
		lblTagwt.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblEtcwt = new JLabel("Etc.Wt     :");
		lblEtcwt.setBounds(10, 119, 89, 28);
		panel_4.add(lblEtcwt);
		lblEtcwt.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		JLabel lblNetwt = new JLabel("Net.Wt    :");
		lblNetwt.setBounds(10, 172, 89, 28);
		lblNetwt.setFont(new Font("Tahoma", Font.BOLD, 15));
	    panel_4.add(lblNetwt);
		
		TW = new JTextField();
		TW.setBounds(99, 11, 189, 26);
		panel_4.add(TW);
		TW.setColumns(10);
		
		TT = new JTextField();
		TT.setColumns(10);
		TT.setBounds(99, 64, 189, 26);
		panel_4.add(TT);
		
		TE = new JTextField();
		TE.setColumns(10);
		TE.setBounds(99, 119, 189, 26);
		panel_4.add(TE);
		
		TN = new JTextField();
		TN.setColumns(10);
		TN.setBounds(99, 178, 189, 26);

		panel_4.add(TN);
		
		JButton btnEnter = new JButton("enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(TW!=null && TT!=null && TE!=null)
				{ try
				   {
					float w=Float.parseFloat(TW.getText());
					float w1=Float.parseFloat(TT.getText());
					float w2=Float.parseFloat(TE.getText());
					float w3=w-w1-w2;
					String rs1=String.valueOf(w3);
					TN.setText(rs1);
				   }catch(Exception w)
				{
					   
				}
				}
			}
		});
		btnEnter.setBounds(290, 180, 49, 23);
		panel_4.add(btnEnter);
		
		JLabel lblHisab_1 = new JLabel("Hisab      :");
		lblHisab_1.setBounds(10, 314, 89, 28);
		lblHisab_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblHisab_1);
		
		TH = new JTextField();
		TH.setBounds(96, 314, 203, 26);
		TH.setColumns(10);
		panel.add(TH);
		
		Ttouch = new JTextField();
		Ttouch.setBounds(96, 164, 203, 26);
		Ttouch.setColumns(10);
		panel.add(Ttouch);
		
		TP = new JTextField();
		TP.setBounds(96, 38, 203, 26);
		TP.setColumns(10);
		panel.add(TP);
		
		JLabel lblFine = new JLabel("Fine         :");
		lblFine.setBounds(10, 403, 89, 28);
		lblFine.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblFine);
		
		TF = new JTextField();
		TF.setBounds(96, 405, 203, 26);
		TF.setColumns(10);
		panel.add(TF);
		
		JLabel lblStoneRs = new JLabel("Stone Rs:");
		lblStoneRs.setBounds(10, 467, 89, 28);
		lblStoneRs.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblStoneRs);
		
		JLabel lblHmRs = new JLabel("HM Rs.    :");
		lblHmRs.setBounds(10, 525, 89, 28);
		lblHmRs.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel.add(lblHmRs);
		
		TS = new JTextField();
		TS.setBounds(96, 469, 203, 26);
		TS.setColumns(10);
		panel.add(TS);
		
		TH1 = new JTextField();
		TH1.setBounds(96, 525, 203, 26);
		TH1.setColumns(10);
		panel.add(TH1);
		
		JButton btnNewButton = new JButton("cal");
		btnNewButton.setBounds(297, 408, 54, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				float f=Float.parseFloat(TN.getText());
				float f1=Float.parseFloat(Ttouch.getText());
				float f2=Float.parseFloat(TH.getText());
				float f3=f1+f2;
				float f4=f*f3;
				float f5=f4/100;
				String rs2=String.valueOf(f5);
				TF.setText(rs2);
				}catch(Exception ee)
				{
					
				}
				
			}
		});
		panel.add(btnNewButton);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=MyConnection.getConnection();
				PreparedStatement ps;
				SimpleDateFormat df=new SimpleDateFormat();
				String bd=String.valueOf(TD.getDate());
				
					try {
						ps=(PreparedStatement) con.prepareStatement("INSERT INTO Issue(P_name,Date, Touch, Item, Hisab, Weight, Tag_Wt,Etc_Wt,Net_Wt, Fine, Stone_Rs, Hm_Rs) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
						ps.setString(1,TP.getText());
						ps.setString(2,bd);
						ps.setString(3,Ttouch.getText());
						ps.setString(4,TI.getText());
						ps.setString(5,TH.getText());
						ps.setString(6,TW.getText());
						ps.setString(7,TT.getText());
						ps.setString(8,TE.getText());
						ps.setString(9,TN.getText());
						ps.setString(10,TF.getText());
						ps.setString(11,TS.getText());
						ps.setString(12,TH1.getText());
					
						if(ps.executeUpdate()>0)
						{
							JOptionPane.showMessageDialog(null,"new Data is add");
						}
					} catch(SQLException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
			}
		});
		btnSave.setBounds(574, 520, 102, 28);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnSave);
		
		JButton btnReset = new JButton("ReSet");
		btnReset.setBounds(426, 523, 102, 28);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setText("");
				Ttouch.setText("");
				
				TH.setText("");
				TH1.setText("");
				TW.setText("");
				TT.setText("");
				TN.setText("");
				TI.setText("");
				TF.setText("");
				TS.setText("");
				TE.setText("");
				JOptionPane.showMessageDialog(null,"ReSet Success");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(btnReset);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("History", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 62, 938, 473);
		panel_5.add(scrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"id", "P_name", "Date", "Touch", "Item", "Hisab", "Weight", "Tag_wt", "Etc_wt", "Net_wt", "Fine", "Stone_rs", "Hm_rs"
			}
		));
		scrollPane.setViewportView(table_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(28, 11, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=MyConnection.getConnection();
				PreparedStatement ps;
				try {
					ps=(PreparedStatement) con.prepareStatement("SELECT * FROM issue");
					ResultSet rs=ps.executeQuery();
					table_2.setModel(DbUtils.resultSetToTableModel(rs));
				
					
				} catch(SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
			
		});
		panel_5.add(btnNewButton_1);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(95, 158, 160));
		panel_6.setBounds(976, 63, 218, 472);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblTouch_1 = new JLabel("Touch :");
		lblTouch_1.setBounds(10, 70, 52, 14);
		lblTouch_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_6.add(lblTouch_1);
		JLabel LT = new JLabel("");
		LT.setBounds(72, 72, 102, 14);
		panel_6.add(LT);
		

		JLabel LW = new JLabel("");
		LW.setBounds(72, 105, 102, 14);
		panel_6.add(LW);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.setBounds(0, 0, 89, 23);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=MyConnection.getConnection();
				PreparedStatement ps;
				try {
					float t=0;
					ps=(PreparedStatement) con.prepareStatement("SELECT SUM(Touch) FROM `issue`");
					ResultSet rs=ps.executeQuery();
					while(rs.next())
					{
			           t=rs.getFloat(1);
			           LT.setText(Float.toString(t));
					}

					Connection con1=MyConnection.getConnection();
					PreparedStatement ps1;
					float t1=0;
					ps1=(PreparedStatement) con1.prepareStatement("SELECT SUM(Weight) FROM `issue`");
					ResultSet rs1=ps1.executeQuery();
					while(rs1.next())
					{
			           t1=rs1.getFloat(1);
			           LW.setText(Float.toString(t1));
					}
				
					
				} catch(SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace();
				}
			}
				
		});
		panel_6.add(btnTotal);
		
		JLabel lblWeight_1 = new JLabel(" Weight :");
		lblWeight_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWeight_1.setBounds(0, 103, 62, 14);
		panel_6.add(lblWeight_1);
		
		
		
		
		
		
		JLabel lblSells = new JLabel("      MANAGEMENT");
		lblSells.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblSells.setBackground(Color.BLACK);
		lblSells.setBounds(347, 16, 291, 32);
		contentPane.add(lblSells);
		
		table_1 = new JTable();
		table_1.setBounds(90, 31, 1, 1);
		contentPane.add(table_1);
		
	
		
	}
}
