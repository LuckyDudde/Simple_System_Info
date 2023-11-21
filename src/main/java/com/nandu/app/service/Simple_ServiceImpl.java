package com.nandu.app.service;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nandu.app.model.InfoModel;

@Service
public class Simple_ServiceImpl implements Simple_ServiceI{
	
	
	@Autowired
	private InfoModel infoModel;
	

	@Override
	public ResponseEntity<InfoModel> getInfo() throws UnknownHostException {
			
		infoModel.setCountry("UK");
		infoModel.setIpAddress(InetAddress.getLocalHost().getHostAddress());
		infoModel.setHostName(InetAddress.getLocalHost().getHostName());
		infoModel.setCurrentTimestamp(LocalDateTime.now());		
		return new ResponseEntity<InfoModel>(infoModel, HttpStatus.OK);
	}
	

}
