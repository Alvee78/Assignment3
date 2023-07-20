package class19.E16;

import java.time.DayOfWeek;

public class DayTester {
    private int day,today;
    public DayTester(int day , int today){
        this.day = day ;
        this.today = today ;
    }
    public int difference(){
        //DayOfWeek.of(5);
        return day - today;
    }

}
