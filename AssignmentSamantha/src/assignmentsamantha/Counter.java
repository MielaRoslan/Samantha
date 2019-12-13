package assignmentsamantha;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Counter {

    Counter() {
        //this is constructor
    }

    int maxSize = 20;

    Scanner s = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    int plus = 20;
    int popci = 20;
    int hell = 20;
    int pikapoo = 20;
    int sky = 20;
    int mailo = 20;
    int spright = 20;
    int legal = 20;

    public void counter() {
        Cart1 cart = new Cart1();

        Scanner a = new Scanner(System.in);
        System.out.println("How many flavours you want? ");
        int berapa = a.nextInt();
        for (int i = 1; i <= berapa; i++) {

            System.out.println("drink: ");
            int drink = a.nextInt();
            System.out.println("quantity: ");
            int quantity = a.nextInt();

            cart.addNode(drink, quantity);
            cart.display();

            if (drink == 1) {
                plus = plus - quantity;
            }
            if (drink == 2) {
                popci = popci - quantity;
            }
            if (drink == 3) {
                hell = hell - quantity;
            }
            if (drink == 4) {
                pikapoo = pikapoo - quantity;
            }
            if (drink == 5) {
                sky = sky - quantity;
            }
            if (drink == 6) {
                mailo = mailo - quantity;

            }
            if (drink == 7) {
                spright = spright - quantity;
            }
            if (drink == 8) {
                legal = legal - quantity;
            }
            try {
                PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
                outputStream.println("aina shifaa");
                outputStream.close();
            } catch (IOException e) {
                System.out.println("Problem with file output");
            }
        }
    }

    public void returnNum() {
        counter();
        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            outputStream.println("Current Quantity is:");
            outputStream.println("99plus: " + plus);
            outputStream.println("Popci: " + popci);
            outputStream.println("Hell&Sky: " + hell);
            outputStream.println("Pikapoo: " + pikapoo);
            outputStream.println("SkyJuice: " + sky);
            outputStream.println("MAILO: " + mailo);
            outputStream.println("Spright: " + spright);
            outputStream.println("LegalCaffeine: " + legal);

            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public void refillQuantity() {
        System.out.println("");
        System.out.println("Quantity to refill: ");
        System.out.println("99plus: " + (20 - plus));
        System.out.println("Popci: " + (20 - popci));
        System.out.println("Hell&Sky: " + (20 - hell));
        System.out.println("Pikapoo: " + (20 - pikapoo));
        System.out.println("SkyJuice: " + (20 - sky));
        System.out.println("MAILO: " + (20 - mailo));
        System.out.println("Spright: " + (20 - spright));
        System.out.println("LegalCaffeine: " + (20 - legal));
        System.out.println("");
    }

    public void ask() {
        System.out.println("Do you want to refill the drinks?");
        System.out.println("[yes/no]");
        String ans = a.nextLine();
        if (ans.equals("yes")) {
            System.out.println("");
            System.out.println("Which drink do you want to refill?");
            int select = s.nextInt();
            if (select == 1) {

            }
            if (select == 2) {

            }
            if (select == 3) {

            }
            if (select == 4) {

            }
            if (select == 5) {

            }
            if (select == 2) {

            }
            if (select == 6) {

            }
            if (select == 7) {

            }
        } else {
            System.out.println("Thank you");
        }
    }

//        public static void main(String[] args) {
//
//        Counter c = new Counter();
//
//        c.counter();
//        c.returnNum();
//        c.refillQuantity();
//        c.ask();
//
//    }
}
