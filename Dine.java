/*
instantiates and initializes all data structures, in
particular forks, philosophers, and threads. After starting each thread (Thread.start()), main
should sleep for a number of milliseconds as specified on the command line. 


*/
import java.util.Scanner;
public class Dine {
	
	public static void main(String args[]) {
		Scanner getInput = new Scanner(System.in);
		int amountOfSleep = getInput.nextInt();
		Fork [] Forks = new Fork[5];
		Philosopher[] Philosophers = new Philosopher[5];	
	}
}
