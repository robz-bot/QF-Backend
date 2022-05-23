/**
 * 
 */
package com.internal.Query_Forum.QF.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internal.Query_Forum.QF.Dto.UserRequest;
import com.internal.Query_Forum.QF.Dto.WidgetsRequest;
import com.internal.Query_Forum.QF.Service.AdminService;
import com.internal.Query_Forum.QF.Service.AuthService;

/**
 * @author Robin
 *
 */
@RestController
@RequestMapping("/api/admin")
@CrossOrigin("*")
public class AdminController {
	@Autowired
	AdminService adminService;
	
	@GetMapping("/widgets")
	public WidgetsRequest widgetsData() {
		return adminService.widgetsData();
	}
	
	
}
