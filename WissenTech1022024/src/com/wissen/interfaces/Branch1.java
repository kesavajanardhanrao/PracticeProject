package com.wissen.interfaces;

public class Branch1 implements AutomobileInterface,Interface2,Interface3 {

	@Override
	public void permanentEmployees() {
	System.out.println("Brach 1 PE salary 30k");	
	}

	@Override
	public void temporaryEmployees() {
		System.out.println("Brach 1 TE salary 20k");
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
		System.out.println(interior);
		System.out.println(empCount);
		for (String dept : departments) {
			System.out.println(dept);
		}
		
		
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

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	public void m3() {
		
	}
	
	public static void main(String[] args) {
		Interface2 i2= new Branch1();
		
		Branch1 b1= new Branch1();
		String[] strArray= {"Cleaning", "sales", "ADmin"};
		b1.infrastructure("Ceiling",20, strArray);
		
	}

}
