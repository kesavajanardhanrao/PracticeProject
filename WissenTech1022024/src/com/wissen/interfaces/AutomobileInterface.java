package com.wissen.interfaces;

public interface AutomobileInterface {
	
	public static  String name="WissenTech";
	
	public void permanentEmployees() ;
	public abstract void temporaryEmployees();
	public void employeeQualification();
	public void infrastructure(String interior, int empCount, String[] departments, String festOffers);
	public void infrastructure(String interior, int empCount, String[] departments);
	public String getVehicleDetails(int chaseNumber);
	public String getVehicleDetails(String vehicleNumber);
	 abstract int getVehicleLife(String vehicleNumber);
	

}
