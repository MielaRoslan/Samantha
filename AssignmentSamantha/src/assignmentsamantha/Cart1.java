/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cart1 {
    
    public Node head;
    //public Node drink;
     //Scanner s= new Scanner(System.in);
    
    //loop infinite!!!!!!!
    public void addNode(int drink, int  quantity){
        //int drink, quantity;
        Node node = new Node(drink, quantity);
        
        Node currentNode = head;
        
        if(head == null){
            head = node;
            
        }else{
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            
            currentNode.next = node;
 
        }
    }
    
    public void display(){
        Node node = head;
        
        while(node != null){
            node.display();
            node = node.next;
        }
    }
}
