package library.interfaces.hardware;

public interface ICardReader {
	
	public void addListener(ICardReaderListener listener); //function

	public void setEnabled(boolean enabled);

}
