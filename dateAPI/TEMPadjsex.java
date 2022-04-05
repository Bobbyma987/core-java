package dateAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TEMPadjsex {

   public static void main(String[] args) {
       LocalDate date = LocalDate.of(2022, Month.APRIL, 23);
       LocalDate date2 = LocalDate.of(2022, Month.AUGUST , 21);
       
       date2.getDayOfWeek();

       TemporalAdjuster ta = t -> t.plus(Period.ofMonths(2));
       System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

    } 
    
}
