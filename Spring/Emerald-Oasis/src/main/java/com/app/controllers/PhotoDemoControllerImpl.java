package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.config.Response;
import com.app.entities.PhotoDemo;
import com.app.services.PhotoDemoServiceImpl;

@CrossOrigin(origins = "*")
@RestController
public class PhotoDemoControllerImpl {
	
	@Autowired
	private PhotoDemoServiceImpl photoService;
	
	@GetMapping("/user/photo/getphoto")
	public ResponseEntity<?> getPhoto() {
		PhotoDemo pd = photoService.getPhotoDemo();
		
		return Response.success(pd);
	}

}
