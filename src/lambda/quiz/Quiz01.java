package lambda.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 구현 클래스
		MyNumber myNumber1 = new MyNumberImpl();
		System.out.println(myNumber1.max(5, 10));
		
		// Q. MyNumber를 익명 클래스로 구현하고, max()를 호출하세요.(익명클래스)
		MyNumber myNumber2 = new MyNumber() {

			@Override
			public int max(int x, int y) {
				return x > y ? x : y;
			}
		};
		System.out.println(myNumber2.max(5, 10));
		
		// Q. MyNumber를 람다식 함수로 구현하고, max()를 호출하세요.(람다식)
		MyNumber myNumber3 = (x, y) -> x > y ? x : y;
		System.out.println(myNumber3.max(5, 10));
	}

}

// 함수형 인터페이스
@FunctionalInterface
interface MyNumber {

	// 두숫자 중에 더 큰 값을 반환하는 함수
	int max(int x, int y);
}

//Q.MyNumber의 구현 클래스 만들기

class MyNumberImpl implements MyNumber {

	@Override
	public int max(int x, int y) {
		return x > y ? x : y;
	}

}