package innerclass;

// A 클래스
class A{
	int num =10;
}

// B 클래스
class B {
	
	void method() {
		A a = new A();
		System.out.println(a.num);
	}
}

// C 클래스 (외부 클래스)
class C {
	int num = 10;
	
	// D 클래스 (내부 클래스)
	class D {
		
		void method() {
			System.out.println(num); // 객체 생성없이 외부 클래스 멤버 사용
		}
	}
}