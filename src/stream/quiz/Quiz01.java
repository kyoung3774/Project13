package stream.quiz;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Quiz01 {

	public static void main(String[] args) {

		String[] arr = { "aaa", "aaa", "b", "b", "ccccc" };

		// 1. 문자열 목록중에서 길이가 2보다 큰 요소의 개수를 구하시오.(답:3)
		Stream<String> stream1 = Arrays.stream(arr);
		long count = stream1.filter(s -> s.length() > 2).count();
		System.out.println("길이가 3보다 큰 요소의 개수: " + count);
		
		// 2. 모든 문자열의 길이를 더한 합을 구하시오.(답:13)
		Stream<String> stream2 = Arrays.stream(arr);
		int sum = stream2.mapToInt(s -> s.length()).sum();
		System.out.println("모든 문자열의 길이를 더한 합: " + sum);
		
		// 3. 가장 길이가 짧은 문자열의 길이를 구하시오.(답:1)
		Stream<String> stream4 = Arrays.stream(arr);
		OptionalInt min = stream4.mapToInt(s -> s.length()).min();
		System.out.println(min.getAsInt());
		
		// 4.중복을 제거한 리스트르 만드세요.(답: [aaa, b, ccccc])
		Stream<String> stream5 = Arrays.stream(arr);
		List<String> list = stream5.distinct().collect(Collectors.toList());
		System.out.println(list);
	}

}
