import java.rmi.*;
import java.util.Scanner;

public class DresseurPokemon {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Pokemon pit = (Pokemon)Naming.lookup("//localhost:6512/MeilleurPokemon");
			String str = "";
			do {
				System.out.println("Feed - pour le nourrir ");
				System.out.println("Drink - pour lui faire boire ");
				System.out.println("Clean - pour le nettoyer ");
				System.out.println("Status - pour voir sil va bien ");
				str = sc.nextLine();
					switch(str) {
						case "feed" :
							System.out.println(pit.feed());
							break;
						case "status" :
							System.out.println(pit.getStatus());
							break;
						case "drink" :
							System.out.println(pit.drink());
							break;
						case "clean" :
							System.out.println(pit.clean());
							break;
					}
			
			} while(str!="Exit");
			
		}catch(Exception re ) {
			
		}
	}
}
