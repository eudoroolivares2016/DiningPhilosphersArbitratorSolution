/*Reported statistics
 total loop iterations
total number of times a philosopher eats
accumulated time spent waiting for the waiter or processing the critical section
total time spent in the run method
All instance and static variables shall be private. If you need to access a variable from another
class, write an accessor method (getter or setter).
 */
public class Philosopher implements Runnable {
	private String name; //This is the name of the philosopher
	private int thoughts;//number of thoughts the philosophers has 
	private int philosopherID;
	Fork leftFork;
	Fork rightFork;
    public void run() {
    	Thread t = new Thread(new Philosopher());
    	t.start();
    /*
     while(){
     
         }
    */
    }
     /*write getters and seteres for instance varaibles
     * 
     * 
     * 
     */
}