package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot houseDrawer = new Robot();
		houseDrawer.penDown();
		houseDrawer.hide();
		houseDrawer.setSpeed(100);
		houseDrawer.moveTo(0, 500);
		for(int x = 0; x<=500; x++) {
		for(int i = 0; i<=15; i++) {
			houseDrawer.setRandomPenColor();
			if(i%2 == 0) {
				houseDrawer.move(150);
				houseDrawer.turn(90);
				houseDrawer.move(30);
				houseDrawer.turn(90);
				houseDrawer.move(150);
		
			}
			else {
// draw that weird triangle house here

				houseDrawer.move(150);
				houseDrawer.turn(45);
				houseDrawer.move(30);
				houseDrawer.turn(-270);
				houseDrawer.move(30);
				houseDrawer.turn(45);
				houseDrawer.move(150);
			
			}
			houseDrawer.turn(-90);
			houseDrawer.move(30);
			houseDrawer.turn(-90);
		}
		houseDrawer.moveTo(0, 500-x*2);
		}
	}
}
