package HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private DiscountType discount;


    public PriceCalculator(double pricePerDay, int days, Season season, DiscountType discount){
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public Season getSeason() {
        return season;
    }

    public DiscountType getDiscount() {
        return discount;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getDays() {
        return days;
    }

    public double calculateMethod() {
    return getPricePerDay() * getSeason().getMultiplier() * getDays() * (1.00 - (getDiscount().getPercentage() / 100.00));
    }


}
