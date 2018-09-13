import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.net.*;

public class PokemonServer {
	  public static void main(String[] args) {
		PokemonImpl monpokemon;
	    try {
	      LocateRegistry.createRegistry(6512);
	      monpokemon = new PokemonImpl();
	      Naming.rebind("//localhost:6512/MeilleurPokemon", monpokemon);
	      System.out.println("Server started");
	    } catch(RemoteException re) {
	      System.out.println("RemoteException: " + re);
	    } catch(MalformedURLException mfe) {
	      System.out.println("MalformedURLException: "
	                         + mfe);
	    }
	    Pokemon pit = (Pokemon)Naming.lookup("//localhost:6512/MeilleurPokemon");
	  int drink = 0;
	  int eat = 0;
	  int clean = 0;
	  while(true) {
		  drink += 1;
		  eat += 1;
		  clean += 1;
		  if(drink >= 10000)
			  drink = 0;
		  pit.setthirsty(false);
	  }
	}
}
