
package assignmentsamantha;

import java.util.Date;
import java.sql.Timestamp;

public class TimeStamp {
    //masuk dalam transaction history
    public static void main(String[] args) {
        Date date = new Date();
        long time = date.getTime();
        System.out.println("Time in Milliseconds: " + time);

        Timestamp ts = new Timestamp(time);
        System.out.println("Current Time Stamp: " + ts);
    }
}
