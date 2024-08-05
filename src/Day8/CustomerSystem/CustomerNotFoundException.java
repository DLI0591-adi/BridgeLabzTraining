package Day8.CustomerSystem;

import java.util.List;

public class CustomerNotFoundException extends Exception{
    CustomerNotFoundException(){
        super("Customer Not found");
    }
    void checkCustomer(List<CustomerManagementSystem> list,CustomerManagementSystem c1) throws CustomerNotFoundException {
        if(!list.contains(c1))
            throw new CustomerNotFoundException();
    }
}