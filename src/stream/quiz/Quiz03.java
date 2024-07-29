package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 리스트 생성
		List<Order> list = new ArrayList<Order>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		// 3-1 모든 거래번호를 한줄에 나열하시오.
		for (Order order : list) {
			System.out.print(order.orderNo + " ");
		}
		System.out.println();
		
		// 3-2 2022년도 거래 총금액과 건수를 출력하시오.
		int totalPrice_2022 = 0;
		int totalTrade_2022 = 0;

		for (Order order : list) {
			if (order.year == 2022) {
				totalPrice_2022 += order.price;
				totalTrade_2022++;
			}
		}
		System.out.println("총금액:" + totalPrice_2022 + ", 거래건수:" + totalTrade_2022);
		
		// 3-3 2023년도 거래 총금액과 건수를 출력하시오.
		int totalPrice_2023 = 0;
		int totalTrade_2023 = 0;
		
		for (Order order : list) {
			if (order.year == 2023) {
				totalPrice_2023 += order.price;
				totalTrade_2023++;
			}
		}
		System.out.println("총금액:" + totalPrice_2023 + ", 거래건수:" + totalTrade_2023);
	}
}

// 거래내역 클래스
class Order {
	int orderNo;
	int year;
	int price;
	
	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
		
		
	}

	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", year=" + year + ", price=" + price + "]";
	}

}