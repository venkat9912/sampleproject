package myprojects;

public class Encaps {
	private String empName;
	private String address;
	private int id;
	private double salary;
	
	public String getempName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public String getaddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public double getsalary() {
		return salary;	
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}

	public static void main(String[] args) {
		
		
		Encaps en=new Encaps();
		en.setEmpName("sanjay");
		en.setAddress("hyderabad");
		en.setId(106);
		en.setSalary(12500);
		
		
		System.out.print(en.getId()+" ");
		System.out.print(en.getempName()+" ");
		System.out.print(en.getaddress()+" ");
		System.out.print(en.getsalary());

	}

}
