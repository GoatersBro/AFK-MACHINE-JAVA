/* 
 * This will run a loop that will click through random keys
 * to trick the game into thinking im not AFK
*/

import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws Exception {
        Thread keysWS = new Thread(new KeyPusher(KeyEvent.VK_W, KeyEvent.VK_S));
        Thread keysAD = new Thread(new KeyPusher(KeyEvent.VK_A, KeyEvent.VK_D));
        
        System.out.println("AFK Machine Counting Down");

        for (int i = 5; i > -1; i--) {
            System.out.println(i);
            sleep(1);
        }

        keysWS.start();
        keysAD.start();
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time * 1000);
        } catch (Exception e) {
            System.out.println("Sleep failure " + e);
        }
    }
}
