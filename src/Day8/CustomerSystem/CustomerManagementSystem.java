package Day8.CustomerSystem;





import Day8.ClaimProcessingSystem.InvalidClaimAmountException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagementSystem {
    Scanner sc=new Scanner(System.in);
    List<CustomerManagementSystem> list=new ArrayList<>();
    private String name;
    private int cid;
    private long phone;
    CustomerManagementSystem(String name,int cid,long phone){
        this.name=name;
        this.cid=cid;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    void addCustomer(CustomerManagementSystem c1){
//       CustomerManagementSystem c1=new CustomerManagementSystem("ashish",201,834528353);
        list.add(c1);
        InvalidCustomerDataException ic=new InvalidCustomerDataException();
        try{
            ic.checkValid(c1);
        } catch (InvalidClaimAmountException e) {
            System.out.println(e.getMessage());
        }
    }
    void updateCustomer(CustomerManagementSystem c){
        CustomerNotFoundException ce=new CustomerNotFoundException();
        try{
            ce.checkCustomer(list,c);
        }
        catch (CustomerNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        CustomerManagementSystem c1=new CustomerManagementSystem("Ashish",200,2003030303);
        c1.addCustomer(c1);
        c1.updateCustomer(c1);
    }
}