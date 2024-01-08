package view;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import module.QLSVModel;
import module.SinhVien;
import module.Tinh;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.Action;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import controller.QLSVController;

import javax.swing.JRadioButton;
import java.awt.Color;

public class QLSVView extends JFrame {

	private JPanel contentPane;
	public QLSVModel model;
	public JTextField textField_MaSV_TimKiem;
	public JTable table;
	public JTextField textField_idSV;
	public JTextField textField_HoVaTen;
	public JTextField textField_NgaySinh;
	public JTextField textField_Mon1;
	public JTextField textField_Mon2;
	public JTextField textField_Mon3;
	public ButtonGroup btn_gioiTinh;
	public JComboBox comboBox_QueQuan;
	public JRadioButton radioBTN_nu;
	public JRadioButton radioBTN_nam;
	public JComboBox comboBox_QueQuan_timKiem;
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
		
		Action action = new QLSVController(this);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuOpen.addActionListener(action);
		menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuOpen);
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuSave.addActionListener(action);
		menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuSave);
		
		JSeparator separator = new JSeparator();
		menuFile.add(separator);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(action);
		menuExit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About");
//		them su kien khi nhan vao btn
		menuAbout.addActionListener(action);
		menuAbout.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(menuAbout);
		
		JMenuItem menuAboutMe = new JMenuItem("About me");
		menuAboutMe.addActionListener(action);
		menuAboutMe.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuAbout.add(menuAboutMe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_QueQuan_TimKiem = new JLabel("Quê quán");
		label_QueQuan_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_QueQuan_TimKiem.setBounds(34, 11, 95, 42);
		contentPane.add(label_QueQuan_TimKiem);
		
		JLabel label_MaSV = new JLabel("Mã sinh viên");
		label_MaSV.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_MaSV.setBounds(318, 11, 108, 42);
		contentPane.add(label_MaSV);
		
		textField_MaSV_TimKiem = new JTextField();
		textField_MaSV_TimKiem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_MaSV_TimKiem.setColumns(10);
		textField_MaSV_TimKiem.setBounds(436, 18, 108, 28);
		contentPane.add(textField_MaSV_TimKiem);
		
		JButton btn_Tim = new JButton("Tìm");
		btn_Tim.addActionListener(action);
		btn_Tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Tim.setBounds(565, 17, 69, 31);
		contentPane.add(btn_Tim);
		
		comboBox_QueQuan_timKiem = new JComboBox();
		comboBox_QueQuan_timKiem.setBounds(129, 21, 154, 28);
		contentPane.add(comboBox_QueQuan_timKiem);
		
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
			},
			new String[] {
				"M\u00E3 sinh vi\u00EAn", "H\u1ECD t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "\u0110i\u1EC3m 1", "\u0110i\u1EC3m 2", "\u0110i\u1EC3m 3"
			}
		));
		
		table.setRowHeight(25);
		
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
		ArrayList<Tinh> listTinh = Tinh.getDSTinh();
		comboBox_QueQuan_timKiem.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan_timKiem.addItem(tinh.getTenTinh());
		}
		
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
		
		comboBox_QueQuan = new JComboBox();
		comboBox_QueQuan.addItem("");
		for (Tinh tinh : listTinh) {
			comboBox_QueQuan.addItem(tinh.getTenTinh());
		}
		
		comboBox_QueQuan.setBounds(129, 452, 164, 28);
		contentPane.add(comboBox_QueQuan);
		
		JLabel label_GioiTinh = new JLabel("Giới tính");
		label_GioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_GioiTinh.setBounds(350, 373, 75, 28);
		contentPane.add(label_GioiTinh);
		
		radioBTN_nam = new JRadioButton("Nam");
		radioBTN_nam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioBTN_nam.setBounds(429, 373, 61, 28);
		contentPane.add(radioBTN_nam);
		
		radioBTN_nu = new JRadioButton("Nữ");
		radioBTN_nu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioBTN_nu.setBounds(496, 373, 61, 28);
		contentPane.add(radioBTN_nu);
		
		btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(radioBTN_nam);
		btn_gioiTinh.add(radioBTN_nu);
		
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
		
		textField_Mon3 = new JTextField();
		textField_Mon3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_Mon3.setColumns(10);
		textField_Mon3.setBounds(469, 493, 164, 28);
		contentPane.add(textField_Mon3);
		
		JButton btn_Them = new JButton("Thêm");
		btn_Them.addActionListener(action);
		btn_Them.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Them.setBounds(34, 543, 95, 42);
		contentPane.add(btn_Them);
		
		JButton btn_Xoa = new JButton("Xóa");
		btn_Xoa.addActionListener(action);
		btn_Xoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Xoa.setBounds(170, 543, 95, 42);
		contentPane.add(btn_Xoa);
		
		JButton btn_CapNhat = new JButton("Cập nhật");
		btn_CapNhat.addActionListener(action);
		btn_CapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_CapNhat.setBounds(318, 543, 124, 42);
		contentPane.add(btn_CapNhat);
		
		JButton btn_Luu = new JButton("Lưu");
		btn_Luu.addActionListener(action);
		btn_Luu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Luu.setBounds(490, 543, 95, 42);
		contentPane.add(btn_Luu);
		
		JButton btn_HuyBo = new JButton("Hủy bỏ");
		btn_HuyBo.addActionListener(action);
		btn_HuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_HuyBo.setBounds(625, 543, 95, 42);
		contentPane.add(btn_HuyBo);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setForeground(new Color(0, 0, 0));
		separator_1_2.setBounds(10, 530, 746, 2);
		contentPane.add(separator_1_2);
		
		JButton btn_HuyTim = new JButton("Hủy tìm");
		btn_HuyTim.addActionListener(action);
		btn_HuyTim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_HuyTim.setBounds(644, 17, 95, 31);
		contentPane.add(btn_HuyTim);
		
		this.setVisible(true);
	}

	public void xoaFrom() {
		textField_idSV.setText("");
		textField_HoVaTen.setText("");
		textField_MaSV_TimKiem.setText("");
		textField_NgaySinh.setText("");
		textField_Mon1.setText("");
		textField_Mon2.setText("");
		textField_Mon3.setText("");
		comboBox_QueQuan.setSelectedIndex(-1);
		btn_gioiTinh.clearSelection();
	}

	public void themSinhVienVaoTable(SinhVien sv) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(
				new Object[]{
						sv.getMaSinhVien()+"", 
						sv.getTenSinhVien(),
						sv.getQueQuan().getTenTinh(),
						sv.getNgaySinh().getDate()+"/"+(sv.getNgaySinh().getMonth()+1)+"/"+(sv.getNgaySinh().getYear()+1900),
						(sv.isGioiTinh()?"Nam":"Nữ"),
						sv.getDiemMon1()+"",
						sv.getDiemMon2()+"",
						sv.getDiemMon3()+""
						});
	}
	
	public void themSinhVienHoacCapNhat(SinhVien sv) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		if (!this.model.kiemTraTonTai(sv)) {
			this.model.insert(sv);
			this.themSinhVienVaoTable(sv);
		} else {
			this.model.update(sv);
			int soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if(id.equals(sv.getMaSinhVien()+"")) {
					model_table.setValueAt(sv.getMaSinhVien()+"",i , 0);
					model_table.setValueAt(sv.getTenSinhVien()+"",i , 1);
					model_table.setValueAt(sv.getQueQuan().getTenTinh()+"",i , 2);
					model_table.setValueAt(sv.getNgaySinh().getDate()+"/"+(sv.getNgaySinh().getMonth()+1)+"/"+(sv.getNgaySinh().getYear()+1900)+"",i , 3);
					model_table.setValueAt((sv.isGioiTinh()?"Nam":"Nữ")+"",i , 4);
					model_table.setValueAt(sv.getDiemMon1()+"",i , 5);
					model_table.setValueAt(sv.getDiemMon2()+"",i , 6);
					model_table.setValueAt(sv.getDiemMon3()+"",i , 7);
				}
			}
		}
	}
	public SinhVien getSinhVienDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		
		int maSinhVien = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		String tenSinhVien = model_table.getValueAt(i_row, 1)+"";
		Tinh tinh = Tinh.getTinhByName(model_table.getValueAt(i_row, 2)+"");
		String s_ngaySinh = model_table.getValueAt(i_row, 3)+"";
		Date ngaySinh = new Date(s_ngaySinh);
		String textGioiTinh = model_table.getValueAt(i_row, 4)+"";
		boolean gioiTinh = textGioiTinh.equals("Nam");
		
		float diemMon1 = Float.valueOf(model_table.getValueAt(i_row, 5)+"");
		float diemMon2 = Float.valueOf(model_table.getValueAt(i_row, 6)+"");
		float diemMon3 = Float.valueOf(model_table.getValueAt(i_row, 7)+"");
		
		SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		return sv;
	}
	public void hienThiTTSV() {
		SinhVien sv = getSinhVienDangChon();
		this.textField_idSV.setText(sv.getMaSinhVien()+"");
		this.textField_HoVaTen.setText(sv.getTenSinhVien()+"");
		this.comboBox_QueQuan.setSelectedItem(sv.getQueQuan().getTenTinh());
		String s_ngaySinh = sv.getNgaySinh().getDate()+"/"+(sv.getNgaySinh().getMonth()+1)+"/"+(sv.getNgaySinh().getYear()+1900);
		this.textField_NgaySinh.setText(s_ngaySinh+"");
		if(sv.isGioiTinh()) {
			radioBTN_nam.setSelected(true);
		} else {
			radioBTN_nu.setSelected(true);
		}
//		this.btn_gioiTinh.setSelected(null, gioiTinh);
		this.textField_Mon1.setText(sv.getDiemMon1()+"");
		this.textField_Mon2.setText(sv.getDiemMon2()+"");
		this.textField_Mon3.setText(sv.getDiemMon3()+"");
	}

