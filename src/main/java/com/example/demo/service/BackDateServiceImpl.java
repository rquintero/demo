package com.example.demo.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Service;

import com.example.demo.util.WEEKDAY;

@Service
public class BackDateServiceImpl implements IBackDateService {

	@Override
	public String dateText(String name) {
		Calendar cal = Calendar.getInstance();
		return "Hi " + name + ", Today is " + WEEKDAY.weekDay(cal.get(Calendar.DAY_OF_WEEK))
		    + " "+ new SimpleDateFormat("dd/MM/YYYY, ' TIME ' HH:mm").format(cal.getTime());
	}
}