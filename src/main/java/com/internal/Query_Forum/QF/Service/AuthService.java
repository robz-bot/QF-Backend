/**
 * 
 */
package com.internal.Query_Forum.QF.Service;

import com.internal.Query_Forum.QF.Dto.LoginRequest;
import com.internal.Query_Forum.QF.Dto.RegisterRequest;
import com.internal.Query_Forum.QF.Dto.UserRequest;

/**
 * @author ROBIN RAJESH
 *
 */
public interface AuthService {

	RegisterRequest signup(RegisterRequest registerRequest);

	LoginRequest login(LoginRequest loginRequest);

	UserRequest profile(UserRequest userRequest);

	
}