//	public void thucHienXoa() {
//		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
//		int i_row = table.getSelectedRow();
//		int luaChon = JOptionPane.showConfirmDialog(
//				this, 
//				"Bạn có chắc chắn xóa dòng đã chọn?", 
//				"Xóa sinh viên", 
//				JOptionPane.YES_NO_OPTION);
//		if(luaChon == JOptionPane.YES_OPTION) {
//			SinhVien sv = getSinhVienDangChon();
//			this.model.delete(sv);
//			model_table.removeRow(i_row);
//		}
//	}
	public void thucHienXoa() {
	    DefaultTableModel model_table = (DefaultTableModel) table.getModel();
	    int i_row = table.getSelectedRow();

	    int luaChon = JOptionPane.showConfirmDialog(
	            this,
	            "Bạn có chắc chắn xóa dòng đã chọn?",
	            "Xóa sinh viên",
	            JOptionPane.YES_NO_OPTION);

	    if (luaChon == JOptionPane.YES_OPTION) {
	        SinhVien sv = getSinhVienDangChon();
	        
	        // Xóa sinh viên khỏi danh sách
	        this.model.delete(sv);
	        
	        // Cập nhật dữ liệu trong file sau khi xóa
	        capNhatDuLieuFile();
	        
	        // Xóa dòng trong bảng
	        model_table.removeRow(i_row);
	    }
	}
	
	// Phương thức cập nhật dữ liệu trong file
	private void capNhatDuLieuFile() {
	    if (this.model.getTenFile().length() > 0) {
	        saveFile(this.model.getTenFile());
	    } else {
	        JFileChooser fc = new JFileChooser();
	        int returnVal = fc.showSaveDialog(this);
	        if (returnVal == JFileChooser.APPROVE_OPTION) {
	            File file = fc.getSelectedFile();
	            saveFile(file.getAbsolutePath());
	        }
	    }
	}

	public void thucHienThemSinhVien() {
//		get du lieu
		int maSinhVien = Integer.valueOf(this.textField_idSV.getText());
		String tenSinhVien = this.textField_HoVaTen.getText();
		int queQuan = this.comboBox_QueQuan.getSelectedIndex()-1;
		Tinh tinh = Tinh.getTinhById(queQuan);
		Date ngaySinh = new Date(this.textField_NgaySinh.getText());
		Boolean gioiTinh = true;
		if (this.radioBTN_nam.isSelected()) {
			gioiTinh = true;
		}
		else if (this.radioBTN_nu.isSelected()) {
			gioiTinh = false;
		}
		float diemMon1 = Float.valueOf(this.textField_Mon1.getText());
		float diemMon2 = Float.valueOf(this.textField_Mon2.getText());
		float diemMon3 = Float.valueOf(this.textField_Mon3.getText());
		
//		tao bang sinh vien moi
		SinhVien sv = new SinhVien(maSinhVien, tenSinhVien, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
		
		this.themSinhVienHoacCapNhat(sv);
		
	}

	public void thucHienTim() {
		
//		goi ham huy tim kiem truoc
		this.thucHienTaiLaiDuLieu();
//		Thuc hien tim kiem theo tinh
		int queQuan = this.comboBox_QueQuan_timKiem.getSelectedIndex()-1;
		String maSinhVienTimKiem = this.textField_MaSV_TimKiem.getText();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		
		int soLuongDong = model_table.getRowCount();
		Set<Integer> idSinhVienCanXoa = new TreeSet<Integer>();
		if (queQuan >= 0) {
			Tinh tinhDaChon = Tinh.getTinhById(queQuan);
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				String tenTinh = model_table.getValueAt(i, 2)+"";
				if(!tenTinh.equals(tinhDaChon.getTenTinh())) {
					idSinhVienCanXoa.add(Integer.valueOf(id));
				}
			}
		}
//		thuc hien tim kiem theo ma sinh vien
		if (maSinhVienTimKiem.length() > 0) {
			for (int i = 0; i < soLuongDong; i++) {
				String id = model_table.getValueAt(i, 0)+"";
				if(!id.equals(maSinhVienTimKiem)) {
					idSinhVienCanXoa.add(Integer.valueOf(id));
				}
			}
		}
		for (Integer idCanXoa : idSinhVienCanXoa) {
			soLuongDong = model_table.getRowCount();
			for (int i = 0; i < soLuongDong; i++) {
				String idTrongTable = model_table.getValueAt(i, 0)+"";
				if(idTrongTable.equals(idCanXoa.toString())) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
	public void thucHienTaiLaiDuLieu() {
		while(true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if (soLuongDong == 0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		for (SinhVien sv : this.model.getDsSinhVien()) {
			this.themSinhVienVaoTable(sv);
		}
	}

	public void hienThiAbout() {
//		show message
		JOptionPane.showMessageDialog(this, "Phần mềm quản lý sinh viên 1.0!");
	}

	public void thoatKhoiChuongTrinh() {
		int luaChon = JOptionPane.showConfirmDialog(
				this, 
				"Thoát khỏi chương trình?",//nội dung confirm
				"Exit",//tiêu đề của confirm
				JOptionPane.YES_NO_OPTION);
		if(luaChon == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}

	public void saveFile(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (SinhVien sv : this.model.getDsSinhVien()) {
				oos.writeObject(sv);
			}
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void thucHienSaveFile() {
		if(this.model.getTenFile().length() > 0) {
			saveFile(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				saveFile(file.getAbsolutePath());
			}
		}
	}

	public void openFile(File file) {
		ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			SinhVien sv = null;
			while((sv = (SinhVien)ois.readObject()) != null) {
				ds.add(sv);
			}
			ois.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.model.setDsSinhVien(ds);
	}
	
	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			openFile(file);
			thucHienTaiLaiDuLieu();
		}
	}
}
