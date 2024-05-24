package employee_tech;

import employee_tech.Employee_tech;

public class Employee 
{

	private int empid;
	private String empname;
	private String empaddress;
	private String empphone;
	private Employee_tech emptech;
	
	
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}



	public void setEmpphone(String empphone) {
		this.empphone = empphone;
	}



	public void setEmptech(Employee_tech emptech) {
		this.emptech = emptech;
	}



	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empaddress);
		System.out.println(empphone);
		emptech.displaytech();
	}

	

	
}
