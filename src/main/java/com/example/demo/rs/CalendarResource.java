package com.example.demo.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IDateService;

@RestController
public class CalendarResource {

	@Autowired
	IDateService dtSvc;

	@RequestMapping("/api/v1/date")
	public String date(@RequestParam(name = "name", required=false) String name) {
		return dtSvc.dateText(name);
	}
}