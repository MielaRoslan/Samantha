/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

/**
 *
 * @author USER
 */
public class Node {
    public int drink;
    int quantity;
    double totalPrice;
    Node next;
    
    Node(){
        this.drink=drink;
        this.quantity=quantity;
        this.totalPrice=totalPrice;
    }
    
    public void display(){ 
        System.out.println(drink+" quantity: "+ quantity);
    }
    
    public static void main (String[] args){
        Cart1 cart= new Cart1();
        cart.addNode();
//        cart.addNode();
        cart.display();
        
}

    
}

