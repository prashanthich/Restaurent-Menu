package restuarent;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isItNewItem;

    public double getPrice(){
        return price;
    }
    public void setPrice(int aPrice) {
        this.price = aPrice;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription){
        this.description = aDescription;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String aCategory){
        this.category = aCategory;
    }
    public boolean getIsItNewItem(){
        return isItNewItem;
    }
    public void setItNewItem(boolean aIsItNewItem){
        this.isItNewItem = aIsItNewItem;
    }
}
