/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Scanner;

class Buyer {

    public void insertMoney() {
        System.out.println("Insert money : ");
        Scanner s= new Scanner(System.in);
        double money=s.nextDouble();
    }
    
    public void displayCatalogue(){
        
        if(money==1.50){
            System.out.println("Pepsi");
        }
        
    }
    
    public void addToCart(){
        
    }
    
    public void cancelFromCart(){
        
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
    }

}
