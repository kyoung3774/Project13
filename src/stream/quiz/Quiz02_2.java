package stream.quiz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz02_2 {

	public static void main(String[] args) {
		
		String [] arr = {"file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img"};
		Stream<String> stream = Arrays.stream(arr);
		
		// 1
		stream.filter(s -> s.endsWith(".txt")).forEach(s -> System.out.print(s+" "));
		
		// 2 
		Stream<String> stream2 = Arrays.stream(arr);
//		long txtCount = stream2.filter(s -> s).
				
		// 3 
		Stream<String> stream3 = Arrays.stream(arr);
		
	}

}
