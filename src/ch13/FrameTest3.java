package ch13;

import java.awt.Frame;
import java.awt.event.*;

public class FrameTest3 {
	public static void main(String[] args) {
		Frame f = new Frame("Login");	// Frame객체를 생성한다.
		f.setSize(300, 200);			// Frame의 크기를 설정한다.
		
		// EventHandler클래스의 객체를 생성해서 Frame의 WindowListener로 등록한다.
		f.addWindowListener(new EventHandler());
		f.setVisible(true);				// 생성한 Frame을 화면에 보이도록 한다.
	}
}

class EventHandler implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {	// Frame의 닫기 버튼을 눌렀을 때 호출된다.
		e.getWindow().setVisible(false);		// Frame을 화면에서 보이지 않도록 하고
		e.getWindow().dispose();				// 메모리에서 제거한다.
		System.exit(0);							// 프로그램을 종료한다.
	}

	@Override
	public void windowClosed(WindowEvent e) {	// 아무내용도 없는 메서드 구현
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
