package assignmentsamantha;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendorStack implements BuyerMain{
//
//    public static void main(String[] args) {
//
//        VendorStack vendor = new VendorStack(20);
//        
//      
//        vendor.logIn();
//        vendor.ask();
//
//        
//    }
    
    
    
    VendorStack(int n) {
        n=20;
        maxSize = n;
        top = 0;

        arr = new String[maxSize];
    }
       java.io.Console console = System.console();
       Scanner s = new Scanner(System.in);
       Scanner a = new Scanner(System.in);
       int maxSize=20;
       int top;
       String arr[];
       int i=20;
       int ans3;
        
       
       int plus = 20;
       int popci = 20;
       int hell = 20;
       int pikapoo = 20;
       int sky = 20;
       int mailo = 20;
       int spright = 20;
       int legal = 20;
  
    
    
    
   public void logIn(){
        System.out.println("Please log in ");
        System.out.println("");
        System.out.print("username: ");
        String name = s.nextLine();
        if(name.equals("vendor001")){
            System.out.print("password: ");
            String pass = s.nextLine();
            
            if(pass.equals("12345")){
                System.out.println("");
                System.out.println("Welcome to Smart Vending Machine!");
            }
            else{
                System.out.println("Wrong password");
                logIn();
            }
        }
        else{
            System.out.println("Username not found");
            logIn();
        }
    }
    
   
    
    
    
    
    
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
                outputStream.println("izzan");
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
    
    
    
    
    
    
    
    
    public void checkItem(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = "";
            
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VendorStack.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VendorStack.class.getName()).log(Level.SEVERE, null, ex);
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
    
        
    
    
    
         
         
    public void ask(){
             System.out.println("");
             System.out.println("[1] Check Item Quantity");
             System.out.println("[2] Refill Item");
             System.out.println("[3] Print Transaction");
             System.out.println("[4] Exit");
             System.out.println("");
             System.out.print("Choose Transaction: ");
             int aa = s.nextInt();
             
             if(aa==1){
                 checkItem();
             }
             if(aa==2){
                 refill();
             }
             if(aa==4){
                 exit();
             }
             
             else{
                 System.out.println("Wrong input");
                 ask();
             }
         }
         
         
         
         
         
         
         
    public void refill(){
             System.out.print("Do you want to refill item? [yes/no]: ");
             String ans1 = a.nextLine();
             if(ans1.equalsIgnoreCase("yes")){
                 System.out.print("Which item do you want to refill? : ");
                 String ans2 = a.nextLine();
                 
                 if(ans2.equalsIgnoreCase("99plus")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill 99plus...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("Popci")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill Popci...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("Hell&Sky")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill Hell&Sky...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("Pikapoo")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill Pikapoo...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("SkyJuice")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill SkyJuice...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("MAILO")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill MAILO...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("Spright")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill Spright...");
                     }
                     displayStack();
                 }
                 if(ans2.equalsIgnoreCase("LegalCaffeine")){
                     System.out.println("Enter quantity to refill: ");
                     ans3 = a.nextInt();
                     for(int k=0;k<=ans3;k++){
                     push("Refill LegalCaffeine...");
                     top++;
                     }
                     displayStack();
                 }
                 else{
                     System.out.println("Wrong input");
                     refill();
                 }
             }
         }
         
         
    
    
         
         
    public boolean isEmpty(){
             if(top==0){
                 return true;
             }
             else{
                 return false;
             }
         }
         
         
         
         
         
         
    public boolean isFull(){
             if(top==maxSize){
                 return true;
             }
             else{
                 return false;
             }
         }
         
         
         
         
         
         
    public void push(String select) {

        if (top < maxSize) {

            arr[top] = select;
            top++;
        } else {
            System.out.println("Item is full");
        }

    }

            
    
    
            
    public void displayStack() {

        if (isEmpty()) {
            System.out.println("Item is empty");
        } else {
            for (int a =0; a<top-1; a++) {
                System.out.println(arr[a]);
            }
        }

    }
    
    
    
    
    
    public void exit(){
        System.out.println("Do you want to exit?[yes/no]: ");
        String ex = a.nextLine();
        
        if(ex.equalsIgnoreCase("yes")){
            System.out.println("Thank you for using me~");
        }
        if(ex.equalsIgnoreCase("no")){
            System.out.println("Do you want to proceed to another transaction?[yes/no]: ");
            String ex1 = a.nextLine();
            
            if(ex1.equalsIgnoreCase("yes")){
                System.out.println("");
                System.out.println("[1] Check Item Quantity");
                System.out.println("[2] Refill Item");
                System.out.println("[3] Print Transaction");
                System.out.println("");
                
                
                System.out.println("Select one: ");
                int ex2 = a.nextInt();
                if(ex2==1){
                    checkItem();
                }
                if(ex2==2){
                    ask();
                }
                if(ex2==3){
                    //printTransaction();
                }
                else{
                    System.out.println("Wrong input");
                    exit();
                }
                
            }
        }
    }
    


}
