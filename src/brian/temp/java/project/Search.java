package brian.temp.java.project;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * With Java 8
 * 
 * @author hyen.heo
 *
 */
public class Search {

	List<Employee> empList = Arrays.asList(new Employee[] {
			new Employee("Daniel","Don","123"),
			new Employee("cc","dd","aa"),
			new Employee("wer","ew","fdsf"),
			new Employee("sdf","sdf","vx"),
			new Employee("David","Donners","321")}
			);
	
	public List<Employee> findByFirstName(String firstName)
	{
		return empList.stream()
				.filter(e -> (firstName != null && e.getFirstName().indexOf(firstName) > -1))
				.collect(Collectors.toList());
	}

	public List<Employee> findByFullName(String firstName, String lastName)
	{
		return empList.stream()
				.filter(e -> (firstName != null && e.getFirstName().indexOf(firstName) > -1)
								&& ( lastName != null && e.getLastName().indexOf(lastName) > -1)
							)
				.collect(Collectors.toList());
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
