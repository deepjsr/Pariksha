package com.jsp.service;

import java.util.List;

import com.jsp.dao.AdminDao;
import com.jsp.dto.Admin;

public class AdminService {
	AdminDao dao = new AdminDao();

	 public Admin saveAdmin(Admin Admin) {
			return dao.saveAdmin(Admin);
		}
	 public Admin updateAdmin(Admin Admin) {
		 return dao.updateAdmin(Admin);
	 }
	 public Admin deleteAdmin(int	id) {
		 return dao.deleteAdmin(id);
	 }
	 public Admin getAdminById(int id) {
		 return dao.getAdminById(id);
	 }
	 public List<Admin> getAllAdmin() {
		 return dao.getAllAdmin();
	 }
	 public Admin loginAdmin(String password , String username) {
		 return dao.loginAdmin( password ,  username);
	 }

}
