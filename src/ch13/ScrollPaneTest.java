package ch13;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPaneTest {
	public static void main(String args[]) {
		Frame f = new Frame("ScrollPaneTest");
		f.setSize(300, 200);
		
		ScrollPane sp = new ScrollPane();
		Panel p = new Panel();
		p.setBackground(Color.green);	// Panel의 배경을 green으로 한다.
		p.add(new Button("첫번째"));		// Button을 Panel에 포함시킨다.
		p.add(new Button("두번째"));
		p.add(new Button("세번째"));
		p.add(new Button("네번째"));
		
		sp.add(p);		// Panel을 ScrollPane에 포함시킨다.
		f.add(sp);		// ScrollPane을 Frame에 포함시킨다.
		f.setVisible(true);
	}
}
