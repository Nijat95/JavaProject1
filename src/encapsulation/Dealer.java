package encapsulation;

public class Dealer {
    private int price;
    private String BrandName;
    private String UsedOrNew;

    public String getBrandName() {
        return BrandName;
    }
    public void setBrandName(String Name) {
        this.BrandName = Name;
    }
    public int price() {
        return price;
    }
    public void setPrice(int Price) {
        this.price = Price;
    }
    public String UsedOrNew() {
        return UsedOrNew;
    }
    public void setUsedOrNew(String USdOrNew) {
        this.UsedOrNew = USdOrNew;
    }

}
