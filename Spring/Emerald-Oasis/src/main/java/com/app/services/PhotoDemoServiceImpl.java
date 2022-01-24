package com.app.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.daos.PhotoDemoDaoImpl;
import com.app.entities.PhotoDemo;

@Service
@Transactional
public class PhotoDemoServiceImpl {
	
	@Autowired
	private PhotoDemoDaoImpl photoDemo;
	
	public PhotoDemo getPhotoDemo() {
		Optional<PhotoDemo> pd = photoDemo.findById(1);
		
		return pd.orElse(null);
	}

}
