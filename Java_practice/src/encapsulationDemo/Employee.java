package encapsulationDemo;

public class Employee {
	
	private int empId = 101;
	private String name = "Mahesh";
	private double salary = 100000;
	private static String company = "Cognizant";

	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String companyy) {
		company = companyy;
	}

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
		
	public static void main(String[] args) {
		Employee emp = new Employee();

		System.out.println(company);
		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.salary);	
		
	}

}
