package innerclass.quiz;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Quiz02 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300); // X좌표, Y좌표, 넓이, 높이
		frame.setVisible(true); // setVisible(ture)를 해줘야 누으로 확인 가능

		TextArea textArea = new TextArea("텍스트 상자", 10, 50);
		frame.add(textArea);
		
		frame.setVisible(true);
		
		// 1. 구현 클래스 등록
//		textArea.addFocusListener(new MyFocusListener());
		
		// 2. 익명 클래스 등록
		textArea.addFocusListener(new MyFocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("포커스 포커스");
			}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("언언 포커스");
			}
			
		});
	}

}

// 구현 클래스
class MyFocusListener implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("포커스");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("언 포커스");
	}
	
}