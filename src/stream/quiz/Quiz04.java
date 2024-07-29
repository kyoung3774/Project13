package stream.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 리스트 생성
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		// 리스트 출력
		for(Customer customer : list) {
			System.out.println(customer);
		}
		System.out.println();
		
		// 고객 명단 출력
		System.out.println("== 고객 명단 ==");
		
		int totalCost = 0;
		
		for(Customer customer : list) {
			System.out.println(customer.name);
			totalCost += customer.budget;
		}
		
		// 여행 총 비용 출력
		System.out.println("총 여행 비용: " + totalCost);
		
		// 20 이상 고객 출력(나이 오름차순)
		System.out.println("== 20세 이상 고객 명단 ==");
		

	}

}

// 고객정보 클래스
class Customer { 
	String name;
	int age;
	int budget;
	
	public Customer(String name, int age, int budget) {
		super();
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", budget=" + budget + "]";
	}
	
	
}