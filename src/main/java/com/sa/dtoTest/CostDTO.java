package com.sa.dtoTest;

import java.math.BigDecimal;
import java.util.Date;

public class CostDTO {

	public String costid;
	public int costAmount;
	public Date effectiveDate;
	
	public CostDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CostDTO(String costid,int costAmount, Date effectiveDate) {
		this.costid=costid;
		this.costAmount=costAmount;
		this.effectiveDate=effectiveDate;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this)
			return true;
		if(!(obj instanceof CostDTO))
			return false;
		CostDTO c = (CostDTO) obj;
		return c.costid.equalsIgnoreCase(this.costid);
	}
	
	@Override
	public int hashCode() {
		
		int result =17;
		result =31 * result + costid.toLowerCase().hashCode();
		return result;
	}

}
