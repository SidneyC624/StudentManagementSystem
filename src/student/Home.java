package student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Home extends JFrame implements ActionListener{
	private static JFrame frame;
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
	private JTable table;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_16;
	private JTextField textField_25;
	private JTextField textField_10;
	private JTable table_1;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTable table_2;
	private JTextField textField_26;
	private JTable table_3;
	
	private JButton studentLogoutButton;
	private JButton courseLogoutButton;
	private JButton scoreLogoutButton;
	private JButton marksLogoutButton;
	
	private DefaultTableModel model;

	public static void main(String[] args) {
		frame = new Home();
	}

	public Home() {
		// makes window appear a bit slower
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				for(double i=0.1; i<=1; i+=0.1) {
					String s = i + "";
					Float f = Float.valueOf(s);
					frame.setOpacity(f);
					try {
						Thread.sleep(40);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1035, 535);
		
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
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(new Color(51, 255, 255));
		panel_1.setBounds(0, 0, 1035, 45);
		panel_1.setLayout(null);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("STUDENT MANAGEMENT");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 0, 552, 45);
		panel_1.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Times New Roman", Font.BOLD, 18));
		tabbedPane.setBounds(10, 54, 1015, 470);
		panel.add(tabbedPane);
		
		JPanel studentTab = new JPanel();
		studentTab.setBackground(new Color(51, 255, 255));
		studentTab.setLayout(null);
		tabbedPane.addTab("Student", null, studentTab, null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_3.setBackground(new Color(102, 255, 204));
		panel_3.setBounds(0, 0, 341, 442);
		panel_3.setLayout(null);
		studentTab.add(panel_3);
		
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
		browseButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		browseButton.setBounds(10, 53, 95, 42);
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
		
		JLabel lblNewLabel_12 = new JLabel("Image");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_12.setBounds(10, 11, 63, 22);
		panel_5.add(lblNewLabel_12);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_4.setBackground(new Color(102, 255, 204));
		panel_4.setBounds(351, 0, 659, 442);
		studentTab.add(panel_4);
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
		searchButton.setBackground(new Color(51, 255, 255));
		searchButton.setFocusable(false);
		searchButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		searchButton.setBounds(414, 11, 108, 23);
		panel_7.add(searchButton);
		
		JButton refreshButton = new JButton("Refresh");
		refreshButton.setBackground(new Color(51, 255, 255));
		refreshButton.setFocusable(false);
		refreshButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		refreshButton.setBounds(521, 11, 108, 23);
		panel_7.add(refreshButton);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_8.setBackground(new Color(102, 255, 204));
		panel_8.setBounds(10, 74, 639, 297);
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student's ID", "Student's Name", "Date of Birth", "Gender", "Email", "Phone Number", "Father's Name", "Mother's Name", "Address Line 1", "Address Line 2"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(88);
		table.getColumnModel().getColumn(5).setPreferredWidth(82);
		table.getColumnModel().getColumn(6).setPreferredWidth(82);
		table.getColumnModel().getColumn(7).setPreferredWidth(85);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 11, 619, 275);
		panel_8.add(scrollPane);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_9.setBackground(new Color(102, 255, 204));
		panel_9.setBounds(10, 375, 639, 56);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JButton btnNewButton = new JButton("Add New");
		btnNewButton.setOpaque(true);
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(51, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setBounds(10, 11, 101, 30);
		panel_9.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(new Color(51, 255, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1.setBounds(115, 11, 95, 30);
		panel_9.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBackground(new Color(51, 255, 255));
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_2.setBounds(220, 11, 95, 30);
		panel_9.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.setOpaque(true);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBackground(new Color(51, 255, 255));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3.setBounds(325, 11, 95, 30);
		panel_9.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Clear");
		btnNewButton_4.setOpaque(true);
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setBackground(new Color(51, 255, 255));
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(430, 11, 95, 30);
		panel_9.add(btnNewButton_4);
		
		studentLogoutButton = new JButton("Logout");
		studentLogoutButton.addActionListener(this);
		studentLogoutButton.setOpaque(true);
		studentLogoutButton.setFocusable(false);
		studentLogoutButton.setBackground(new Color(51, 255, 255));
		studentLogoutButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		studentLogoutButton.setBounds(535, 11, 95, 30);
		panel_9.add(studentLogoutButton);
		
		JPanel courseTab = new JPanel();
		courseTab.setLayout(null);
		courseTab.setBackground(new Color(51, 255, 255));
		tabbedPane.addTab("Course", null, courseTab, null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_3_1.setBackground(new Color(102, 255, 204));
		panel_3_1.setBounds(0, 0, 341, 442);
		courseTab.add(panel_3_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(124, 137, 207, 20);
		panel_3_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(124, 168, 207, 20);
		panel_3_1.add(textField_9);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_1.setBounds(124, 199, 207, 20);
		panel_3_1.add(comboBox_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(10, 139, 100, 16);
		panel_3_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Student's ID");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(10, 170, 107, 16);
		panel_3_1.add(lblNewLabel_2_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_5_1.setBackground(new Color(102, 255, 204));
		panel_5_1.setBounds(10, 11, 321, 106);
		panel_3_1.add(panel_5_1);
		
		JLabel lblNewLabel_19 = new JLabel("Student's ID");
		lblNewLabel_19.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_19.setBounds(10, 11, 94, 28);
		panel_5_1.add(lblNewLabel_19);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_10.setBounds(10, 48, 197, 28);
		panel_5_1.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnNewButton_9 = new JButton("Search");
		btnNewButton_9.setBackground(new Color(51, 255, 255));
		btnNewButton_9.setFocusable(false);
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9.setBounds(217, 48, 94, 30);
		panel_5_1.add(btnNewButton_9);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"C Programming", "C++ Programming", "Advanced Mathematics II", "Data Structures & Algorithms", "Python Java", "Comprehensive Practice 1", "Engineering Mathematics"}));
		comboBox_4.setBounds(124, 229, 207, 20);
		panel_3_1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Principle of computer component", "Report Writing", "Web Programming", "Java OOP", "Design User Interface", "JSP", "Software Testing and Inspection", "Mobile App Development", ""}));
		comboBox_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_5.setBounds(124, 260, 207, 20);
		panel_3_1.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Advanced Mathematics I", "Database", "Software Testing", "Linux", "Data Science", "Big Data I", "Big Data II", "Comprehensive Practice II"}));
		comboBox_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_6.setBounds(124, 291, 207, 20);
		panel_3_1.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Chinese Traditional Culture", "Computer Network", "Overview of China", "Principle of Operating System", "Computer Science", "Artificial Intelligence I", "HSK 3", "Digital Image Processing"}));
		comboBox_7.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_7.setBounds(124, 322, 207, 20);
		panel_3_1.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Cloud Computing", "Algorithms Analysis and Design", "machine Learning ", "Deep Learning", "HSK Test Tutoring", "IT Project Management", "Artificial Intelligence II", "Graduation Thesis"}));
		comboBox_8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox_8.setBounds(124, 353, 207, 20);
		panel_3_1.add(comboBox_8);
		
		JLabel lblNewLabel_13 = new JLabel("Semester");
		lblNewLabel_13.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13.setBounds(10, 203, 100, 16);
		panel_3_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Course 1");
		lblNewLabel_14.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_14.setBounds(10, 232, 107, 17);
		panel_3_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Course 2");
		lblNewLabel_15.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_15.setBounds(10, 260, 115, 17);
		panel_3_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Course 3");
		lblNewLabel_16.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_16.setBounds(10, 294, 100, 16);
		panel_3_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Course 4");
		lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_17.setBounds(10, 325, 100, 17);
		panel_3_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Course 5");
		lblNewLabel_18.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_18.setBounds(10, 355, 110, 17);
		panel_3_1.add(lblNewLabel_18);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_4_1.setBackground(new Color(102, 255, 204));
		panel_4_1.setBounds(351, 0, 659, 442);
		courseTab.add(panel_4_1);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setLayout(null);
		panel_7_1.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_7_1.setBackground(new Color(102, 255, 204));
		panel_7_1.setBounds(10, 11, 639, 45);
		panel_4_1.add(panel_7_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Search Student");
		lblNewLabel_11_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11_1.setBounds(10, 11, 121, 23);
		panel_7_1.add(lblNewLabel_11_1);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_16.setColumns(10);
		textField_16.setBounds(135, 11, 269, 23);
		panel_7_1.add(textField_16);
		
		JButton searchButton_1 = new JButton("Search");
		searchButton_1.setBackground(new Color(51, 255, 255));
		searchButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		searchButton_1.setFocusable(false);
		searchButton_1.setBounds(414, 11, 108, 23);
		panel_7_1.add(searchButton_1);
		
		JButton refreshButton_1 = new JButton("Refresh");
		refreshButton_1.setBackground(new Color(51, 255, 255));
		refreshButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		refreshButton_1.setFocusable(false);
		refreshButton_1.setBounds(521, 11, 108, 23);
		panel_7_1.add(refreshButton_1);
		
		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_8_1.setBackground(new Color(102, 255, 204));
		panel_8_1.setBounds(10, 74, 639, 297);
		panel_4_1.add(panel_8_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 11, 619, 275);
		panel_8_1.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Student's ID", "Semester", "Course 1", "Course 2", "Course 3", "Course 4", "Course 5"
			}
		));
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_9_1.setBackground(new Color(102, 255, 204));
		panel_9_1.setBounds(10, 375, 639, 56);
		panel_4_1.add(panel_9_1);
		
		JButton btnNewButton_6 = new JButton("Save");
		btnNewButton_6.setOpaque(true);
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setBackground(new Color(51, 255, 255));
		btnNewButton_6.setBounds(10, 11, 101, 30);
		panel_9_1.add(btnNewButton_6);
		
		JButton btnNewButton_3_1 = new JButton("Print");
		btnNewButton_3_1.setOpaque(true);
		btnNewButton_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3_1.setFocusable(false);
		btnNewButton_3_1.setBackground(new Color(51, 255, 255));
		btnNewButton_3_1.setBounds(121, 11, 95, 30);
		panel_9_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_4_1 = new JButton("Clear");
		btnNewButton_4_1.setOpaque(true);
		btnNewButton_4_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4_1.setFocusable(false);
		btnNewButton_4_1.setBackground(new Color(51, 255, 255));
		btnNewButton_4_1.setBounds(226, 11, 95, 30);
		panel_9_1.add(btnNewButton_4_1);
		
		courseLogoutButton = new JButton("Logout");
		courseLogoutButton.addActionListener(this);
		courseLogoutButton.setOpaque(true);
		courseLogoutButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		courseLogoutButton.setFocusable(false);
		courseLogoutButton.setBackground(new Color(51, 255, 255));
		courseLogoutButton.setBounds(331, 11, 95, 30);
		panel_9_1.add(courseLogoutButton);
		
		JPanel scoreTab = new JPanel();
		scoreTab.setLayout(null);
		scoreTab.setBackground(new Color(51, 255, 255));
		tabbedPane.addTab("Score", null, scoreTab, null);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_3_2.setBackground(new Color(102, 255, 204));
		panel_3_2.setBounds(0, 0, 341, 442);
		scoreTab.add(panel_3_2);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_3_1_1.setBackground(new Color(102, 255, 204));
		panel_3_1_1.setBounds(0, 0, 341, 442);
		panel_3_2.add(panel_3_1_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(124, 183, 207, 20);
		panel_3_1_1.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_12.setColumns(10);
		textField_12.setBounds(124, 214, 207, 20);
		panel_3_1_1.add(textField_12);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(10, 185, 100, 16);
		panel_3_1_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Student's ID");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(10, 216, 107, 16);
		panel_3_1_1.add(lblNewLabel_2_1_1);
		
		JPanel panel_5_1_1 = new JPanel();
		panel_5_1_1.setLayout(null);
		panel_5_1_1.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_5_1_1.setBackground(new Color(102, 255, 204));
		panel_5_1_1.setBounds(10, 11, 321, 161);
		panel_3_1_1.add(panel_5_1_1);
		
		JLabel lblNewLabel_19_1 = new JLabel("Student's ID");
		lblNewLabel_19_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_19_1.setBounds(10, 11, 94, 28);
		panel_5_1_1.add(lblNewLabel_19_1);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_13.setColumns(10);
		textField_13.setBounds(10, 48, 197, 28);
		panel_5_1_1.add(textField_13);
		
		JButton btnNewButton_9_1 = new JButton("Search");
		btnNewButton_9_1.setFocusable(false);
		btnNewButton_9_1.setBackground(new Color(51, 255, 255));
		btnNewButton_9_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9_1.setBounds(217, 61, 94, 65);
		panel_5_1_1.add(btnNewButton_9_1);
		
		JLabel lblNewLabel_20 = new JLabel("Semester");
		lblNewLabel_20.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_20.setBounds(10, 85, 94, 28);
		panel_5_1_1.add(lblNewLabel_20);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_14.setBounds(8, 116, 199, 28);
		panel_5_1_1.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_13_1 = new JLabel("Semester");
		lblNewLabel_13_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_13_1.setBounds(10, 249, 100, 16);
		panel_3_1_1.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("Course 1");
		lblNewLabel_14_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_14_1.setBounds(10, 278, 107, 17);
		panel_3_1_1.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("Course 2");
		lblNewLabel_15_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_15_1.setBounds(10, 306, 115, 17);
		panel_3_1_1.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("Course 3");
		lblNewLabel_16_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_16_1.setBounds(10, 334, 100, 16);
		panel_3_1_1.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_17_1 = new JLabel("Course 4");
		lblNewLabel_17_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_17_1.setBounds(10, 357, 100, 17);
		panel_3_1_1.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel_18_1 = new JLabel("Course 5");
		lblNewLabel_18_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_18_1.setBounds(10, 385, 110, 17);
		panel_3_1_1.add(lblNewLabel_18_1);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_15.setBounds(124, 247, 137, 20);
		panel_3_1_1.add(textField_15);
		textField_15.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setText("0.0");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_17.setBounds(271, 247, 60, 20);
		panel_3_1_1.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_18.setBounds(124, 277, 137, 18);
		panel_3_1_1.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setText("0.0");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_19.setBounds(271, 277, 60, 18);
		panel_3_1_1.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_20.setBounds(123, 305, 138, 18);
		panel_3_1_1.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setText("0.0");
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_21.setBounds(271, 305, 60, 16);
		panel_3_1_1.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_22.setBounds(122, 334, 139, 17);
		panel_3_1_1.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setText("0.0");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_23.setBounds(271, 333, 60, 17);
		panel_3_1_1.add(textField_23);
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_24.setBounds(124, 357, 137, 16);
		panel_3_1_1.add(textField_24);
		textField_24.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setText("0.0");
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_35.setBounds(271, 356, 60, 17);
		panel_3_1_1.add(textField_35);
		textField_35.setColumns(10);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_36.setBounds(124, 384, 137, 18);
		panel_3_1_1.add(textField_36);
		textField_36.setColumns(10);
		
		textField_37 = new JTextField();
		textField_37.setText("0.0");
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_37.setBounds(271, 384, 60, 18);
		panel_3_1_1.add(textField_37);
		textField_37.setColumns(10);
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_4_2.setBackground(new Color(102, 255, 204));
		panel_4_2.setBounds(351, 0, 659, 442);
		scoreTab.add(panel_4_2);
		
		JPanel panel_7_2 = new JPanel();
		panel_7_2.setLayout(null);
		panel_7_2.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_7_2.setBackground(new Color(102, 255, 204));
		panel_7_2.setBounds(10, 11, 639, 45);
		panel_4_2.add(panel_7_2);
		
		JLabel lblNewLabel_11_2 = new JLabel("Search Student");
		lblNewLabel_11_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_11_2.setBounds(10, 11, 121, 23);
		panel_7_2.add(lblNewLabel_11_2);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField_25.setColumns(10);
		textField_25.setBounds(135, 11, 269, 23);
		panel_7_2.add(textField_25);
		
		JButton searchButton_2 = new JButton("Search");
		searchButton_2.setBackground(new Color(51, 255, 255));
		searchButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		searchButton_2.setFocusable(false);
		searchButton_2.setBounds(414, 11, 108, 23);
		panel_7_2.add(searchButton_2);
		
		JButton refreshButton_2 = new JButton("Refresh");
		refreshButton_2.setBackground(new Color(51, 255, 255));
		refreshButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		refreshButton_2.setFocusable(false);
		refreshButton_2.setBounds(521, 11, 108, 23);
		panel_7_2.add(refreshButton_2);
		
		JPanel panel_8_2 = new JPanel();
		panel_8_2.setLayout(null);
		panel_8_2.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_8_2.setBackground(new Color(102, 255, 204));
		panel_8_2.setBounds(10, 74, 639, 297);
		panel_4_2.add(panel_8_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 11, 619, 275);
		panel_8_2.add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Student's ID", "Semester", "Course 1", "Score 1", "Course 2", "Score 2", "Course 3", "Score 3", "Course 4", "Score 4", "Course 5", "Score 5"
			}
		));
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_2.setViewportView(table_2);
		
		JPanel panel_9_2 = new JPanel();
		panel_9_2.setLayout(null);
		panel_9_2.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_9_2.setBackground(new Color(102, 255, 204));
		panel_9_2.setBounds(10, 375, 639, 56);
		panel_4_2.add(panel_9_2);
		
		JButton btnNewButton_7 = new JButton("Save");
		btnNewButton_7.setOpaque(true);
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.setBackground(new Color(51, 255, 255));
		btnNewButton_7.setBounds(10, 11, 101, 30);
		panel_9_2.add(btnNewButton_7);
		
		JButton btnNewButton_1_2 = new JButton("Update");
		btnNewButton_1_2.setOpaque(true);
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_1_2.setFocusable(false);
		btnNewButton_1_2.setBackground(new Color(51, 255, 255));
		btnNewButton_1_2.setBounds(115, 11, 95, 30);
		panel_9_2.add(btnNewButton_1_2);
		
		JButton btnNewButton_3_2 = new JButton("Print");
		btnNewButton_3_2.setOpaque(true);
		btnNewButton_3_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3_2.setFocusable(false);
		btnNewButton_3_2.setBackground(new Color(51, 255, 255));
		btnNewButton_3_2.setBounds(215, 11, 95, 30);
		panel_9_2.add(btnNewButton_3_2);
		
		JButton btnNewButton_4_2 = new JButton("Clear");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_2.setOpaque(true);
		btnNewButton_4_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4_2.setFocusable(false);
		btnNewButton_4_2.setBackground(new Color(51, 255, 255));
		btnNewButton_4_2.setBounds(315, 11, 95, 30);
		panel_9_2.add(btnNewButton_4_2);
		
		scoreLogoutButton = new JButton("Logout");
		scoreLogoutButton.addActionListener(this);
		scoreLogoutButton.setOpaque(true);
		scoreLogoutButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		scoreLogoutButton.setFocusable(false);
		scoreLogoutButton.setBackground(new Color(51, 255, 255));
		scoreLogoutButton.setBounds(418, 11, 95, 30);
		panel_9_2.add(scoreLogoutButton);
		
		JPanel marksSheetTab = new JPanel();
		marksSheetTab.setLayout(null);
		marksSheetTab.setBackground(new Color(51, 255, 255));
		tabbedPane.addTab("Marks Sheet", null, marksSheetTab, null);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setLayout(null);
		panel_3_3.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_3_3.setBackground(new Color(102, 255, 204));
		panel_3_3.setBounds(0, 0, 341, 442);
		marksSheetTab.add(panel_3_3);
		
		JPanel panel_5_1_2 = new JPanel();
		panel_5_1_2.setLayout(null);
		panel_5_1_2.setBorder(new LineBorder(new Color(102, 153, 255), 2, true));
		panel_5_1_2.setBackground(new Color(102, 255, 204));
		panel_5_1_2.setBounds(10, 11, 321, 106);
		panel_3_3.add(panel_5_1_2);
		
		JLabel lblNewLabel_19_2 = new JLabel("Student's ID");
		lblNewLabel_19_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_19_2.setBounds(10, 11, 94, 28);
		panel_5_1_2.add(lblNewLabel_19_2);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_26.setColumns(10);
		textField_26.setBounds(10, 48, 197, 28);
		panel_5_1_2.add(textField_26);
		
		JButton btnNewButton_9_2 = new JButton("Search");
		btnNewButton_9_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9_2.setFocusable(false);
		btnNewButton_9_2.setBackground(new Color(51, 255, 255));
		btnNewButton_9_2.setBounds(217, 48, 94, 30);
		panel_5_1_2.add(btnNewButton_9_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_2.setBackground(new Color(102, 255, 204));
		panel_2.setBounds(10, 354, 321, 77);
		panel_3_3.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_21 = new JLabel("CGPA: 0.0");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setFont(new Font("Times New Roman", Font.BOLD, 32));
		lblNewLabel_21.setBounds(10, 11, 301, 55);
		panel_2.add(lblNewLabel_21);
		
		JPanel panel_4_3 = new JPanel();
		panel_4_3.setLayout(null);
		panel_4_3.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_4_3.setBackground(new Color(102, 255, 204));
		panel_4_3.setBounds(351, 0, 659, 442);
		marksSheetTab.add(panel_4_3);
		
		JPanel panel_8_3 = new JPanel();
		panel_8_3.setLayout(null);
		panel_8_3.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_8_3.setBackground(new Color(102, 255, 204));
		panel_8_3.setBounds(10, 11, 639, 360);
		panel_4_3.add(panel_8_3);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 11, 619, 338);
		panel_8_3.add(scrollPane_3);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Student's ID", "Semester", "Course 1", "Score 1", "Course 2", "Score 2", "Course 3", "Score 3", "Course 4", "Score 4", "Course 5", "Score 5"
			}
		));
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_3.setViewportView(table_3);
		
		JPanel panel_9_3 = new JPanel();
		panel_9_3.setLayout(null);
		panel_9_3.setBorder(new LineBorder(new Color(102, 153, 255), 4, true));
		panel_9_3.setBackground(new Color(102, 255, 204));
		panel_9_3.setBounds(10, 375, 639, 56);
		panel_4_3.add(panel_9_3);
		
		JButton btnNewButton_3_3 = new JButton("Print");
		btnNewButton_3_3.setOpaque(true);
		btnNewButton_3_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_3_3.setFocusable(false);
		btnNewButton_3_3.setBackground(new Color(51, 255, 255));
		btnNewButton_3_3.setBounds(10, 11, 95, 30);
		panel_9_3.add(btnNewButton_3_3);
		
		JButton btnNewButton_4_3 = new JButton("Clear");
		btnNewButton_4_3.setOpaque(true);
		btnNewButton_4_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4_3.setFocusable(false);
		btnNewButton_4_3.setBackground(new Color(51, 255, 255));
		btnNewButton_4_3.setBounds(115, 11, 95, 30);
		panel_9_3.add(btnNewButton_4_3);
		
		marksLogoutButton= new JButton("Logout");
		marksLogoutButton.addActionListener(this);
		marksLogoutButton.setOpaque(true);
		marksLogoutButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		marksLogoutButton.setFocusable(false);
		marksLogoutButton.setBackground(new Color(51, 255, 255));
		marksLogoutButton.setBounds(220, 11, 95, 30);
		panel_9_3.add(marksLogoutButton);
		this.setVisible(true);
		
		init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==studentLogoutButton || e.getSource()==courseLogoutButton ||
				e.getSource()==scoreLogoutButton || e.getSource()==marksLogoutButton) {
			int response = JOptionPane.showConfirmDialog(this, "Do you want to logout now?", "Select", JOptionPane.YES_NO_OPTION);
			if(response == 0) {
				this.dispose();
			}
		}
		
	}
	
	public void init() {
		tableViewStudent();
	}
	
	private void tableViewStudent() {
		model = (DefaultTableModel) table.getModel();
		table.setRowHeight(30);
		table.setShowGrid(true);
		table.setGridColor(Color.black);
		table.setBackground(Color.white);
	}
	
}
