
public class Robot 
{
	private State currentState;
	
	public Robot()
	{
		currentState = null;
	}
	
	public void talk()
	{
		System.out.println("Talk");
	}
	
	public void cook()
	{
		System.out.println("Cook");
	}
	
	public void sing()
	{
		System.out.println("Sing");
	}
	
	public State getCurrentState()
	{
		return this.currentState;
	}
	
	public void setCurrentState(State state)
	{
		this.currentState = state;
	}
	
	public void execute()
	{
		this.currentState.execute(this);
		
	}	
}
