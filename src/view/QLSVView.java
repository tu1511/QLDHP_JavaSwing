package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import module.QLSVModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.Box;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	QLSVModel model;
	private JTextField textField_MaSV;
	private JTable table;
	private JTextField textField_idSV;
	private JTextField textField_HoVaTen;
	private JTextField textField_NgaySinh;
	private JTextField textField_Mon1;
	private JTextField textField_Mon2;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
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
	public QLSVView() {
		this.model = new QLSVModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 664);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuClose.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuClose);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About me");
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan = new JLabel("Quê quán");
		label_QueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_QueQuan.setBounds(34, 11, 95, 42);
		contentPane.add(label_QueQuan);
		
		JLabel label_MaSV = new JLabel("Mã sinh viên");
		label_MaSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_MaSV.setBounds(369, 11, 108, 42);
		contentPane.add(label_MaSV);
		
		textField_MaSV = new JTextField();
		textField_MaSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_MaSV.setColumns(10);
		textField_MaSV.setBounds(487, 18, 164, 28);
		contentPane.add(textField_MaSV);
		
		JButton btn_Tim = new JButton("Tìm");
		btn_Tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Tim.setBounds(676, 17, 69, 31);
		contentPane.add(btn_Tim);
		
		JComboBox comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.setBounds(139, 21, 195, 28);
		contentPane.add(comboBox_QueQuan);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(10, 64, 746, 2);
		contentPane.add(separator_1);
		
		JLabel label_DSSV = new JLabel("Danh sách sinh viên");
		label_DSSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_DSSV.setBounds(34, 77, 164, 42);
		contentPane.add(label_DSSV);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "M\u00E3 sinh vi\u00EAn", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 119, 746, 196);
		contentPane.add(scrollPane);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(new Color(0, 0, 0));
		separator_1_1.setBounds(10, 326, 746, 2);
		contentPane.add(separator_1_1);
		
		JLabel label_TTSV = new JLabel("Thông tin sinh viên");
		label_TTSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_TTSV.setBounds(10, 326, 164, 42);
		contentPane.add(label_TTSV);
		
		textField_idSV = new JTextField();
		textField_idSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_idSV.setColumns(10);
		textField_idSV.setBounds(129, 373, 164, 28);
		contentPane.add(textField_idSV);
		
		JLabel label_idSV = new JLabel("Mã sinh viên");
		label_idSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_idSV.setBounds(10, 371, 108, 28);
		contentPane.add(label_idSV);
		
		JLabel label_HoVaTen = new JLabel("Họ và tên");
		label_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_HoVaTen.setBounds(10, 411, 108, 28);
		contentPane.add(label_HoVaTen);
		
		textField_HoVaTen = new JTextField();
		textField_HoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_HoVaTen.setColumns(10);
		textField_HoVaTen.setBounds(129, 413, 164, 28);
		contentPane.add(textField_HoVaTen);
		
		JLabel label_Que_Quan = new JLabel("Quê quán");
		label_Que_Quan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_Que_Quan.setBounds(10, 450, 108, 28);
		contentPane.add(label_Que_Quan);
		
		textField_NgaySinh = new JTextField();
		textField_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_NgaySinh.setColumns(10);
		textField_NgaySinh.setBounds(129, 493, 164, 28);
		contentPane.add(textField_NgaySinh);
		
		JLabel label_NgaySinh = new JLabel("Ngày sinh");
		label_NgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_NgaySinh.setBounds(10, 491, 108, 28);
		contentPane.add(label_NgaySinh);
		
		JComboBox comboBox_QueQuan_1 = new JComboBox();
		comboBox_QueQuan_1.setBounds(129, 452, 164, 28);
		contentPane.add(comboBox_QueQuan_1);
		
		JLabel label_GioiTinh = new JLabel("Giới tính");
		label_GioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_GioiTinh.setBounds(350, 373, 75, 28);
		contentPane.add(label_GioiTinh);
		
		JRadioButton radioBTN_nam = new JRadioButton("Nam");
		radioBTN_nam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioBTN_nam.setBounds(429, 373, 61, 28);
		contentPane.add(radioBTN_nam);
		
		JRadioButton radioBTN_nu = new JRadioButton("Nữ");
		radioBTN_nu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioBTN_nu.setBounds(496, 373, 61, 28);
		contentPane.add(radioBTN_nu);
		
		JLabel label_Mon1 = new JLabel("Môn 1");
		label_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_Mon1.setBounds(350, 409, 108, 28);
		contentPane.add(label_Mon1);
		
		textField_Mon1 = new JTextField();
		textField_Mon1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon1.setColumns(10);
		textField_Mon1.setBounds(469, 411, 164, 28);
		contentPane.add(textField_Mon1);
		
		JLabel label_Mon2 = new JLabel("Môn 2");
		label_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_Mon2.setBounds(350, 450, 108, 28);
		contentPane.add(label_Mon2);
		
		textField_Mon2 = new JTextField();
		textField_Mon2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon2.setColumns(10);
		textField_Mon2.setBounds(469, 452, 164, 28);
		contentPane.add(textField_Mon2);
		
		JLabel label_Mon3 = new JLabel("Môn 3");
		label_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_Mon3.setBounds(350, 491, 108, 28);
		contentPane.add(label_Mon3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(469, 493, 164, 28);
		contentPane.add(textField_2);
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Them.setBounds(34, 543, 95, 42);
		contentPane.add(btn_Them);
		
		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Xoa.setBounds(170, 543, 95, 42);
		contentPane.add(btn_Xoa);
		
		JButton btn_CapNhat = new JButton("Cập nhật");
		btn_CapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_CapNhat.setBounds(318, 543, 124, 42);
		contentPane.add(btn_CapNhat);
		
		JButton btn_Luu = new JButton("Lưu");
		btn_Luu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Luu.setBounds(490, 543, 95, 42);
		contentPane.add(btn_Luu);
		
		JButton btn_HuyBo = new JButton("Hủy bỏ");
		btn_HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_HuyBo.setBounds(625, 543, 95, 42);
		contentPane.add(btn_HuyBo);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(new Color(0, 0, 0));
		separator_1_2.setBounds(10, 530, 746, 2);
		contentPane.add(separator_1_2);
		
		this.setVisible(true);
	}
}
