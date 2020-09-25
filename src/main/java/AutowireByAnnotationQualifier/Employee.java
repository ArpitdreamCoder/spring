package AutowireByAnnotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("tempaddress2")
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
