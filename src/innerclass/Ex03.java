package innerclass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex03 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300); // X좌표, Y좌표, 넓이, 높이
		frame.setVisible(true); // setVisible(ture)를 해줘야 누으로 확인 가능

		Button button = new Button("Click");
		frame.add(button);

		// 2. 버튼 이벤트 등록(미리 구현한 클래스로 이벤트를 등록)
//		button.addActionListener(new EventHandler());

		// 3. 익명 클래스를 만들며, 객체 생성
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭~");

			}

		});
	}

}

// ActionListener 인터페이스를 구현하는 클래스
class EventHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭");
	}

}