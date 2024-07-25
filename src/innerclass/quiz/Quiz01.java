package innerclass.quiz;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz01 {

	public static void main(String[] args) {

		// 1. 화면 만들기
		Frame frame = new Frame(); // 프레임 선언
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300); // X좌표, Y좌표, 넓이, 높이
		frame.setVisible(true); // setVisible(ture)를 해줘야 누으로 확인 가능
		
		// 키 이벤트 등록
		// 프레임을 열고, 키를 누려면 -> "키를 눌렀습니다." 출력...
		
		// 1. 구형 클래스를 사용해서 등록
//		frame.addKeyListener(new MykeyListener());
		
		//  2. 익명클래스를 사용해서 등록
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("키 눌렁");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}

class MykeyListener implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키 눌렀다.");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
