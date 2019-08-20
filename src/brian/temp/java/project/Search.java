package brian.temp.java.project;

import java.util.Arrays;
import java.util.List;

public class Search {

	List<Employee> empList = Arrays.asList(new Employee[] {
			new Employee("David","Don","123"),
			new Employee("cc","dd","aa"),
			new Employee("wer","ew","fdsf"),
			new Employee("sdf","sdf","vx"),
			new Employee("David","Donners","321")}
			);
	
	public Employee findByFirstName(String firstName)
	{
		return empList.stream().filter(e -> e.getFirstName().equals(firstName))
			.findFirst().get();
	}

	public Employee findByName(String firstName, String lastName)
	{
		return empList.stream()
				.filter(e -> e.getFirstName().equals(firstName)
							&& e.getLastName().equals(lastName)
						)
				.findFirst().get();
	}
	
	
	
	class Employee{
		String firstName;
		String lastName;
		String phoneNumber;
		
		public Employee(String firstName, String lastName, String phoneNumber) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneNumber = phoneNumber;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		
	}
}
