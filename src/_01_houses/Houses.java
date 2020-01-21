package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot houseDrawer = new Robot();
		houseDrawer.penDown();
		houseDrawer.moveTo(0, 250);
		for(int i = 0; i<=8; i++) {
			houseDrawer.setRandomPenColor();
			houseDrawer.turn(-90);
			if(i%2 == 2) {
				houseDrawer.move(150);
				houseDrawer.turn(90);
				houseDrawer.move(30);
				houseDrawer.turn(90);
				houseDrawer.move(150);
			}
			else {
// draw that weird triangle house here
			}
			houseDrawer.turn(-90);
			houseDrawer.move(30);
		}
	}
}
