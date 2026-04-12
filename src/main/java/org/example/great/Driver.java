package org.example.great;

public class Driver {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.cancelOrder().fileComplaint();
        Customer customer2 = new Customer();
        if (customer2.orderTotal.putOnLayaway(1, 999, 5)) {
            System.out.println("Layaway time!");
        } else {
            System.out.println("Pay up!");
        }



    }
}
