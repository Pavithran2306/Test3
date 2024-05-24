package employee;

public class Employee_details 
{

	private int empid;
	private String empname;
	private String empaddress;
	private int empphone;
	private Employee_education emp_education ;
	
	
	public void setEmp_education(Employee_education emp_education) {
		this.emp_education = emp_education;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
	}



	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	
	

	public void setEmpphone(int empphone) {
		this.empphone = empphone;
	}



	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(empaddress);
		System.out.println(empphone);
		emp_education.display1();
		
		
		
		
	}



	


	
	
}
