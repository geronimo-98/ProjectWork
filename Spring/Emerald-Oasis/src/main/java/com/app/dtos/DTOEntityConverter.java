package com.app.dtos;

import org.springframework.stereotype.Component;

import com.app.entities.Role;
import com.app.entities.User;

@Component
public class DTOEntityConverter {
	
	public UserDTO toUserDTO(User user) {
		UserDTO dto = new UserDTO();
		
		dto.setUser_id(user.getUser_id());
		dto.setFirst_name(user.getFirst_name());
		dto.setLast_name(user.getLast_name());
		dto.setEmail(user.getEmail());
		dto.setPhone_no(user.getPhone_no());
		dto.setPassword(user.getPassword());
		dto.setRole_id((user.getRole()).getRole_id());
		
		return dto;
	}
	
	public User toUserEntity(UserDTO dto) {
		User user = new User();
		
		user.setUser_id(dto.getUser_id());
		user.setFirst_name(dto.getFirst_name());
		user.setLast_name(dto.getLast_name());
		user.setEmail(dto.getEmail());
		user.setPhone_no(dto.getPhone_no());
		user.setPassword(dto.getPassword());
		user.setRole(new Role(dto.getRole_id()));
		
		return user;
	}

}
