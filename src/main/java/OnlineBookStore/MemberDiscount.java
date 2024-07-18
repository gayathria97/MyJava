package OnlineBookStore;

public class MemberDiscount implements Discount{
    @Override
    public double applyDiscount(double price) {
        double discountPrice = price - (price*10)/100;
        return discountPrice;

    }
}
