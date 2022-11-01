/*
 * This class will be in its own thread doing its own thing
 */

import java.awt.Robot;
import java.awt.event.KeyEvent;

import java.util.Random;

public class KeyPusher implements Runnable{
    int opt1, opt2;

    KeyPusher(int option1, int option2){
        opt1 = option1;
        opt2 = option2;
    }
    
    public void run(){
        try {
            afkLoop(opt1, opt2);
        } catch (Exception e) {
            System.out.println("Loop Startup Fail "+e);
        }
    }

    private static void afkLoop(int option1, int option2) throws Exception {
        final int[] WA = {option1, option2};
        int key;
        
        Robot robot = new Robot();

        while (true) {
            key = secRandom(2); 
            
            robot.keyPress(WA[key]);
            sleep(secRandom(6));

            robot.keyRelease(WA[key]);
            sleep(secRandom(3));
        }
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {
            System.out.println("Sleep failure " + e);
        }
    }

    private static int secRandom(int bounds) {
        Random rand = new Random();

        int r = rand.nextInt(bounds);
        System.out.println(r);

        return r;
    }
    
}
