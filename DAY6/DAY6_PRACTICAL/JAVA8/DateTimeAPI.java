package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LocalDateTime ldt=LocalDateTime.now();
  System.out.println(ldt);
  LocalDate ld=LocalDate.now();
  System.out.println(ld);
  LocalTime lt=LocalTime.now();
  System.out.println(lt);
 int day=ldt.getDayOfMonth();
 int mm=ldt.getMonthValue();
 int yr=ldt.getYear();
 int hr=ldt.getHour();
 int min=ldt.getMinute();
 int sec=ldt.getSecond();
 int nano=ldt.getNano();
 System.out.println(day+"-"+mm+"-"+yr+":"+hr+":"+min+":"+sec+":"+nano);
 System.out.println("AGE CALCULATION===============");
 LocalDate dob=LocalDate.of(1989, 02, 15);
 LocalDate currdt=LocalDate.now();
 Period p=Period.between(dob, currdt);
 int year=p.getYears();
 int month=p.getMonths();
 int days=p.getDays();
 System.out.println("AGE IS:"+"YEAR:"+year+"MONTH:"+month+":"+"DAY:"+days);
 
	}

}
