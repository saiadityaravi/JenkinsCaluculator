package com.sa.dtoTest;

import java.math.BigDecimal;
import java.math.MathContext;

public class caluculator implements CostCaluculator{

	public CostDTO add(CostDTO arg1, CostDTO arg2) {
		BigDecimal bD;
		if(arg1.equals(arg2)){
			MathContext mc = new MathContext(4);
			arg1.costAmount = arg1.costAmount+arg2.costAmount;
			return arg1;
		}else{
			try {
				throw new IdnotMatchException("Not equals");
			} catch (IdnotMatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public CostDTO subtract(CostDTO arg1, CostDTO arg2) {
		BigDecimal bD;
		if(arg1.equals(arg2)){
			MathContext mc = new MathContext(4);
			arg1.costAmount = arg1.costAmount-arg2.costAmount;
			return arg1;
		}else{
			try {
				throw new IdnotMatchException("Not equals");
			} catch (IdnotMatchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}


}
