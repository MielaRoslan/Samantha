/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Scanner;

public class Node {

    int drink;
    //int drinkDiscard;
    int quantity;
    double totalprice;
    Node next = null;

    Node(int drink, int quantity) {
        this.drink = drink;
        this.quantity = quantity;
        this.totalprice = totalprice;
    }

    public int getDrink(){
        return drink;
    }
    public void display() {
        if (drink == 1) {
            totalprice = 1.5 * quantity;
        } else if (drink == 2) {
            totalprice = 1.5 * quantity;
        } else if (drink == 3) {
            totalprice = 2.0 * quantity;
        } else if (drink == 4) {
            totalprice = 1.5 * quantity;
        } else if (drink == 5) {
            totalprice = 1.0 * quantity;
        } else if (drink == 6) {
            totalprice = 2.5 * quantity;
        } else if (drink == 7) {
            totalprice = 1.5 * quantity;
        } else if (drink == 8) {
            totalprice = 2.0 * quantity;
        }
        System.out.println("drink: " + drink + " quantity: " + quantity +  " Total Price: " + totalprice);
    }

}
