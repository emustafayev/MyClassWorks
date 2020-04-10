package lesson11.validationSystem;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(
                "Jessica",
                "Filankesov",
                "+94519773177",
                "efqan@Gmail.com"
        );

        ValidationMessage result = CustomerRegisterValidations.isEmailValid()
                .and(CustomerRegisterValidations.isPhoneNumberValid()).
                        apply(c1);

        System.out.println(result);


    }

}
