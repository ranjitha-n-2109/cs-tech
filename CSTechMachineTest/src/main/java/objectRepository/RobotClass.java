package objectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClass {
	public void getZoomOut() throws Exception {
		Robot r = new Robot();

		for (int i = 1; i <= 6; i++) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_MINUS);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_MINUS);
		}
	
}
}
