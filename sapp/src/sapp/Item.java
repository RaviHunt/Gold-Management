package sapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Item extends JFrame {

	private JPanel contentPane;
	private JTextField Iname;
	private JTextField Rate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Item frame = new Item();
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
	public Item() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblItemname = new JLabel("Item_name :");
		lblItemname.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblItemname.setBounds(51, 72, 142, 23);
		contentPane.add(lblItemname);
		
		Iname = new JTextField();
		Iname.setBounds(203, 72, 207, 24);
		contentPane.add(Iname);
		Iname.setColumns(10);
		
		JLabel lblRate = new JLabel("Rate              :");
		lblRate.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRate.setBounds(51, 135, 142, 23);
		contentPane.add(lblRate);
		
		Rate = new JTextField();
		Rate.setBounds(203, 136, 207, 23);
		contentPane.add(Rate);
		Rate.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection con=MyConnection.getConnection();
				PreparedStatement ps;
				
					try {
						ps=(PreparedStatement) con.prepareStatement("INSERT INTO party_name(item, rate) VALUES (?,?)");
						ps.setString(1,Iname.getText());
						ps.setString(2,Rate.getText());
					
						if(ps.executeUpdate()>0)
						{
							JOptionPane.showMessageDialog(null,"new item is add");
						}
					} catch(SQLException ex) {
						// TODO Auto-generated catch block
						ex.printStackTrace();
					}
				
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(321, 218, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBounds(203, 220, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCancel.setBounds(77, 220, 89, 23);
		contentPane.add(btnCancel);
	}

}
