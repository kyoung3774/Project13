package lambda;

public class Ex02 {

	public static void main(String[] args) {

		// 객체식
//		Calc calc = new MyCalc();
//		System.out.println(calc.add(5, 10));

		// 람다식
		Calc calc2 = (num1, num2) -> num1 + num2;
		System.out.println(calc2.add(10, 20));

		// 람다식의 동작 원리
//		컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스턴스를 생성함
		Calc calc3 = new Calc() {
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		System.out.println(calc3.add(5, 5));
	}

}

// 함수형 인터페이스 만들기
@FunctionalInterface // 어노테이션 사용(추상 메소드가 다수 일떄 인터페이스 에러)
interface Calc {

	// 추상 메소드 만들기(두 숫자를 더해서 합을 반환하는 함수)
	public int add(int num1, int num2);

	// 추상 메소드가 여러개면 람다식을 대입할 때, 어떤 메소드의 코드인지 알 수 없음(에러)
//	public int max(int num1, int num2);

}

// Calc 구현 클래스 만들기
//class MyCalc implements Calc {
//
//	@Override
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
//
//}