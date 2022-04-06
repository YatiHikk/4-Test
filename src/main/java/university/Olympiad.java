package university;

import java.util.Date;

public class Olympiad implements Event {
    private String town;
    private Date date;
    private int place;

    public Olympiad(String town, Date date, int place){
        this.town = town;
        this.date = date;
        this.place  = place;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getTown() {
        return town;
    }

    @Override
    public void setTown(String town) {
        this.town = town;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
