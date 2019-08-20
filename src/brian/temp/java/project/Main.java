package brian.temp.java.project;

import java.util.List;

import brian.temp.java.project.Search.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("### Fizz Buzz ########################################################");
		FizzBuzz.fizzBuzz(100);
		
		System.out.println("### Two Sum ########################################################");
		try {
			SumOfTwo.findTwoIndixes( new int[]{2,7,12, 33}, 9);
			SumOfTwo.findTwoIndixes( new int[]{2, 3,7, 4, 8}, 7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("### Reverse String ########################################################");
		String word = "Hello World!";
		System.out.println( word +" -> " +StringReverser.reverse(word) );
		
		System.out.println("### Stack ########################################################");
		Stack s = new Stack(3);
		s.push("A");
		s.push("B");
		s.push("C");
		try{s.push("D");}catch(Exception e) {System.out.println(e.getMessage());}
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		try{System.out.println(s.pop());}catch(Exception e) {System.out.println(e.getMessage());}
		
		System.out.println("### Search ########################################################");
		Search se = new Search();
		
		System.out.println("--- 1st result ---");
		List<Employee> firstNameSearchFound = se.findByFirstName("Da");
		firstNameSearchFound.stream().forEach(
					e1 -> System.out.println("Searched with 'Da' in First Name:"+e1.getFirstName()
							+", Last Name:"+e1.getLastName()+", Phone:"+e1.getPhoneNumber()) 
				);

		System.out.println("--- 2nd result ---");
		List<Employee> fullNameSearchFound = se.findByFullName("David", "Donners");
		fullNameSearchFound.stream().forEach(
				e2 -> System.out.println("Searched with 'David' and 'Donners' >>> First Name:"+e2.getFirstName()
				+", Last Name:"+e2.getLastName()+", Phone:"+e2.getPhoneNumber())
		);
		
	}
}
