package lambda.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		// 구현 클래스
		StringConverter stringConverter1 = new StringConverterImpl();
		String result1 =  stringConverter1.convert("aaa");
		System.out.println(result1);
		
		//익명 클래스
		StringConverter stringConverter2 = new StringConverter() {
			
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		String result2 =  stringConverter2.convert("bbb");
		System.out.println(result2);
		
		// 람다식
		StringConverter stringConverter3 = (s) -> s.toUpperCase();
		String result3 = stringConverter3.convert("ccc");
		System.out.println(result3);
	}

}

// 함수형 인터페이스 선언
interface StringConverter{
	
	// 문자열 대문자로 변환해서 반환하는 함수
	String convert(String s);
}

// 구현 클래스
class StringConverterImpl implements StringConverter{

	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
	
}