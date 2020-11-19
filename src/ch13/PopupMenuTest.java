package ch13;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {
	public static void main(String[] args) {
		final Frame f = new Frame("PopupMenu Test");
		f.setSize(300, 200);
		
		final PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCopy = new MenuItem("Copy");
		MenuItem miPaste = new MenuItem("Paste");
		pMenu.add(miCut);		// PopupMenu에 MenuItem들을 추가한다.
		pMenu.add(miCopy);
		pMenu.add(miPaste);
		
		f.add(pMenu);	// PopupMenu를 Frame에 추가한다.
		f.addMouseListener(new MouseAdapter() {		// 익명클래스
			public void mousePressed(MouseEvent me) {
				// 오른쪽 마우스버튼을 누르면 PopupMenu를 화면에 보여준다.
				if(me.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) {
					// 책에서는 if(me.getModifiers() == me.BUTTON3_MASK) 이지만,
					// Java9부터 이 기능은 사라지게 되고 위와같이 변경되었다.(deprecated)
					pMenu.show(f, me.getX(), me.getY());
				}
			}
		});
		f.setVisible(true);
	}
}
