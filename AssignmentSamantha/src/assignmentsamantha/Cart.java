/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Scanner;

public class Cart {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items to choose: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Item number " + i + ": ");
            int item;
            int quantity;
            item = input.nextInt();
            System.out.println("Quantity : ");

            quantity = input.nextInt();

            CartList name = new CartList();

            name.add(new cart(item, quantity));
            System.out.println("Drink" + "\t\t\t\t" + "Price");
            System.out.println();
            System.out.println(name);
        }

    }

    public static class CartList {

        private CartNode list;

        public CartList() {
            list = null;
        }

        public void add(cart stu) {
            CartNode node = new CartNode(stu);
            CartNode current;
            if (list == null) {
                list = node;
            } else {
                current = list;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = node;
            }
        }

        public String toString() {
            String result = "";
            CartNode current = list;
            while (current != null) {
                result += current.student.title + "\t\t\t\t" + current.student.totalprice;
                current = current.next;
            }
            return result;
        }

        private static class CartNode {

            public cart student;
            public CartNode next;

            public CartNode(cart stu) {
                student = stu;
                next = null;
            }
        }
    }

    public static class cart {

        private int title;
        int quantity;
        double totalprice;

        public cart(int newTitle, int a) {
            title = newTitle;
            quantity = a;

            if (newTitle == 1) {
                totalprice = 1.5 * a;
            } else if (newTitle == 2) {
                totalprice = 1.5 * a;
            } else if (newTitle == 3) {
                totalprice = 2.0 * a;
            } else if (newTitle == 4) {
                totalprice = 1.5 * a;
            } else if (newTitle == 5) {
                totalprice = 1.0 * a;
            } else if (newTitle == 6) {
                totalprice = 2.5 * a;
            } else if (newTitle == 7) {
                totalprice = 1.5 * a;
            } else if (newTitle == 8) {
                totalprice = 2.0 * a;
            }

        }
    }
}
