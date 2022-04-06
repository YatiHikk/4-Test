package university;

import java.util.Date;

public class Conference implements Event {
    private String town;
    private Date date;
    private String materialName;

    public Conference(String town, Date date,String materialName){
        this.town = town;
        this.date = date;
        this.materialName  = materialName;
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

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
}
