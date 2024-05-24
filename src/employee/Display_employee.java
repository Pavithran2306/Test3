package employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display_employee {

	public static void main(String[] args) 
	
	{
	
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		Employee_details emp_edu = context.getBean("emp1", Employee_details.class);
		emp_edu.display();
		
	}

}
