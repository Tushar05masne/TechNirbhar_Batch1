package encapsulationDemo;

public class GetEmployeeInfo {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
	
		emp1.setEmpId(10);				// if we provide arguments/value here, it will override the variable's value which we declared in class
		int id = emp1.getEmpId();
		System.out.println(id);
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		System.out.println(emp1.getCompany());
	}

}
