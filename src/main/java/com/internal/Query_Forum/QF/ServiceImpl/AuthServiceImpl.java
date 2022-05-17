/**
 * 
 */
package com.internal.Query_Forum.QF.ServiceImpl;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.internal.Query_Forum.QF.SequenceGenerator;
import com.internal.Query_Forum.QF.Dto.LoginRequest;
import com.internal.Query_Forum.QF.Dto.RegisterRequest;
import com.internal.Query_Forum.QF.Dto.UserRequest;
import com.internal.Query_Forum.QF.Entity.User;
import com.internal.Query_Forum.QF.Repository.UserRepository;
import com.internal.Query_Forum.QF.Service.AuthService;

/**
 * @author ROBIN RAJESH
 *
 */
@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private SequenceGenerator sequenceGenerator;

	@Override
	public RegisterRequest signup(RegisterRequest registerRequest) {
		RegisterRequest resultDto = new RegisterRequest();
		User findUser = userRepository.findByEmail(registerRequest.getEmail());
		if (findUser != null) {
			if (registerRequest.getEmail().equalsIgnoreCase(findUser.getEmail())) {
				resultDto.setMessage("Email Already Exits");
				resultDto.setSuccess(false);
				return resultDto;
			}
		}
		User user = new User();
		user.setId(sequenceGenerator.generateSequence("user"));
		user.setUserName(registerRequest.getUserName());
		user.setEmail(registerRequest.getEmail());
		user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
		user.setActive(true);
		user.setCreatedOn(Instant.now());
		user.setUpdatedOn(Instant.now());

		userRepository.save(user);
		resultDto.setMessage("Registered Successfully");
		resultDto.setSuccess(true);
		return resultDto;

	}

	@Override
	public LoginRequest login(LoginRequest loginRequest) {
		User findUser = userRepository.findByEmail(loginRequest.getEmail());
		LoginRequest resultDto = new LoginRequest();
		if (findUser != null) {
			if (findUser.isActive()) {
				if (findUser.getEmail().equalsIgnoreCase(loginRequest.getEmail())) {
					if (passwordEncoder.matches(loginRequest.getPassword(), findUser.getPassword())) {
						resultDto.setUserId(findUser.getId());
						resultDto.setUserName(findUser.getUserName());
						resultDto.setMessage("Login Success");
						resultDto.setSuccess(true);
					} else {
						resultDto.setMessage("Password incorrect");
						resultDto.setSuccess(false);
					}
				} else {
					
					resultDto.setMessage("Email incorrect");
					resultDto.setSuccess(false);
				}
			} else {
				resultDto.setMessage("Inactive Account");
				resultDto.setSuccess(false);
			}
		}else {
			resultDto.setMessage("You have not register yet or Contact Adminstator");
			resultDto.setSuccess(false);
		}

		return resultDto;
	}

	@Override
	public UserRequest profile(UserRequest userRequest) {
		
		UserRequest resultDto = new UserRequest();
		
		User userById = userRepository.findById(userRequest.getId()).orElse(null);
		if(userById!=null) {
			userById.setSkills(userRequest.getSkills());
			userById.setPhoneNumber(userRequest.getPhoneNumber());
			userById.setLocation(userRequest.getLocation());
			userById.setLinkedIn(userRequest.getLinkedIn());
			userById.setGithub(userRequest.getGithub());
			userById.setGender(userRequest.getGender());
			userById.setDesignation(userRequest.getDesignation());
			userById.setOrganization(userRequest.getOrganization());
			userById.setUpdatedOn(Instant.now());
			
			userRepository.save(userById);
		}
		
		resultDto.setMessage("Profile Updated Successfully");
		resultDto.setSuccess(true);
		
		return resultDto;
	}

	@Override
	public UserRequest getuserProfile(Long id) {
		
		UserRequest resultDto =new UserRequest();
		
		User user = userRepository.findById(id).orElse(null);
		if(user!=null) {
			resultDto.setDesignation(user.getDesignation());
			resultDto.setEmail(user.getEmail());
			resultDto.setGender(user.getGender());
			resultDto.setGithub(user.getGithub());
			resultDto.setLinkedIn(user.getLinkedIn());
			resultDto.setLocation(user.getLocation());
			resultDto.setMessage("User Fetched Successfully");
			resultDto.setOrganization(user.getOrganization());
			resultDto.setPhoneNumber(user.getPhoneNumber());
			resultDto.setSkills(user.getSkills());
			resultDto.setSuccess(true);
			resultDto.setUpdatedOn(user.getUpdatedOn());
			resultDto.setUserName(user.getUserName());
			
			userRepository.save(user);
		}
		
		
		return resultDto;
	}

}
