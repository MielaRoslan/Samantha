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
    
    public Buyer(String item, int n){
        maxSize = n;
        head = 0;
        tail = 0;
        arr = new String[maxSize];
    }
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
    
       public boolean isEmpty(){
        return tail == 0;
         }
       
       public void addToCart(String item){
        
        if(isEmpty()){
            arr[head] = item;
            tail++;
         }}
        
      public boolean isFull(){
        return tail >= maxSize;
    }
    
    public void cancelFromCart(){
        
    } 
      
       public void delete(){
        
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
    }

}
