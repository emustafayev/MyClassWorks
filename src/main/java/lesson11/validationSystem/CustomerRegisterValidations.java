package lesson11.validationSystem;

import java.util.function.Function;

public interface CustomerRegisterValidations extends Function<Customer, ValidationMessage> {

        static CustomerRegisterValidations isPhoneNumberValid(){
            return customer -> customer.getPhoneNumber().startsWith("+")? ValidationMessage.SUCCED:
                    ValidationMessage.PHONE_NUMBER_NOT_CORRECT;
        }


    static CustomerRegisterValidations isEmailValid(){
            return customer -> customer.getEmail().contains("@")? ValidationMessage.SUCCED:
                    ValidationMessage.EMAIL_NOT_CORRECT;
        }

        default CustomerRegisterValidations and(CustomerRegisterValidations nextValidation){
            return customer -> {
                ValidationMessage result = this.apply(customer);
                return result.equals(ValidationMessage.SUCCED)? nextValidation.apply(customer):result;
            };
        }
}

enum ValidationMessage{
    SUCCED,
    EMAIL_NOT_CORRECT,
    PHONE_NUMBER_NOT_CORRECT
}
