package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Calendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.IDateService;
import com.example.demo.util.WEEKDAY;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private IDateService dtSrv;

	@Test
	void testDateText() {
		String name = "Andrea Carolina";
		assertTrue(dtSrv.dateText(name).startsWith("Hi " + name + ", Today is " 
			    + WEEKDAY.weekDay(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))));
	}

	@Test
	void contextLoads() {
	}
}