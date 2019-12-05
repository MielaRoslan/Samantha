
package assignmentsamantha;

import java.util.Timer;
import java.util.TimerTask;

public class TestingTimer {
    
    int secondsPassed = 0;
    
    Timer myTimer = new Timer();
    TimerTask task = new TimerTask(){
        public void run(){
            secondsPassed++;
            System.out.println("Seconds passed: "+ secondsPassed);
        }
    };
    
    public void start(){
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
    }
    
    public static void main(String[] args) {
        TestingTimer t = new TestingTimer();
        t.start();
    }
}
