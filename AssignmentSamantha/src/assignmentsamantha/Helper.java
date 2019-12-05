/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmentsamantha;

import java.util.Timer; 
import java.util.TimerTask; 

public class Helper extends TimerTask{
   
	public static int i = 0; 
	public void run() 
	{ 
		System.out.println("Timer ran " + ++i); 
	} 
} 

class Test 
{ 
	public static void main(String[] args) 
	{ 
		
		Timer timer = new Timer(); 
		TimerTask task = new Helper(); 
		
		timer.schedule(task, 2000, 30); 
		
	} 
} 


