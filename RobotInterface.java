/**THIS IS NOT MY CODE!
  *This is code taken from Dr.Bareiss
  *@author Dr.Bareiss
  *Code used for simon game, lab 3
  *For Grant Ross taken from class examples
  */
public interface RobotInterface {            //interface for robot
    public int getButton();                  //int for button
    public void moveMotor(int motor) throws Exception ;  //exception
    public void displayString(String str) throws Exception ; //exception
}