package calender;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayDate {
	public LocalDate getWeekDate(DayOfWeek day){
        return LocalDate.now().with(day);
    }
    
    @Test
    public void test_date(){
        LocalDate monDate = getWeekDate(DayOfWeek.MONDAY);
        LocalDate tueDate = getWeekDate(DayOfWeek.TUESDAY);
        LocalDate wedDate = getWeekDate(DayOfWeek.WEDNESDAY);
    }

}
