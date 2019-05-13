package mydb_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

		@SuppressWarnings("resource")
		public static void main(String[] args) throws Exception {

		Boolean exit = false;

		ArrayList<String> macchine = new ArrayList<String>();
		macchine.add("Mercedes");
		macchine.add("Ferrari");
		macchine.add("Bmw");
		macchine.add("Fiat");
		macchine.add("Porche");
		macchine.add("Ford");

		while (exit == false) {

			Scanner scanner = new Scanner(System.in);

			try {

				System.out.println("BENVENUTO!");
				System.out.print("- Premi 1 per accedere alla Lista" + "\n- Premi 2 per inserire elementi alla lista"
						+ "\n- Premi 3 per Eliminare elementi dalla Lista" + "\n- Premi 4 per Uscire\n");
				Integer key = scanner.nextInt();

				switch (key) {
				case 1:
					System.out.println(macchine);
					break;
				case 2:

					System.out.println("Inserisci una nuova macchina nella lista");
					macchine.add(scanner.next());
					System.out.println(macchine);
					break;
				case 3:
					System.out.println("Quale macchina vuoi eliminare?");
					System.out.println(macchine);
					macchine.remove(scanner.next());
					System.out.println(macchine);

					break;
				case 4:
					exit = true;

					break;
				}

			} catch (Exception e) {
				System.out.println("ATTENZIONE: errore di compilazione!");
				throw new Exception("ERROR!");
			}
			if(exit != true) {
				try {

					System.out.println("Vuoi ricominciare? \n 1.Si\n 2.No");

					Integer check = scanner.nextInt();

				switch (check) {
				case 1:
					exit = false;
					continue;
				case 2:
					System.out.println("Arrivederci!");
					exit = true;
					break;
				}
			} catch (Exception e) {
				System.out.println("ATTENZIONE: errore di compilazione!");
				throw new Exception("ERROR!");
			}
			}

		}

	}
}
