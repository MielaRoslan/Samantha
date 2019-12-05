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
    
    public Node tail;
     Scanner s= new Scanner(System.in);
     
    Cart1(){
        tail=null;
    }
    
    public void input(){
       
        System.out.println("Which drink? ");
        int drink = s.nextInt();
        System.out.println("Quantity: ");
        int quantity=s.nextInt();
        
    }
    //loop infinite!!!!!!!
    public void addNode(){
        Node node= new Node();
        System.out.println("Nak berapa jenis: ");
        int berapa=s.nextInt();
        for(int i=1; i<=berapa; i++){
         input();
        node.next=tail;
        tail=node;   
        }
        
    }
    
    public void display(){
        Node node=tail;
        while(node!=null){
            node.display();
            node=node.next;
            break;     
        }
        System.out.println();
    }
}
