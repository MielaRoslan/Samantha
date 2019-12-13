/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

public class Timer {
    
    static Thread thread = new Thread();
    
    public static void main(String[] args) throws InterruptedException {
        for(int i=0; i<=30; i++){
            thread.sleep(1000);
            System.out.println(i);
        }
    }
}
