/**
 * 
 */
package com.internal.Query_Forum.QF.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.internal.Query_Forum.QF.Dto.LoginRequest;
import com.internal.Query_Forum.QF.Dto.RegisterRequest;
import com.internal.Query_Forum.QF.Dto.UserRequest;
import com.internal.Query_Forum.QF.Service.AuthService;

/**
 * @author ROBIN RAJESH
 *
 */
@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
public class AuthController {

	@Autowired
	AuthService authService;

	@PostMapping("/signup")
	public RegisterRequest signup(@RequestBody RegisterRequest registerRequest) {
		RegisterRequest res = authService.signup(registerRequest);
		return res;
	}

	@PostMapping("/login")
	public LoginRequest signup(@RequestBody LoginRequest loginRequest) {
		LoginRequest res = authService.login(loginRequest);
		return res;
	}
	
	@PutMapping("/profile")
	public UserRequest profile(@RequestBody UserRequest userRequest) {
		return authService.profile(userRequest);
	}

}
