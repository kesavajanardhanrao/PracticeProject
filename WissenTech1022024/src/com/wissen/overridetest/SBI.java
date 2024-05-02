package com.wissen.overridetest;

import com.wissen.bank.RBI;

public class SBI extends RBI {
	
	@Override
	public void personalLoan() {
		
		RBI rbi= new RBI();
		rbi.commonLoan();
	}
	
	@Override
	public void houseLoan() {
		System.out.println("SBI house loan r.o.i = 9%");
	}
	
	public static void main(String[] args) {
		SBI sbi= new SBI();
		sbi.houseLoan();
		
	}
	
	
	
	
	

}
