/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cart1 {

    public Node head;
    
    double totalAmount = 0;

    public void addNode(int drink, int quantity) {
        //int drink, quantity;
        Node node = new Node(drink, quantity);

        Node currentNode = head;
        
        
        if (head == null) {
            head = node;

        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;

            }

            currentNode.next = node;

        }
        
        totalAmount += node.getTotalPrice();
    }
    
    public Node removeNode(int drinkDiscard){
        Node previous = head;
        Node current = head;
        
        while(current != null){
            
            if(current.getDrink() == drinkDiscard){
                //remove node
                System.out.println("Drink found... removing..");
                previous.next = current.next;
                System.out.println("drink no" + current.getDrink() + " has been removed");
                return current;
            }
            else{
                if(current == head){
                    current = current.next;
                }
                else{
                    previous = current;
                    current = current.next;                    
                } 
            }
        }
        
        System.out.println("No drink found");
        return null;
        /*
        while(current.getDrink() != drinkDiscard){
            if(current.next==null){
                System.out.println("Drink not order");
                return null;
            }
            else{
                previous=current;
                current=current.next;
            }
            
            if(current==head){
                head=head.next;
            }
            else{
                previous.next=current.next;                
            }
        }
        return current;*/
    }
    
    public double getTotalAmount(){
        return totalAmount;
    }

    public void display() {
        Node node = head;

        //try to print in receipt format
        System.out.println("========== Current Receipt =======");
        System.out.println("DrinkType          Quantity          Price");
        while (node != null) {
            System.out.println("");
            System.out.printf("   %d                %d                %.2f\n", node.getDrink(), node.getQuantity(), node.getTotalPrice());
            node = node.next;
        }
        
        System.out.println("");
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("==================================");
        
        try{
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("Transaction History.txt",true));
            outputStream.println("========== Current Receipt =======");
            outputStream.println("DrinkType          Quantity          Price");
            while (node != null) {
            outputStream.println("");
            outputStream.printf("   %d                %d                %.2f\n", node.getDrink(), node.getQuantity(), node.getTotalPrice());
            node = node.next;
        }
        
        outputStream.println("");
        outputStream.println("Total Amount: " + totalAmount);
        outputStream.println("==================================");
        }catch(Exception e){
            System.out.println("File problem");
        }
        
    }
}
