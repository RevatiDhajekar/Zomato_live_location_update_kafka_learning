package com.delieveryboy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delieveryboy.service.KafkaService;

@RestController
@RequestMapping("/location")
public class LocationController {
	@Autowired
	private KafkaService kafkaService;
	
	@PostMapping("/update")
	public ResponseEntity<?> updateLocation(){
		this.kafkaService.updateLoaction("( " + Math.round(Math.random() *100) + " , " + Math.round(Math.random() *100)  +" )");
		return ResponseEntity.ok(Map.of("message" , "location Updated"));
	}
}
