package brian.temp.java.project;

public class StringReverser {

	public static String reverse(String word)
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = word.length()-1 ; i >= 0; i--) {
			sb.append( word.charAt(i));
		}
		
		return sb.toString();
	}
}
