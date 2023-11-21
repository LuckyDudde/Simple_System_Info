package com.nandu.app.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Data;

@Data
@JsonPOJOBuilder
@Component
public class InfoModel {

	private String hostName;
	private String ipAddress;
	private String country;
	private LocalDateTime currentTimestamp;
}
