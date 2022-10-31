/* 
 * This will run a loop that will click through random keys
 * to trick the game into thinking im not AFK
*/

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.KeyEvent;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException{
        System.out.println("Program Started");
        Robot robot = new Robot();

        Thread.sleep(2000);
        System.out.println("Pressing Key");

        robot.keyPress(KeyEvent.VK_F);
    }
}
