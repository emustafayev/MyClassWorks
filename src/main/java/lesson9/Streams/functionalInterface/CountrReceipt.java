package lesson9.Streams.functionalInterface;

public class CountrReceipt extends Receipt {

    double countrTax;
    public CountrReceipt(Receipt r, double countrTax) {
        super(r);
        this.countrTax=countrTax;
    }

}
