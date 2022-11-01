/* 
 * This will run a loop that will click through random keys
 * to trick the game into thinking im not AFK
*/

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("AFK Machine Counting Down");
        
        for (int i = 5; i > -1; i--){
            System.out.println(i);
            sleep(1000);
        }
        
        afkLoop();
    }

    private static void afkLoop() throws Exception{
        Robot robot = new Robot();

        while (true) {
            robot.keyPress(KeyEvent.VK_W);
        }
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println("Sleep failure "+e);
        }
    }
}
