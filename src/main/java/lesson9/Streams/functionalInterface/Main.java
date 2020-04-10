package lesson9.Streams.functionalInterface;

public class Main {
    public static void main(String[] args) {
        Interface1.method1();
        System.out.println(Class1.s);
//        Class1 c1 = new Class1();

        ReceiptPrinter<Receipt> receiptPrinter = new ReceiptPrinter<Receipt>() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("\nItem :\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Tax:\t" + receipt.tax);
                System.out.println("Total:\t" + computeTotal(receipt));
            }
        };

//
        Receipt receipt = new Receipt("Name",34,0.5,0.5);
        CountrReceipt countrrec = new CountrReceipt(receipt,0.5);
        receiptPrinter.print(receipt);

        ReceiptPrinter<Receipt> exeptReceiptPrinter = new ReceiptPrinter<Receipt>() {
            @Override
            public void print(Receipt receipt) {
                System.out.println("\nItem :\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Tax:\t" + receipt.tax);
                System.out.println("Total:\t" + computeTotal(receipt));
            }
            @Override
            public double computeTotal(Receipt receipt){
                return getDiscountedPrice(receipt);
            }
        };
        exeptReceiptPrinter.print(receipt);


        ReceiptPrinter<CountrReceipt> receiptReceiptPrinter = new ReceiptPrinter<CountrReceipt>() {
            @Override
            public void print(CountrReceipt receipt) {
                System.out.println("\nItem :\t" + receipt.item);
                System.out.println("Price:\t" + receipt.price);
                System.out.println("Disc:\t" + receipt.discount);
                System.out.println("Tax:\t" + receipt.tax);
                System.out.println("Total:\t" + computeTotal(receipt));
                System.out.println("Country:\t"+receipt.countrTax);
            }
        };

        receiptReceiptPrinter.print(countrrec);

    }
}
