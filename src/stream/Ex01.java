package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {

	public static void main(String[] args) {

		// list로부터 stream 생성하기
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream1 = list.stream();
		
		System.out.println("list: " + list);
		System.out.println("stream1: " + stream1);
		System.out.println();
		
		// 객체 배열로부터 stream 생성하기
		String[] strArr = {"a", "b", "c"};
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Arrays.stream(strArr);
		
		System.out.println("strArr: " + strArr);
		System.out.println("stream2: " + stream2);
		System.out.println("stream3: " + stream3);
		System.out.println();
		
		// 기초 배열로부터 기본형 stream 생성하기
		int[] intArr = {1,2,3,4,5};
		IntStream stream4 = Arrays.stream(intArr);
		
		System.out.println("intArr: " + intArr);
		System.out.println("stream4: " + stream4);
	}

}
