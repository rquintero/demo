package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@TestInstance(Lifecycle.PER_CLASS)
class IDateServiceTest {

	@Mock
	private BackDateServiceImpl bDtSvc;

	@InjectMocks
	private DateServiceImpl dtSrv;

	@BeforeAll
	public void initMocks() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testDateText() {
		String name = "Andrea Carolina";
		Mockito.when(bDtSvc.dateText(name)).thenReturn("NADA");
		assertEquals("NADA", dtSrv.dateText(name));
	}
}