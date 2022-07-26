package serialize;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id; 
	String name;
	double salary;
	transient int aadhaarNo;
	
	public Employee(int id, String name, double salary, int aadhaarno) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadhaarNo = aadhaarno;
	}
	
	@Override
	public String toString() {
		return "Id=" + id + "|Name="+name+"|salary=" + salary + "|aadhaarNo=" + aadhaarNo;
	}
	
}
