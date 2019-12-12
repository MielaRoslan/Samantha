/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Scanner;


class Buyer {
    
    int head;
    int tail;
    String arr[];
    double money = 0;
    Scanner s = new Scanner(System.in);
    double totalMoney = 0;

//    public Buyer(String item, int n){
//        maxSize = n;
//        head = 0;
//        tail = 0;
//        arr = new String[maxSize];
//    }
    public void insertMoney() {
        System.out.println("Insert money : ");
        money = s.nextDouble();
        displayCatalogue();

    }

    public void notEnoughMoney() {
        while (money < 1.00 && totalMoney < 1.00) {
            System.out.println("Amount is not sufficient");
            System.out.println("Do you want to proceed?[yes/no]");
            String answer = s.next();
            if (answer.equals("yes")) {
                double temp = money;
                insertMoney();

                totalMoney = temp + money;
                System.out.println("Total money: " + totalMoney);
                totalMoney();
            } else {
                System.out.println("Thank You!");
            }
            break;

        }
    }

    public void displayCatalogue() {

        if (money < 1.00 && totalMoney < 1.00) {
            notEnoughMoney();

        } else {

            if (money >= 1.00 && money < 1.50) {
                System.out.println("Select your drink:");
                System.out.println("[5] SkyJuice	 	 RM 1.00\n");
            }

            if (money >= 1.50 && money < 2.00) {
                System.out.println("Select your drink:");
                System.out.println("[1] 99plus                   RM 1.50\n"
                        + "[2] Popci 		         RM 1.50\n"
                        + "[4] Pikapoo 		 RM 1.50\n"
                        + "[5] SkyJuice	 	 RM 1.00\n"
                        + "[7] Spright 		 RM 1.50\n");
            }

            if (money >= 2.00 && money < 2.50) {
                System.out.println("Select your drink:");
                System.out.println("[1] 99plus                   RM 1.50\n"
                        + "[2] Popci                    RM 1.50\n"
                        + "[3] Hell&Sky 		 RM 2.00\n"
                        + "[4] Pikapoo 		 RM 1.50\n"
                        + "[5] SkyJuice	 	 RM 1.00\n"
                        + "[7] Spright 		 RM 1.50\n"
                        + "[8] LegalCaffeine            RM 2.00");
            }

            if (money >= 2.50) {
                System.out.println("Select your drink:");
                System.out.println("[1] 99plus                  RM 1.50\n"
                        + "[2] Popci                   RM 1.50\n"
                        + "[3] Hell&Sky                RM 2.00\n"
                        + "[4] Pikapoo                 RM 1.50\n"
                        + "[5] SkyJuice                RM 1.00\n"
                        + "[6] MAILO                   RM 2.50\n"
                        + "[7] Spright                 RM 1.50\n"
                        + "[8] LegalCaffeine           RM 2.00");
            }
        }

    }

    public void totalMoney() {
        if (totalMoney >= 1.00 && totalMoney < 1.50) {
            System.out.println("Select your drink:");
            System.out.println("[5] SkyJuice	 	 RM 1.00\n");
        }
        if (totalMoney >= 1.50 && totalMoney < 2.00) {
            System.out.println("Select your drink:");
            System.out.println("[1] 99plus 		 RM 1.50\n"
                    + "[2] Popci 		 RM 1.50\n"
                    + "[4] Pikapoo 		 RM 1.50\n"
                    + "[5] SkyJuice	 	 RM 1.00\n"
                    + "[7] Spright 		 RM 1.50\n");
        }
        if (totalMoney >= 2.00 && totalMoney < 2.50) {
            System.out.println("Select your drink:");
            System.out.println("[1] 99plus 		 RM 1.50\n"
                    + "[2] Popci 		 RM 1.50\n"
                    + "[3] Hell&Sky 		 RM 2.00\n"
                    + "[4] Pikapoo 		 RM 1.50\n"
                    + "[5] SkyJuice	 	 RM 1.00\n"
                    + "[7] Spright 		 RM 1.50\n"
                    + "[8] LegalCaffeine 	 RM 2.00");
        }
        if (totalMoney >= 2.50) {
            System.out.println("Select your drink:");
            System.out.println(     "[1] 99plus               RM 1.50\n"
                                +   "[2] Popci                RM 1.50\n"
                                +   "[3] Hell&Sky             RM 2.00\n"
                                +   "[4] Pikapoo              RM 1.50\n"
                                +   "[5] SkyJuice             RM 1.00\n"
                                +   "[6] MAILO                RM 2.50\n"
                                +   "[7] Spright              RM 1.50\n"
                                +   "[8] LegalCaffeine        RM 2.00");
        }
    }

    public void confirmTransaction(Cart1 cart) {
        System.out.println("Would you like to confirm your transaction? [yes/no]");
        String answer = s.next();
        if (answer.equals("yes")) {
            System.out.println("Thank you! Have a nice day~");
        } else {
//            System.out.println("Would you want to cancel your transaction?");
            cancelTransaction(cart);
        }
    }

    public void cancelTransaction(Cart1 cart) {
        //Cart1 cart = new Cart1();
        System.out.println("cancel your transaction?[yes/no]");
        String answer = s.next();
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("Which drink do you wish to discard?");
            int remove = s.nextInt();
            cart.removeNode(remove);
            
            System.out.println("==========================");
            System.out.println("");
            cart.display();
            System.out.println("");
            System.out.println("Thank you! Have a nice day~");
        } else {
            insertMoney();
        }
    }
}

public class BuyerMain {

    public static void main(String[] args) {
        Buyer s = new Buyer();
        s.insertMoney();

        Cart1 cart = new Cart1();
        Scanner a = new Scanner(System.in);
        System.out.println("Nak berapa jenis: ");
        int berapa = a.nextInt();
        for (int i = 1; i <= berapa; i++) {

            System.out.println("drink: ");
            int drink = a.nextInt();
            System.out.println("quantity: ");
            int quantity = a.nextInt();

            cart.addNode(drink, quantity);

        }

        cart.display();
        s.confirmTransaction(cart);

    }

}
