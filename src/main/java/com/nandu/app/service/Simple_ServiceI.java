package com.nandu.app.service;

import java.net.UnknownHostException;

import org.springframework.http.ResponseEntity;

import com.nandu.app.model.InfoModel;

public interface Simple_ServiceI {

	public ResponseEntity<InfoModel> getInfo() throws UnknownHostException;

}
