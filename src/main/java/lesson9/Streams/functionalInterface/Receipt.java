package lesson9.Streams.functionalInterface;

public class Receipt {
    String item;
    double price;
    double discount;
    double tax;
    public Receipt(String item,double price, double discount,double tax){
        this.item = item;
        this.price=price;
        this.discount=discount;
        this.tax=tax;
    }
    public Receipt(Receipt r){
        this.item     = r.item;
        this.price    = r.price;
        this.discount = r.discount;
        this.tax      = r.tax;
    }
}
