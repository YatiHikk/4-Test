package university;
import java.util.Date;

public class Competition implements Event {
    private String town;
    private Date date;
    private int sum;


    public Competition createCompetition(String town, Date date, int sum){

        if(sum < 0)
            throw new IllegalArgumentException("asdasdasd sum < 0");

        return new Competition(town, date, sum);
    };
    public Competition(String town, Date date, int sum){
        this.town = town;
        this.date = date;
        this.sum  = sum;
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

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
