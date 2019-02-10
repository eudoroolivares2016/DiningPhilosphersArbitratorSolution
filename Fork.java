
public class Fork {
	private boolean inUse = false;
	private int forkID;
	
	
	public Fork() {
		this.inUse = inUse;
		this.forkID = forkID;
	}
	public boolean getUseStatus() {
		
		return this.inUse;
	}
	
	public void grab(){
		inUse = true;
	}
	
	public void drop(){
		inUse = false;	
		
	}
}
