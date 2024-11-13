import java.util.*;
public class calendar1{
    public static void main(String args[])
    {
        Calendar c= Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapur"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
      //  System.out.println(c.get(Calendar.WEEK));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
    }
}