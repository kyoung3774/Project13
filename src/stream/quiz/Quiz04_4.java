package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz04_4 {

	public static void main(String[] args) {

		List<Customer> customersList = new ArrayList<Customer>();

		customersList.add(new Customer("둘리", 40, 100));
		customersList.add(new Customer("또치", 13, 50));
		customersList.add(new Customer("도우너", 25, 70));

		int total = customersList.stream().mapToInt(c -> c.budget).sum();
		System.out.println("총 여행 비용: " + total);

		customersList.stream().filter(c -> c.age >= 20).sorted((c1, c2) -> {
			if (c1.age > c2.age) {
				return -1;
			} else {
				return 1;
			}

		}).forEach(c -> System.out.println(c.name + ", " + c.age));
	}

}
