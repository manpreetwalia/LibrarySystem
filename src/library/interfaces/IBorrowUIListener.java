package library.interfaces;

public interface IBorrowUIListener 
{
	// functions declare as void type
	public void cancelled(); 
	
	public void scansCompleted();
	
	public void loansConfirmed();
	
	public void loansRejected();

}
