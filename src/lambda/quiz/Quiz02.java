package lambda.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		// 구현 클래스
		Hello hello1 = new HelloImpl();
		hello1.helloPrint();
		
		// 익명 클래스: 인터페이스 변수명 = new 인터페이스 {오버라이드(구현부)}
		Hello hello2 = new Hello() {

			@Override
			public void helloPrint() {
				System.out.println("안녕하세요2");

			}
		};
		hello2.helloPrint();

		// 람다식: 인터페이스 변수명 = (파라미터) -> 리턴값
		Hello hello3 = () -> System.out.println("안녕하세요3");
		hello3.helloPrint();
	}

}

// 함수형 인터페이스 선언
interface Hello {

	// "안녕하세요"를 출력하는 함수
	void helloPrint();
}

// 구현 클래스
class HelloImpl implements Hello {

	@Override
	public void helloPrint() {
		System.out.println("안녕하세요1");

	}

}