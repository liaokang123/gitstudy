package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Date date= new Date();
        date.getMonth();
        date.getDay();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm;ss");
        sdf.format(new Date());
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,12,31);


    }
}
