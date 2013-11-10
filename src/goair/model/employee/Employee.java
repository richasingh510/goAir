package goair.model.employee;

import goair.model.general.Person;

public class Employee extends Person {
	public Employee() {}

	String empId;
	String empDes;
	String empPosition;
	String empHiredate;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpDes() {
		return empDes;
	}
	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}
	public String getEmpPosition() {
		return empPosition;
	}
	public void setEmpPosition(String empPosition) {
		this.empPosition = empPosition;
	}
	public String getEmpHiredate() {
		return empHiredate;
	}
	public void setEmpHiredate(String empHiredate) {
		this.empHiredate = empHiredate;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empDes=" + empDes
				+ ", empPosition=" + empPosition + ", empHiredate="
				+ empHiredate + ", firstName=" + firstName + ", lastName="
				+ lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", dob=" + dob
				+ "]";
	}

}

