
package assignmentsamantha;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       
        System.out.println("====== WELCOME TO SAMANTHA SMART  VENDING MACHINE =======");
        
                System.out.println("Hi! I'm Samantha");
                System.out.println("How are you?");
                System.out.print("Are you my Vendor or my Customer? : ");
        
        Scanner y = new Scanner(System.in);
        String ans = y.next();  
        if (ans.equalsIgnoreCase("customer")) {
            Buyer by = new Buyer();
            by.insertMoney();
            
            Counter c1 = new Counter();
            Cart1 cart = c1.returnNum();
            //display balance
            by.balance(cart);
            
            by.confirmTransaction(cart);
            
            VendorStack vs = new VendorStack(20);
            vs.transactionHistory();
          
            
        }
        else if(ans.equalsIgnoreCase("vendor")){
            VendorStack vs = new VendorStack(20);
            vs.logIn();
            vs.ask();
//            vs.transactionHistory();
        }
    }
    
}
