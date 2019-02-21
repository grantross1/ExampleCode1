/**THIS IS NOT MY CODE!
  *This is code taken from Dr.Bareiss
  *@author Dr.Bareiss
  *Code used for simon game, lab 3
  *For Grant Ross taken from class examples
  *Modified for Lab 3
  */
import lejos.nxt.*;

public class Robot implements RobotInterface {
    TouchSensor a, b, c, d;
    public Robot() {//sets sensors to ports
        a = new TouchSensor(SensorPort.S1);
        b = new TouchSensor(SensorPort.S2);
        c = new TouchSensor(SensorPort.S3);
        d = new TouchSensor(SensorPort.S4);
    }
    
    public int getButton() { //the four buttons to play simon game
        if (a.isPressed()) return 1;
        if (b.isPressed()) return 2;
        if (c.isPressed()) return 3;
        if (d.isPressed()) return 4;
        return 0;
    }
    

    public void displayString(String str) throws Exception {
        LCD.clear(); //draws on robot
        LCD.drawString(str, 0, 0);
        Thread.sleep(1000);
    }
}
