package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz03_3 {

	public static void main(String[] args) {

		List<Order> list = new ArrayList<Order>();

		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));

		Stream<Order> stream1 = list.stream();
		stream1.forEach(o -> System.out.print(o.orderNo + " "));
		System.out.println();

		int sum1 = list.stream().filter(o -> o.year == 2022).mapToInt(o -> o.price).sum();
		System.out.println("2022년도의 거래 총금액:" + sum1);

		long sum2 = list.stream().filter(o -> o.year == 2022).count();
		System.out.println("2022년도의 거래건수:" + sum2);
	}

}
