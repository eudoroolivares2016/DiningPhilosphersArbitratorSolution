/*
instantiates and initializes all data structures, in
particular forks, philosophers, and threads. After starting each thread (Thread.start()), main
should sleep for a number of milliseconds as specified on the command line. 


*/
import java.time.Clock;
import java.util.Scanner;
public class Dine {
	
	public static void main(String args[]) {
		Scanner getInput = new Scanner(System.in);
		int amountOfSleep = getInput.nextInt();
		//Fork [] forks = new Fork[5];
		//Philosopher[] philosophers = new Philosopher[5];
		Waiter waiter = new Waiter();
		
		/*for (int i = 1; i < 5; i++) {
		     forks[i] = new Fork();
		}*/
		
		//instantiate all of the forks and philospohers for the classical problem
		
		System.out.println(java.time.LocalTime.now());  //We can use this to get the system time
		
		Fork f1 = new Fork();
		Fork f2 = new Fork();
		Fork f3 = new Fork();
		Fork f4 = new Fork();
		Fork f5 = new Fork();
		
		
		
		
		Philosopher p1 = new Philosopher(waiter, f1, f5);
		Philosopher p2 = new Philosopher(waiter, f1, f2);
		Philosopher p3 = new Philosopher(waiter, f2, f3);
		Philosopher p4 = new Philosopher(waiter, f3, f4);
		Philosopher p5 = new Philosopher(waiter, f4, f5);
		
		//Runnable phil1 = new Philosopher(waiter, f1, f5);
		
		 //this is where it will get run
	/*	p1.run();
		p2.run();
		p3.run();
		p4.run();
		*/
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p1);
		Thread t3 = new Thread(p1);
		Thread t4 = new Thread(p1);
		Thread t5 = new Thread(p1);
		
		t1.start();
		try {
			t1.join();
			Thread.sleep(amountOfSleep);
		
		}
		catch(InterruptedException ie) 
		 {
			System.out.println("t1 interrupted");
		 }
		t2.start();
		try {
			
			t2.join();
			Thread.sleep(amountOfSleep);
			
		 }
		catch(InterruptedException ie) 
		 {
			System.out.println("t2 interrupted");
		 }
		
		t3.start();
		try {
			t3.join();
			Thread.sleep(amountOfSleep);
		 }
		catch(InterruptedException ie) 
		 {
			System.out.println("t3 interrupted");
		 }
		t4.start();
		try {
			t4.join();
			Thread.sleep(amountOfSleep);
		 }
		catch(InterruptedException ie) 
		 {
			System.out.println("t4 interrupted");
		 }
		t5.start();
		try {
			t5.join();
			Thread.sleep(amountOfSleep);
		 }
		catch(InterruptedException ie) 
		 {
			System.out.println("t5 interrupted");
		 }
		
		
		//joins
		
		
	
		
		
		
		
		/*prooboly better to instantiate these seperatly  */
		
	//	philosophers[0] = new Philosopher(waiter,forks[0],forks[4]);
		//for (int i = 1; i < 5; i++) {/
		  //   philosophers[i] = new Philosopher(waiter);
		//}
		
		
		
		//philosophers[1].run();
		
		
		
		
		//eat everytime that the philosophers have acess to both forks
		//critial section time waiting for the forks to become avalible 
		//  critical section/total time
		// check if there are two forks avalible next to them 
		// if yes eat incrememnt meals
		//if no increment thoughts
		
		
		
	}
}
