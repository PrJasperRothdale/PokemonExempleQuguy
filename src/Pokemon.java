import java.rmi.*;

public interface Pokemon extends Remote {
	public String feed() throws RemoteException;
	
	public String clean() throws RemoteException;
	
	public String drink() throws RemoteException;
	
	public String getStatus() throws RemoteException;
	
	public void sethungry ( boolean hungrys);
	public void setthirsty ( boolean thirstys);
	public void setclean( boolean cleans);
}
