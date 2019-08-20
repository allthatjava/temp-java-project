package brian.temp.java.project;

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
		
		System.out.println("### Stack ########################################################");
		Search se = new Search();
		Employee e = se.findByFirstName("David");
		Employee e2 = se.findByName("David", "Donners");
		
		System.out.println("First Name:"+e.getFirstName()+", Last Name:"+e.getLastName()+", Phone:"+e.getPhoneNumber());
		System.out.println("First Name:"+e2.getFirstName()+", Last Name:"+e2.getLastName()+", Phone:"+e2.getPhoneNumber());
		
		
	}
}
