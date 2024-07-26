package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex02 {

	public static void main(String[] args) {

		// stream의 특징 3가지

		// 1. 한번 생성하고 사용한 stream은 재사용 할 수 없다.
		List<Integer> list = Arrays.asList(5, 1, 2, 4, 3, 3);
		Stream<Integer> stream = list.stream();

		// 1-1 forEach(람다식): 반복적인 작업을 수행하는 연산자
		stream.forEach(t -> System.out.print(t + " "));
		System.out.println();

		// 1-2 count: 요소의 길이를 반환하는 연산자
//		long count = stream.count();
//		System.out.println(count);

		// 2. stream 연산은 원본 데이터를 변경하지 않는다.
		Stream<Integer> stream2 = list.stream();

		// sorted: 요소들을 정렬하는 연산자 (중간연산: 여러번 가능)
		// collect: steam을 list로 변환하는 연산자 (최종연산: 한번 쓰고 끝)
		List<Integer> sortList = stream2.sorted().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(sortList);

		// 3. 중간연산은 여러번 할 수 있고, 최종 연산은 마지막에 한번만 할 수 있다.
		Stream<Integer> stream3 = list.stream();

		// filter: 조건을 만족하는 요소만 추출하는 중간 연산자
		// sorted: 순서대로 정렬하는 중간 연산자
		// forEach: 최종 연산자
		stream3.filter(t -> t >= 3).sorted().forEach(t -> System.out.print(t + " "));

		Stream<Integer> stream4 = list.stream();
		Stream<Integer> stream5 = stream4.filter(t -> t >= 3);
		Stream<Integer> stream6 = stream5.sorted();
	}

}

//// 추상메소드 구현하기(반복하고 싶은 작업)
//void accept(T t) {
//	System.out.println(t);
//}
//
//(T t) -> System.out.println(t);