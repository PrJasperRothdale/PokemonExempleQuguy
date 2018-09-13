import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class PokemonImpl extends UnicastRemoteObject implements Pokemon {
	
	public boolean hungry = false;
	public boolean thirsty = false;
	public boolean notclean = false;
	public PokemonImpl() throws RemoteException{
		super();
	}
	
	public void sethungry ( boolean hungrys){  hungry = hungrys; }
	public void setthirsty ( boolean thirstys){  thirsty = thirstys; }
	public void setclean( boolean cleans){  notclean = cleans; }

	@Override
	public String feed() throws RemoteException {
		// TODO Auto-generated method stub
		hungry = true;
		return "Le pokemon a bien mange";
	}

	@Override
	public String clean() throws RemoteException {
		// TODO Auto-generated method stub
		notclean = true;
		return "Le pokemon a ete nettoye";
	}

	@Override
	public String drink() throws RemoteException {
		// TODO Auto-generated method stub
		thirsty = true;
		return "Le pokemon a bien bu";
	}

	@Override
	public String getStatus() throws RemoteException {
		// TODO Auto-generated method stub
		String status = "";
		if(!hungry)
			status += "Le pokemon a faim\n";
		else
			status += "Le pokemon a deja mange\n";
		if(!thirsty)
			status += "Le pokemon a soif\n";
		else
			status += "Le pokemon a deja bu \n";
		if(!notclean)
			status += "Le pokemon est sale\n";
		else
			status += "Le pokemon est propre\n";
		return status;
	}
	
}
