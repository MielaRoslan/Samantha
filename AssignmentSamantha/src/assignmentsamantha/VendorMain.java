/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class VendorMain {
 public void checkItem(){
     
 }   
 
 public void refillItem(){
     
 }
 
 public void generateTransaction(){
     try {
   PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
   outputStream.println("aina shifaa");
    outputStream.close();
} catch (IOException e) {
   System.out.println("Problem with file output"); 
}
//     PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
//writer.println("The first line");
//writer.println("The second line");
//writer.close();

 }
 
 public void exitVendor(){
     
 }
 
 public static void main(String[] args){
     VendorMain vm = new VendorMain();
     vm.generateTransaction();
 }
}
