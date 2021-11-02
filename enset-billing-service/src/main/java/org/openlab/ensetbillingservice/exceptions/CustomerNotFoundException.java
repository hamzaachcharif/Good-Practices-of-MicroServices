package org.openlab.ensetbillingservice.exceptions;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String customer_not_found) {
        super(customer_not_found);
    }
}
