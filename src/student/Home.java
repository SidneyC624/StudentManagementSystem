package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	
	private Font fillInFont = new Font("Times New Roman", Font.PLAIN, 16);
	private Font infoLabelFont = new Font ("Times New Roman", Font.BOLD, 16);
	private JTextField searchField;

	public static void main(String[] args) {
		JFrame frame = new Home();
	}

	public Home() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1049, 572);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		this.setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 255, 204));
		panel.setBounds(0, 0, 1035, 535);
		panel.setLayout(null);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 255, 255));
		panel_1.setBounds(0, 0, 1035, 45);
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("STUDENT MANAGEMENT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel.setBounds(0, 0, 552, 45);
		panel_1.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 54, 1015, 470);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(51, 255, 255));
		panel_2.setLayout(null);
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_3.setBackground(new Color(102, 255, 204));
		panel_3.setBounds(0, 0, 341, 442);
		panel_3.setLayout(null);
		panel_2.add(panel_3);
		
		textField = new JTextField();
		textField.setFont(fillInFont);
		textField.setBounds(124, 11, 207, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(fillInFont);
		textField_1.setBounds(124, 42, 207, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(124, 73, 207, 20);
		panel_3.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(fillInFont);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(124, 104, 207, 20);
		panel_3.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setFont(fillInFont);
		textField_2.setBounds(124, 135, 207, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(fillInFont);
		textField_3.setBounds(124, 166, 207, 20);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(fillInFont);
		textField_4.setBounds(124, 203, 207, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(fillInFont);
		textField_5.setBounds(124, 234, 207, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(fillInFont);
		textField_6.setBounds(124, 265, 207, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setFont(fillInFont);
		textField_7.setBounds(124, 296, 207, 20);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Student's ID");
		lblNewLabel_1.setFont(infoLabelFont);
		lblNewLabel_1.setBounds(10, 14, 100, 16);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student's Name");
		lblNewLabel_2.setFont(infoLabelFont);
		lblNewLabel_2.setBounds(10, 44, 107, 16);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth");
		lblNewLabel_3.setFont(infoLabelFont);
		lblNewLabel_3.setBounds(10, 73, 92, 20);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setFont(infoLabelFont);
		lblNewLabel_4.setBounds(10, 104, 83, 18);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(infoLabelFont);
		lblNewLabel_5.setBounds(10, 135, 49, 18);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Phone Number");
		lblNewLabel_6.setFont(infoLabelFont);
		lblNewLabel_6.setBounds(10, 166, 104, 18);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Father's Name");
		lblNewLabel_7.setFont(infoLabelFont);
		lblNewLabel_7.setBounds(10, 203, 104, 18);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Mother's Name");
		lblNewLabel_8.setFont(infoLabelFont);
		lblNewLabel_8.setBounds(10, 234, 107, 18);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address Line 1");
		lblNewLabel_9.setFont(infoLabelFont);
		lblNewLabel_9.setBounds(10, 265, 104, 18);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address Line 2");
		lblNewLabel_10.setFont(infoLabelFont);
		lblNewLabel_10.setBounds(10, 296, 104, 18);
		panel_3.add(lblNewLabel_10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_5.setBackground(new Color(102, 255, 204));
		panel_5.setBounds(10, 325, 321, 106);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		JButton browseButton = new JButton("Browse");
		browseButton.setFocusable(false);
		browseButton.setOpaque(true);
		browseButton.setBackground(new Color(51, 255, 255));
		browseButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		browseButton.setBounds(3, 35, 101, 42);
		panel_5.add(browseButton);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(107, 11, 204, 84);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(0, 0, 204, 84);
		panel_6.add(imageLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_4.setBackground(new Color(102, 255, 204));
		panel_4.setBounds(351, 0, 659, 442);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_7.setBackground(new Color(102, 255, 204));
		panel_7.setBounds(10, 11, 639, 45);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Search Student");
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(10, 11, 121, 23);
		panel_7.add(lblNewLabel_11);
		
		searchField = new JTextField();
		searchField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		searchField.setBounds(135, 11, 269, 23);
		panel_7.add(searchField);
		searchField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.setFocusable(false);
		searchButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		searchButton.setBounds(414, 11, 108, 23);
		panel_7.add(searchButton);
		
		JButton refreshButton = new JButton("Refresh");
		refreshButton.setFocusable(false);
		refreshButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		refreshButton.setBounds(521, 11, 108, 23);
		panel_7.add(refreshButton);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_8.setBackground(new Color(102, 255, 204));
		panel_8.setBounds(10, 74, 639, 312);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		this.setVisible(true);
	}
}
