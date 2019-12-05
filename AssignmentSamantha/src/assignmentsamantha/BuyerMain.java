/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Scanner;

class Buyer {
    
    int maxSize;
    int head;
    int tail;
    String arr[];
    double money=0;
    Scanner s= new Scanner(System.in);
    double totalMoney=0;
    
    
//    public Buyer(String item, int n){
//        maxSize = n;
//        head = 0;
//        tail = 0;
//        arr = new String[maxSize];
//    }
    
    public void insertMoney() {
        System.out.println("Insert money : ");
        money=s.nextDouble();
        
    }
    
    public void displayCatalogue(){
        
        while(money<1.00){
                System.out.println("Amount is not sufficient");
                System.out.println("Do you want to proceed?[yes/no]");
                String answer=s.next();
             if(answer.equals("yes")){
                double temp = money;
                insertMoney();
               
                totalMoney=temp+money;
                System.out.println("Total money: "+totalMoney);
                totalMoney();
            }
            else{
                System.out.println("Thank You!");
            }
             break;
        }
        
    
        if( money >= 1.00 && money < 1.50){
            System.out.println( "Select your drink:");
            System.out.println( "[5] SkyJuice	 	– RM 1.00\n");
        }
        if( money>= 1.50 && money < 2.00 ){
            System.out.println( "Select your drink:");
            System.out.println( "[1] 99plus 		– RM 1.50\n" +
                                "[2] Popci 		– RM 1.50\n" +
                                "[4] Pikapoo 		– RM 1.50\n" +
                                "[5] SkyJuice	 	– RM 1.00\n" +
                                "[7] Spright 		– RM 1.50\n" );
        }
        if( money >= 2.00 && money < 2.50){
            System.out.println( "Select your drink:");
            System.out.println( "[1] 99plus 		– RM 1.50\n" +
                                "[2] Popci 		– RM 1.50\n" +
                                "[3] Hell&Sky 		– RM 2.00\n" +
                                "[4] Pikapoo 		– RM 1.50\n" +
                                "[5] SkyJuice	 	– RM 1.00\n" +
                                "[7] Spright 		– RM 1.50\n" +
                                "[8] LegalCaffeine 	– RM 2.00");
        }
        if( money >= 2.50){
            System.out.println( "Select your drink:");
            System.out.println( "[1] 99plus 		– RM 1.50\n" +
                                "[2] Popci 		– RM 1.50\n" +
                                "[3] Hell&Sky 		– RM 2.00\n" +
                                "[4] Pikapoo 		– RM 1.50\n" +
                                "[5] SkyJuice	 	– RM 1.00\n" +
                                "[6] MAILO 		– RM 2.50\n" +
                                "[7] Spright 		– RM 1.50\n" +
                                "[8] LegalCaffeine 	– RM 2.00"     );
        }
        
    }
    
    public void totalMoney(){
        if( totalMoney >= 1.00 && totalMoney < 1.50){
            System.out.println( "Select your drink:");
            System.out.println( "[5] SkyJuice	 	– RM 1.00\n");
        }
        if( totalMoney>= 1.50 && totalMoney < 2.00 ){
            System.out.println( "Select your drink:");
            System.out.println( "[1] 99plus 		– RM 1.50\n" +
                                "[2] Popci 		– RM 1.50\n" +
                                "[4] Pikapoo 		– RM 1.50\n" +
                                "[5] SkyJuice	 	– RM 1.00\n" +
                                "[7] Spright 		– RM 1.50\n" );
        }
        if( totalMoney >= 2.00 && totalMoney < 2.50){
            System.out.println( "Select your drink:");
            System.out.println( "[1] 99plus 		– RM 1.50\n" +
                                "[2] Popci 		– RM 1.50\n" +
                                "[3] Hell&Sky 		– RM 2.00\n" +
                                "[4] Pikapoo 		– RM 1.50\n" +
                                "[5] SkyJuice	 	– RM 1.00\n" +
                                "[7] Spright 		– RM 1.50\n" +
                                "[8] LegalCaffeine 	– RM 2.00");
        }
        if( totalMoney >= 2.50){
            System.out.println( "Select your drink:");
            System.out.println( "[1] 99plus 		– RM 1.50\n" +
                                "[2] Popci 		– RM 1.50\n" +
                                "[3] Hell&Sky 		– RM 2.00\n" +
                                "[4] Pikapoo 		– RM 1.50\n" +
                                "[5] SkyJuice	 	– RM 1.00\n" +
                                "[6] MAILO 		– RM 2.50\n" +
                                "[7] Spright 		– RM 1.50\n" +
                                "[8] LegalCaffeine 	– RM 2.00"     );
        }
    }
        
    
    public void calculate(){
        
    }
    
    public boolean isEmpty(){
        return tail == 0;
         }
    
    public boolean isFull(){
        return tail >= maxSize;
    }
    
    public void addToCart(String item){
        
        if(isEmpty()){
            arr[head] = item;
            tail++;
         }}
    
    public void cancelFromCart(){
        
        if(isEmpty()){
            System.out.println("Cart is empty..");
        }
        
        else{
            String temp = arr[head];
            for(int i=0; i<tail-1; i++){
                arr[i] = arr[i+1];
            }
            tail--;
        }
    }
    
    public void confirmTransaction(){
        
    }
    
    public void cancelTransaction(){
        
    }

}

public class BuyerMain {

    public static void main(String[] args) {
        Buyer s= new Buyer();
        s.insertMoney();
        s.displayCatalogue();
    }

}