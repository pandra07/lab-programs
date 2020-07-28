package com.capg.demo.spring_xml_lab1;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeBU;
	private int employeeAge;
	
	public Employee() {
		super();
		System.out.println("bean class created");
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeBU() {
		return employeeBU;
	}
	public void setEmployeeBU(String employeeBU) {
		this.employeeBU = employeeBU;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeBU=" + employeeBU + ", employeeAge=" + employeeAge + "]";
	}
	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeBU, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeBU = employeeBU;
		this.employeeAge = employeeAge;
	}
	public void displayDetails()
	{
		System.out.println("Employee ID:"+employeeId+"\nEmployee Name:"+employeeName+"\nEmployee Salary:"
				+employeeSalary+"\nEmployee BU:"+employeeBU+"\nEmployee Age:"+employeeAge);
	}
	

}
