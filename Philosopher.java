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
	private int meals;
	private int philosopherID;
	private Fork leftFork;
	private Fork rightFork;
	private Waiter waiter;
	
	public Philosopher(Waiter w, Fork rightFork, Fork leftFork)
	{
		this.waiter = w;
		this.leftFork = leftFork;
		this.rightFork = rightFork;
		
	}
	
	
	public void eat() {
		
		this.meals++;
	}
	
	public Fork getRightFork() {
		
		return this.rightFork;
		
	}
	public Fork getLeftFork() {
		
		return this.leftFork;
		
	} 
	
	
	public void getStats() {
		//Print out the name 
		//print out the amout of meals that a philosopher has eaten
		//print out the amount of thoughts that a phiosopher has thought 
		//print out the ratio between the times
		
		
	}
	
	
	
    public void run() {
    	boolean exit = false;
    	
    	
    while(!exit) {
    	waiter.crtical(this);
    
    	//if(something){exit = true;}
    	
    
    }
    	
    	//Thread t = new Thread(new Philosopher());
    	//t.start();
    /*
     while(){
     
     
    
     
     philosophers cycle between thinking, entering-exiting the critical section, and eating.
     
     
     
         }
    */
    }
     /*write getters and seteres for instance varaibles
     * 
     * 
     * 
     * 
     */
}