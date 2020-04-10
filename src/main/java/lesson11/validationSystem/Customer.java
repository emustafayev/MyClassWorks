package lesson11.validationSystem;

public class Customer {
    private final String name;
    private final String surname;
    private final String phoneNumber;
    private final String email;

    public Customer(String name, String surname, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
}
