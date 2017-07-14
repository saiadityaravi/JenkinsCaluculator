package com.sa.test;

import java.math.BigDecimal;
import java.util.Date;

import com.sa.dtoTest.CostCaluculator;
import com.sa.dtoTest.CostDTO;
import com.sa.dtoTest.caluculator;

import junit.framework.TestCase;


public class test extends TestCase {

	
	
	public void testAdd(){
		CostDTO cD=null;
		cD = new CostDTO("gold",40,new Date());
		CostCaluculator c = new caluculator();
		c.add(cD, new CostDTO("Gold",45,new Date()));
		assertEquals(85, cD.costAmount);
	}
	
	public void testSub(){
		CostDTO cD=null;
		cD = new CostDTO("gold",45,new Date());
		CostCaluculator c = new caluculator();
		c.subtract(cD, new CostDTO("Gold",40,new Date()));
		assertEquals(5, cD.costAmount);
	}
	
}
