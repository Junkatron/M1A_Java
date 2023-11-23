package lab18;

import java.util.ArrayList;

public class Manager extends Employee {
	public Manager(String name, String jobTitle) {
		super(name, jobTitle);
		// TODO Auto-generated constructor stub
	}

	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	
	public String getinfo() {
		String info = super.getInfo();
		for (Employee emp : employees) {
			info += emp.getInfo();
		}
		
		return info;
	}
}
