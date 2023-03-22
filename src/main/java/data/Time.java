package data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Time implements Comparable<Time> {
    // This class is used to deal with the initialization, access, and change of DateTime
    protected LocalDate date;

    public Time(LocalDate date) {
        this.date = date;
    }

    public LocalDate getTime() {
        return this.date;
    }

    @Override
    public String toString() {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public static Time toTime(String timeString) {
        // The format of the timeString is dd/MM/yyyy
        String standardFormat = timeString.substring(6) + "-"
                + timeString.substring(3,5) + "-" + timeString.substring(0,2);
        Time returnTime = new Time(LocalDate.parse(standardFormat));
        return returnTime;
    }

    @Override
    public int compareTo(Time o) {
        return this.getTime().compareTo(o.getTime());
    }

}
