package lesson9.Streams.functionalInterface;

@FunctionalInterface
public interface ReceiptPrinter<E extends Receipt> {
    void print(E receipt);

    default double getDiscountedPrice(E receipt){
        return receipt.price-(receipt.price*receipt.discount);
    }
    default double computeTotal(E receipt){
        double discountedPrice = getDiscountedPrice(receipt);
        return discountedPrice + (discountedPrice*receipt.tax);
    }

}
