public class RewardValue {
    private final double cashValue;
    private final double milesValue;
    private static final double MILES_T0_CASH_RATE = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public int getMilesValue() {
        return (int) (milesValue);
    }

    private double milesToCash(double miles) {
        return Math.floor(miles * MILES_T0_CASH_RATE);
    }

    public double getCashValue() {
        return cashValue;
    }

    private int cashToMiles(double cash) {
        return (int) (cash / MILES_T0_CASH_RATE);
    }

}