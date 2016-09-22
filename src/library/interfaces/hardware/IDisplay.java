package library.interfaces.hardware;

import javax.swing.JPanel;

public interface IDisplay {
	
	public JPanel getDisplay(); // get function
	public void setDisplay(JPanel panel, String identifier);
	public JPanel MegreDisplay();//Merging multiple displays
}
