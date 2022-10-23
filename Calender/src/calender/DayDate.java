package calender;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayDate {
	public String getWeekDate(DayOfWeek day){
		LocalDate date = LocalDate.now().with(day);
        return date.format(DateTimeFormatter.ofPattern("yyyyMMdd"));
	}
}
