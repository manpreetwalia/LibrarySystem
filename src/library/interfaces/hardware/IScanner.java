package library.interfaces.hardware;

public interface IScanner {
	
	public void addListener(IScannerListener listener);  // function
	
	public void setEnabled(boolean enabled);

}
