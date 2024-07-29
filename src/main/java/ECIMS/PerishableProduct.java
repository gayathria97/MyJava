package ECIMS;

public class PerishableProduct extends Product{

    private String expiryDate;

    public PerishableProduct(int id, String name, double price, int quantity, String expiryDate) {
        super(id, name, price, quantity);
        this.expiryDate=expiryDate;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public String toString() {
        return "PerishableProduct{" +
                "expiryDate='" + expiryDate + '\'' +
                '}';
    }


}
