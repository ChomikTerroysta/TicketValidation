import java.time.LocalTime;

public class Ticket {

    private int vadlidTime;
    private LocalTime timeStamp;

    public Ticket(int vadlidTime, LocalTime timeStamp) {
        this.vadlidTime = vadlidTime;
        this.timeStamp = timeStamp;
    }

    public int getVadlidTime() {
        return vadlidTime;
    }

    public LocalTime getTimeStamp() {
        return timeStamp;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vadlidTime=" + vadlidTime +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
