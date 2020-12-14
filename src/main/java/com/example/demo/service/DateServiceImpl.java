package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DateServiceImpl implements IDateService {

	@Autowired
	IBackDateService bDtSrv;

	@Override
	public String dateText(String name) {
		return bDtSrv.dateText(name);
	}
}