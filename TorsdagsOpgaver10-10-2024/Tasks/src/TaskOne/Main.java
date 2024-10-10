package TaskOne;

import java.util.ArrayList;

public class Main {


public static void main(String[]args){
    ArrayList<Customer> customers = new ArrayList<>();

    customers.add(new Customer("Mads","Dahl","Burgerbolle"));
    customers.add(new Customer("Kristoffer","Kreiner","mr.cool"));
printCustomers(customers);
}

public static void printCustomers(ArrayList<Customer> customers){

    for(Customer s: customers){
        System.out.println(s);
    }

}
}
