package com.nandu.app.controller;

import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nandu.app.model.InfoModel;
import com.nandu.app.service.Simple_ServiceI;

@RestController
@RequestMapping("/")
public class Simple_controller{
	
	public static final Logger log = LoggerFactory.getLogger(Simple_controller.class);
	
	@Autowired
	private Simple_ServiceI simpleService;
	
	
	@GetMapping(value = "systemInfo", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getApiInfo() throws UnknownHostException{
		
		ResponseEntity<InfoModel> model = simpleService.getInfo();
		
		return new ResponseEntity<>(model.getBody(), HttpStatus.OK);
		
	}
	
	
	
}
