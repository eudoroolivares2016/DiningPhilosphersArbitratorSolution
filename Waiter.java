/*
Try to pass the fork objects instead of Ids 
The waiter (Arbitrator) doesn’t actually grant permission
to pick up the forks. The waiter just ensures that only one philosopher at a time checks and
picks up its forks.
*/
public class Waiter {
	
		public Waiter(){
		
		}
		//int count;
		public synchronized void crtical(Philosopher currentPhilosopher)
		{	
			if(currentPhilosopher.getLeftFork().getUseStatus() == false) {
				currentPhilosopher.getLeftFork().grab();
			}
			if(currentPhilosopher.getRightFork().getUseStatus() == false) {
				currentPhilosopher.getRightFork().grab();
			}		
			if(currentPhilosopher.getRightFork().getUseStatus() == false && currentPhilosopher.getLeftFork().getUseStatus() == false ) {
				// do stuff 
				currentPhilosopher.getRightFork().grab();
				currentPhilosopher.getLeftFork().grab();
				currentPhilosopher.eat();
			}
			//count++; //count = count +1 
			//Two operations both acessing and adding
		}	
}