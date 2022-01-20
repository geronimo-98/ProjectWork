package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.UserDaoImpl;
import com.app.dtos.Credentials;
import com.app.dtos.DTOEntityConverter;
import com.app.dtos.UserDTO;
import com.app.entities.Role;
import com.app.entities.User;

@Service
@Transactional
public class UserServiceImpl {
	
	@Autowired
	private UserDaoImpl userDao;
	@Autowired
	private DTOEntityConverter converter;

	public UserDTO saveUser(UserDTO userDto) {
		User user = converter.toUserEntity(userDto);
		user = userDao.save(user);
		userDto = converter.toUserDTO(user);
		userDto.setPassword("*******");
		return userDto;
	}
	
	public UserDTO findUserByEmailAndPassword(Credentials cred) {
		User dbUser = userDao.findByEmail(cred.getEmail());
		if(dbUser != null && (dbUser.getPassword()).equals(cred.getPassword())) {
			UserDTO result = converter.toUserDTO(dbUser);
			result.setPassword("*******");
			return result;
		}
		return null;
	}
}