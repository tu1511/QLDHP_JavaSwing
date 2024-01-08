package controller;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.Date;

import javax.swing.Action;
import javax.swing.JOptionPane;

import module.SinhVien;
import module.Tinh;
import view.QLSVView;

public class QLSVController implements Action{
	
	public QLSVView view;
	 
	public QLSVController(QLSVView view) {
		this.view = view;
	}

	@Override //xu ly su kien
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
//		JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào: "+cm); // thong bao khi chon btn
		if (cm.equals("Thêm")) {
			this.view.xoaFrom();
			this.view.model.setLuaChon("Thêm");
		}
		else if (cm.equals("Lưu")) {

			try {
				this.view.thucHienThemSinhVien();
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
		}else if (cm.equals("Cập nhật")) {
			this.view.hienThiTTSV();
		}else if (cm.equals("Xóa")) {
			this.view.thucHienXoa();
		}else if (cm.equals("Hủy bỏ")) {
			this.view.xoaFrom();
		}else if (cm.equals("Tìm")) {
			this.view.thucHienTim();
		}else if (cm.equals("Hủy tìm")) {
			this.view.thucHienTaiLaiDuLieu();
		}else if (cm.equals("About me")) {
			this.view.hienThiAbout();
		}else if (cm.equals("Exit")) {
			this.view.thoatKhoiChuongTrinh();
		}else if (cm.equals("Save")) {
			this.view.thucHienSaveFile();
		}else if (cm.equals("Open")) {
			this.view.thucHienOpenFile();
		}
	}

	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void putValue(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEnabled(boolean b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		
	}

}

