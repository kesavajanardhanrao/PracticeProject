package com.wissen.interfaces;

public class Branch2 implements AutomobileInterface {

	@Override
	public void permanentEmployees() {
		System.out.println("Brach 2 PE salary 40k");		
	}

	@Override
	public void temporaryEmployees() {
		System.out.println("Brach 2 PE salary 35k");		
	}
	
	
	
	public static void main(String[] args) {
		Branch1 b1= new Branch1();
		AutomobileInterface a1= new Branch1();
		b1.permanentEmployees();
		b1.temporaryEmployees();
		
		Branch2 b2= new Branch2();
		AutomobileInterface a2= new Branch2();
		b2.permanentEmployees();
		b2.temporaryEmployees();
		System.out.println(AutomobileInterface.name);
		
		
		
		
		
		
		
	}

	@Override
	public void employeeQualification() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void infrastructure(String interior, int empCount, String[] departments, String festOffers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void infrastructure(String interior, int empCount, String[] departments) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVehicleDetails(int chaseNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVehicleDetails(String vehicleNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getVehicleLife(String vehicleNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

}
