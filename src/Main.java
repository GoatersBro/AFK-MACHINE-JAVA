/* 
 * This will run a loop that will click through random keys
 * to trick the game into thinking im not AFK
*/

import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("AFK Machine Counting Down");
        
        for (int i = 5; i > -1; i--){
            System.out.println(i);
            sleep(1);
        }
        
        afkLoop();
    }

    private static void afkLoop() throws Exception{
        Robot robot = new Robot();

        while (true) {
            robot.keyPress(KeyEvent.VK_W);
            System.out.println("Key Pressed");
            sleep(secRandom());
            robot.keyRelease(KeyEvent.VK_W);
            System.out.println("Key Released");
            sleep(secRandom());
        }
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time*1000);
        } catch (Exception e) {
            System.out.println("Sleep failure "+e);
        }
    }

    private static int secRandom() {
        Random rand = new Random();
        
        return rand.nextInt(6);
    }
}
