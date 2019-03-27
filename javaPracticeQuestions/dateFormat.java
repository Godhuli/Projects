package javaPracticeQuestions;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class dateFormat {

	  private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	
	public static void main(String[] args) {
		Date date = new Date(0, 0, 0);
        System.out.println(sdf.format(date));

        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));

        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

       LocalDate localDate = LocalDate.now();
       System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));
        
        // import inbuild classes like calender, Local date time, datetime formatter and create object reference
        //for these classes and display them.
        //eg: 
       /*DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(sdf.format(cal.getTime()));
         */
         
	}

}
