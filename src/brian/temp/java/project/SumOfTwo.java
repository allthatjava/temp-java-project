package brian.temp.java.project;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
	
	public static void findTwoIndixes(int[] numbers, int target) throws Exception
	{
		
		// error check. array must not be empty and must contain more than 2 
		if( numbers == null || numbers.length < 2 )
			throw new Exception("Array of numbers cannnot be empty or contains less than 2 numbers");

		// <number, index>
		Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
		
		for( int i=0; i < numbers.length; i++)
		{
			int delta = target - numbers[i];
			
			if( visited.containsKey(delta) ) {
				System.out.println("index is ["+i+","+visited.get(delta)+"]");
				return;
			}
			
			visited.put(numbers[i], i);
		}
	}
}
