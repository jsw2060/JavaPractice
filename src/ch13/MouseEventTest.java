package ch13;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseEventTest extends Frame{
	Label location;
	
	public MouseEventTest(String title) {
		super(title);	// Frame(String title)을 호출한다.
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195, 15);
		location.setLocation(5, 30);
		location.setBackground(Color.yellow); 	// Label의 배경색을 노란색으로 한다.
		add(location);
		
		// EventHandler의 인스턴스를 Frame의 Listener로 등록한다.
		addMouseMotionListener(new EventHandler());
		
		setSize(300, 200);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MouseEventTest mainWin = new MouseEventTest("MouseEventTest");
	}	// main메서드의 끝
	
	class EventHandler implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location : (" + e.getX() + "," + e.getY() + ")");
		}
	}	// EventHandler클래스의 끝
}
