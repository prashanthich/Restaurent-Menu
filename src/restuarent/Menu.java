package restuarent;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private String lastUpDate;

    public ArrayList<MenuItem> getMenuItem(){
        return menuItems;
    }
    public void setMenuItem(ArrayList<MenuItem> aMenuItem){
        this.menuItems = aMenuItem;
    }
    public String getLastUpDate(){
        return lastUpDate;
    }
    public void setLastUpDate(String aLastUpDate){
        this.lastUpDate = aLastUpDate;
    }
}
