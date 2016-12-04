package DeliveryMan;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Jakub on 04.12.2016.
 */
public class AvailabilityPeriod {
    private Calendar beginTime;
    private Calendar endTime;

    public AvailabilityPeriod() {
        this.beginTime = null;
        this.endTime = null;
    }

    public AvailabilityPeriod(Calendar beginTime, Calendar endTime) {
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public static boolean CheckAvailability(List<AvailabilityPeriod> availabilityPeriods, Calendar dateToCheck) {
        //use it
//        Calendar date1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+1"));
//        Calendar date2 = (Calendar)date1.clone();
//        date2.add(Calendar .HOUR_OF_DAY, -5);
//        System.out.println(date1.getTime().toString() + " " + date2.getTime().toString());
//        if(date1.compareTo(date2) < 0)
//        {
//            System.err.println("data 1 jest wcześniej!");
//        }
//        else
//        {
//            System.err.println("data 1 jest później");
//        }
        return false;
    }

    public void UpdateAvailabilityPeriod(Calendar newBeginTime, Calendar newEndTime) {

    }

}
