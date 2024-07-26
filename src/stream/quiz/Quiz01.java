package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz01 {

	public static void main(String[] args) {

		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };

		List<String> list = Arrays.asList(arr);
		Stream<String> stream = Stream.of(arr);

		// 1. 문자열 목록중에서 길이가 2보다 큰 요소의 개수를 구하시오.(답:3)
		System.out.println(stream.filter(s -> s.length() > 2).count());
		
		// 2. 모든 문자열의 길이를 더한 합을 구하시오.(답:13)
		
		// 3. 가장 길이가 짧은 문자열의 길이를 구하시오.(답:1)
		
		// 4.중복을 제거한 리스트르 만드세요.(답: [aaa, b, ccccc])
		
	}

}
