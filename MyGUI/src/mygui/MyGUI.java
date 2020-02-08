package mygui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JList;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.ListSelectionModel;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;

public class MyGUI extends JFrame {
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JTextField tf4;
	private JTextField tf5;
	private JTextField tf6;
	private JTextField tf7;
	private JTextField tf8;
	String txt1;
	String txt2;
	String txt3;
	String txt4;
	String txt5;
	String txt6;
	String txt7;
	String txt8;
	double val1;
	double val2;
	double val3;
	double val4;
	double val5;
	double val6;
	double val7;
	double val8;
	String[] list_data_1 = {"One", "Two", "Three", "Four"};
	String[] list_data_2 = {"Rome", "Paris", "London", "Madrid", "Berlin", "Moscow"};
	String[] list_data_3 = {"1", "2", "3", "4"};
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyGUI frame = new MyGUI();
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
	public MyGUI() {
		
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel tab1 = new JPanel();
		tabbedPane.addTab("New tab", null, tab1, null);
		
		JPanel tab2 = new JPanel();
		
        tabbedPane.addTab("Tab1", tab1);
        tabbedPane.addTab("Tab2", tab2);
        tab2.setLayout(new BoxLayout(tab2, BoxLayout.Y_AXIS));
        
        JPanel panel = new JPanel();
        tab2.add(panel);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
        panel.add(chckbxNewCheckBox_1);
        
        JPanel panel_1 = new JPanel();
        tab2.add(panel_1);
        
        JLabel lblNewLabel = new JLabel("New label");
        panel_1.add(lblNewLabel);
        
        textField = new JTextField();
        panel_1.add(textField);
        textField.setColumns(10);
        
        JPanel panel_2 = new JPanel();
        tab2.add(panel_2);
        
        JButton btnNewButton = new JButton("New button");
        panel_2.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("New button");
        panel_2.add(btnNewButton_1);
 
        this.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		tab1.setLayout(new BorderLayout(0, 0));
        	
		JPanel northpanel = new JPanel();
		tab1.add(northpanel, BorderLayout.NORTH);
		northpanel.setPreferredSize(new Dimension(10, 100));
		northpanel.setLayout(new GridLayout(0, 5, 0, 0));
		
		JLabel label1 = new JLabel("Label1");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label1);
		
		tf1 = new JTextField();
		tf1.setText("text1");
		northpanel.add(tf1);
		tf1.setColumns(10);
		
		JLabel label5 = new JLabel("Label5");
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label5);
		
		tf2 = new JTextField();
		tf2.setText("text5");
		northpanel.add(tf2);
		tf2.setColumns(10);
		
		final JLabel result1 = new JLabel("New label");
		result1.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(result1);
		
		JLabel label2 = new JLabel("Label2");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label2);
		
		tf3 = new JTextField();
		tf3.setText("text2");
		northpanel.add(tf3);
		tf3.setColumns(10);
		
		JLabel label6 = new JLabel("Label6");
		label6.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label6);
		
		tf4 = new JTextField();
		tf4.setText("text6");
		northpanel.add(tf4);
		tf4.setColumns(10);
		
		JButton button1 = new JButton("sum");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txt1 = tf1.getText();
				txt2 = tf3.getText();
				txt3 = tf5.getText();
				txt4 = tf7.getText();
				txt5 = tf2.getText();
				txt6 = tf4.getText();
				txt7 = tf6.getText();
				txt8 = tf8.getText();
				val1 = Double.parseDouble(txt1);
				val2 = Double.parseDouble(txt2);
				val3 = Double.parseDouble(txt3);
				val4 = Double.parseDouble(txt4);
				val5 = Double.parseDouble(txt5);
				val6 = Double.parseDouble(txt6);
				val7 = Double.parseDouble(txt7);
				val8 = Double.parseDouble(txt8);
				double sum = (val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8);
				result1.setText(Double.toString(sum));
			}
		});
		northpanel.add(button1);
		
		JLabel label3 = new JLabel("Label3");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label3);
		
		tf5 = new JTextField();
		tf5.setText("text3");
		tf5.setColumns(10);
		northpanel.add(tf5);
		
		JLabel label7 = new JLabel("Label7");
		label7.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label7);
		
		tf6 = new JTextField();
		tf6.setText("text7");
		tf6.setColumns(10);
		northpanel.add(tf6);
		
		final JLabel result2 = new JLabel("New label");
		result2.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(result2);
		
		JLabel label4 = new JLabel("Label4");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label4);
		
		tf7 = new JTextField();
		tf7.setText("text4");
		tf7.setColumns(10);
		northpanel.add(tf7);
		
		JLabel label8 = new JLabel("Label8");
		label8.setHorizontalAlignment(SwingConstants.CENTER);
		northpanel.add(label8);
		
		tf8 = new JTextField();
		tf8.setText("text8");
		tf8.setColumns(10);
		northpanel.add(tf8);
		
		JButton button2 = new JButton("average");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt1 = tf1.getText();
				txt2 = tf3.getText();
				txt3 = tf5.getText();
				txt4 = tf7.getText();
				txt5 = tf2.getText();
				txt6 = tf4.getText();
				txt7 = tf6.getText();
				txt8 = tf8.getText();
				val1 = Double.parseDouble(txt1);
				val2 = Double.parseDouble(txt2);
				val3 = Double.parseDouble(txt3);
				val4 = Double.parseDouble(txt4);
				val5 = Double.parseDouble(txt5);
				val6 = Double.parseDouble(txt6);
				val7 = Double.parseDouble(txt7);
				val8 = Double.parseDouble(txt8);
				double avg = (val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8) / 8;
				result2.setText(Double.toString(avg));
			}
		});
		northpanel.add(button2);
		
		JPanel westpanel = new JPanel();
		tab1.add(westpanel, BorderLayout.WEST);
		westpanel.setPreferredSize(new Dimension(120, 10));
		
				
		JList list2 = new JList(list_data_2);
		list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		westpanel.setLayout(new GridLayout(3, 2, 0, 0));

		JLabel listlabel2 = new JLabel("New label");
		westpanel.add(listlabel2);
		westpanel.add(list2);

		JLabel listlabel3 = new JLabel("New label");
		westpanel.add(listlabel3);

		JList list3 = new JList(list_data_3);
		westpanel.add(list3);

		JCheckBox checkbox1 = new JCheckBox("New check box");
		westpanel.add(checkbox1);

		JButton button3 = new JButton("New button");
		westpanel.add(button3);

		JPanel southpanel = new JPanel();
		tab1.add(southpanel, BorderLayout.SOUTH);
		southpanel.setPreferredSize(new Dimension(10, 50));
		southpanel.setLayout(new GridLayout(1, 4, 0, 0));

		JButton button4 = new JButton("New button");
		southpanel.add(button4);

		JButton button5 = new JButton("New button");
		southpanel.add(button5);

		JButton button6 = new JButton("New button");
		southpanel.add(button6);

		JButton button7 = new JButton("New button");
		southpanel.add(button7);

		JPanel centerpanel = new JPanel();
		tab1.add(centerpanel, BorderLayout.CENTER);

		JCheckBox checkbox2 = new JCheckBox("New check box");
		centerpanel.add(checkbox2);

		JCheckBox checkbox3 = new JCheckBox("New check box");
		centerpanel.add(checkbox3);
		
		setTitle("My GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 744);
	}

}
