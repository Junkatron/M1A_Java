package lab18;

public class Program2 {

	public static void main(String[] args) {
		// lab 18 part 2

		Manager manager = new Manager("Joe", "Da Boss");
		Employee emp1 = new Employee("John", "Guy 1");
		Employee emp2 = new Employee("Jake", "Guy 2");
		
		manager.addEmployee(emp1);
		manager.addEmployee(emp2);
		
		SkilledWorker sEmp1 = new SkilledWorker("Albert", "Top guy 1"); 
		SkilledWorker sEmp2 = new SkilledWorker("Alison", "Top guy 2");
		sEmp1.addSkill("Skill A");
		sEmp1.addSkill("Skill B");
		sEmp2.addSkill("Skill X");
		sEmp2.addSkill("Skill Y");
		
		manager.addEmployee(sEmp1);
		manager.addEmployee(sEmp2);
		
		String info = manager.getinfo();
		System.out.println(info);
	}

}
