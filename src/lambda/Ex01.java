package lambda;

public class Ex01 {

	public static void main(String[] args) {
		
		// 객체형 방식 (interface 구현)
		StringConcat stringConcat = new StringConcatImpl();
		stringConcat.makeString("Hello", "월드!");
		
		// 함수형 방식 (interface 구현)
		StringConcat stringConcat2 = (s1,s2) -> System.out.println(s1 + ", " + s2);
		stringConcat2.makeString("헬로우", "World");
	}

}

// 함수형 인터페이스 만들기
interface StringConcat {

	// 추상메소트 하나 만들기 (두 문자열을 연결하는 함수)
	public void makeString(String s1, String s2);
}

// 구현 클래스
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + ", " + s2);
	}
	
}