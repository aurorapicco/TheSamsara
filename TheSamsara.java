package theSamsara;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class theSamsara {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		String titolo = "___ _  _ ____    ____ ____ _  _ ____ ____ ____ ____\n |  |__| |___    [__  |__| |\\/| [__  |__| |__/ |__| \n |  |  | |___    ___] |  | |  | ___] |  | |  \\ |  | \n                                                    ";
		System.out.println(titolo);
		Thread.sleep(3000);
		System.out.print("\nLoading");
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		clearConsole();
	
		System.out.println("Inserisci il tuo nome: ");
		String nomePro = Leggi.unoString();
		Protagonista pro = new Protagonista(nomePro, 69);
		//char ch;
		
		File Dialoghi = new File("theSamsara.txt");
		Scanner scanner = new Scanner(Dialoghi);
		leggiDaFile(Dialoghi, scanner); //inizio
		Thread.sleep(2000);
		clearConsole();
		//mostro il fulmine
		leggiDaFile(Dialoghi, scanner); //fulmine
		Thread.sleep(2000);
		clearConsole();
		//mostro la casa
		leggiDaFile(Dialoghi, scanner); //ilde
		Thread.sleep(2000);
		clearConsole();
		leggiDaFile(Dialoghi, scanner); //inizio swain
		Thread.sleep(2000);
		clearConsole();
		allenamentoSwain(pro);
		leggiDaFile(Dialoghi, scanner); //fine swain
		Thread.sleep(2000);
		clearConsole();
		leggiDaFile(Dialoghi, scanner); //deviazione
		System.out.println("A) Sinistra\nB) Destra");
		char ris;
		do
		{
			ris = Leggi.unChar();
		}
		while(ris != 'A' && ris != 'a' && ris != 'B' && ris != 'b');
		clearConsole();
		if(ris == 'a' || ris == 'A')
		{
			leggiDaFile(Dialoghi, scanner); //sinistra
			Thread.sleep(2000);
		}
		else
		{
			while (scanner.hasNextLine() == true) {
				String st = scanner.nextLine(); //sinistra
				if(st.equals("/"))
				{
					break;
				}
			}
		}
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //torno sulla strada principale
		Thread.sleep(2000);
		clearConsole();
		//mostro il villaggio
		leggiDaFile(Dialoghi, scanner); //prete
		Thread.sleep(2000);
		clearConsole();
		Item pozione = new Cura("Pozione rigenerante", 10);
		pro.aggiungiInventario(pozione);
		
		leggiDaFile(Dialoghi, scanner); //incontro con giganti
		Thread.sleep(2000);
		clearConsole();
		//mostro la città
		leggiDaFile(Dialoghi, scanner); //arrivo in città
		Thread.sleep(2000);
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //mercante
		Thread.sleep(2000);
		clearConsole();
		shop(pro);
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //parata
		Thread.sleep(2000);
		clearConsole();
		
		allenamentoAthena(pro);
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //pre combattimento
		Thread.sleep(2000);
		clearConsole();
		
		Nemico gigante1 = new Nemico("Gigante", 40, 15);
		combattimento(pro, gigante1);
		System.out.println("Uno è fuori combattimento! Ora tocca all'altro!");
		Nemico gigante2 = new Nemico("Gigante", 40, 15);
		combattimento(pro, gigante2);
		
		leggiDaFile(Dialoghi, scanner); //arrivo boss
		Thread.sleep(2000);
		clearConsole();
		
		Nemico boss = new Nemico("Emmett il Gigacoso", 100, 15);
		
		leggiDaFile(Dialoghi, scanner); //pre boss
		Thread.sleep(2000);
		clearConsole();
		
		boss.prendiDanno(26); //danno di athena
		
		combattimento(pro, boss);
		if(pro.isVivo() == false)
		{
			leggiDaFile(Dialoghi, scanner); //morte protagonista
			System.exit(0);
		}
		
		while (scanner.hasNextLine() == true) {
			String st = scanner.nextLine(); //frasi pre morte inutili
			if(st.equals("/"))
			{
				break;
			}
		}
		
		leggiDaFile(Dialoghi, scanner); //post boss, saluti
		Thread.sleep(2000);
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //portale
		Thread.sleep(2000);
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //ri-inizio
		Thread.sleep(2000);
		clearConsole();
		
		leggiDaFile(Dialoghi, scanner); //scammata assurda
		Thread.sleep(2000);
		clearConsole();
		
		scanner.close();
	}
	
	public static void leggiDaFile(File d, Scanner s) throws InterruptedException
	{
		
		while (s.hasNextLine() == true) {
			String st = s.nextLine();
			if(st.equals("/"))
			{
				break;
			}
			System.out.println(st); //legge una riga alla volta
			Thread.sleep(4000);
			//ch = Leggi.unChar();
		}
	}
	
	public static void clearConsole()
	{
		for(int i = 0; i < 100; i++)
			System.out.println("\n");
	}
	
	public static void allenamentoSwain(Protagonista p) throws InterruptedException
	{
	    System.out.println("Benvenuto nel programma di allenamento di Swain");
	    Thread.sleep(3000);
		clearConsole();
	    //System.out.println("Hai selezionato l'allenamento di Swain per aumentare la tua resistenza!");
	    System.out.println("L'allenamento consiste in corsa e nuoto");
	    Thread.sleep(3000);
		clearConsole();
	    int scelta;
	    
	    do {
	        System.out.println("Seleziona il tipo di esercizio:");
	        System.out.println("1) Corsa");
	        System.out.println("2) Nuoto");
	        
	        scelta = Leggi.unInt();
	        
	    }while (scelta < 1 || scelta > 2);
	    Thread.sleep(1000);
		clearConsole();

	    if (scelta == 1) 
	    {
	        System.out.println("Hai selezionato corsa");
	        System.out.println("Iniziamo l'allenamento...");
	        System.out.println("Corsa completata!");
	        
	        p.aumentaResistenza(5);
	    }
	    else{
	        System.out.println("Hai selezionato nuoto");
	        System.out.println("Iniziamo l'allenamento...");
	        System.out.println("Nuoto completato!");
	        
	        p.aumentaResistenza(2);
	    }
	    Thread.sleep(3000);
		clearConsole();
	    
	    System.out.println("La tua resistenza attuale è: " + p.getResistenza());
	    Thread.sleep(3000);
		clearConsole();
		
		System.out.println("Hai ottenuto un regalo da Lord Swain per il tuo ottimo lavoro!");
	    Thread.sleep(3000);
		clearConsole();
		System.out.println("Nuova arma sbloccata - SPADA DI LEGNO!\n");
		Arma spadadiLegno = new Arma("Spada Di Legno", 2, true);
		p.setSpada(spadadiLegno);
		Thread.sleep(3000);
		clearConsole();
		
		Colpo stoccata = new Colpo("Stoccata", 1, 1, 'E');
	    System.out.println("Nuovo colpo imparato - STOCCATA!\nTasto: E\nUtilizzo: ogni turno");
	    p.aggiungiColpo(stoccata);
	    Thread.sleep(4000);
	    clearConsole();
		
		
	}
	
	public static void shop(Protagonista p) throws InterruptedException
	{
		int numCubloni = 30;
		Arma spadaDiFerro = new Arma("Spada di Ferro", 10, false);
		Cura pozione = new Cura("Pozione Curativa", 10);
		Item bambolaDiPezza = new Inutile("Bambola di Pezza");
		Protezione elmetto = new Protezione("Elmetto in Ferro", 5);
		Item[] prodottiDisponibili = new Item[4];
		prodottiDisponibili[0] = spadaDiFerro;
		prodottiDisponibili[1] = pozione;
		prodottiDisponibili[2] = bambolaDiPezza;
		prodottiDisponibili[3] = elmetto;
		
		
		while(1>0)
		{
			
			System.out.println("Benvenuto nel mio shop, ecco cosa propongo oggi:");
			if(prodottiDisponibili[0] != null)
			{
				System.out.println("0) " + spadaDiFerro.getNome() + " - 10 cubloni");
			}
			if(prodottiDisponibili[1] != null)
			{
				System.out.println("1) " + pozione.getNome() + " - 3 cubloni");
			}
			if(prodottiDisponibili[2] != null)
			{
				System.out.println("2) " + bambolaDiPezza.getNome() + " - 8 cubloni");
			}
			if(prodottiDisponibili[3] != null)
			{
				System.out.println("3) " + elmetto.getNome() + " - 9 cubloni");
			}
			System.out.println("\nCubloni disponibili: " + numCubloni + "\nCosa vorresti comprare? (Inserisci il numero)");
			int ris;
			do
			{
				ris = Leggi.unInt();
				if(ris >= 0 && ris < 4)
				{
					p.aggiungiInventario(prodottiDisponibili[ris]);
					prodottiDisponibili[ris] = null;
					if(ris == 0)
					{
						p.setSpada(spadaDiFerro);
						spadaDiFerro.equipaggia();
						numCubloni -= 10;
					}
					else if(ris == 1)
					{
						numCubloni -= 3;
					}
					else if(ris == 2)
					{
						numCubloni -= 8;
					}
					else if(ris == 3)
					{
						numCubloni -= 9;
						p.setResistenza(elmetto.getProtezione());
					}
					
				}
					
			}
			while(ris < 0 || ris > 4);
			
			System.out.println("Basta così? [Y] Yes, [N] No");
			int r;
			do
			{
				r = Leggi.unChar();
			}
			while(r != 'Y' && r != 'y' && r != 'N' && r != 'n');
			if(r == 'Y' || r == 'y')
			{
				break;
			}
			
			Thread.sleep(1000);
			clearConsole();
		}
 	}
	
	public static void allenamentoAthena(Protagonista p) throws InterruptedException
	{	
	    System.out.println("Benvenuto nel programma di allenamento di Athena");
	    Thread.sleep(2000);
	    clearConsole();
	    //System.out.println("Hai selezionato l'allenamento di Athena per aumentare la tua forza!");
	    System.out.println("L'allenamento consiste in sollevamento pesi e addominali");
	    Thread.sleep(2000);
	    clearConsole();
	    int scelta;
	    
	    do{
	        System.out.println("Seleziona il tipo di esercizio:");
	        System.out.println("1) Sollevamento pesi");
	        System.out.println("2) Addominali");
	        
	        scelta = Leggi.unInt();
	        
	    }while (scelta < 1 || scelta > 2);
	    Thread.sleep(1000);
	    clearConsole();

	    if(scelta == 1)
	    {
	        System.out.println("Hai selezionato sollevamento pesi");
	        System.out.println("Iniziamo l'allenamento...");
	        System.out.println("Sollevamento pesi completato!");
	        
	        p.aumentaForza(10);
	        
	    }
	    else{
	        System.out.println("Hai selezionato addominali");
	        System.out.println("Iniziamo l'allenamento...");
	        System.out.println("Addominali completati!");
	        
	        p.aumentaForza(5);
	    }
	    Thread.sleep(2000);
	    clearConsole();
	    
	    System.out.println("Il tuo livello di forza attuale è: " + p.getForza());
	    Thread.sleep(2000);
	    clearConsole();
	    
	    System.out.println("Ora che sei diventato più forte hai imparato una tecnica di spada!");
	    Thread.sleep(2000);
	    clearConsole();
	    
	    Colpo doppioColpo = new Colpo("Doppio Colpo", 3, 2, 'Q');
	    System.out.println("Nuovo colpo imparato - DOPPIO COLPO!\nTasto: Q\nUtilizzo: ogni 3 turni");
	    p.aggiungiColpo(doppioColpo);
	    Thread.sleep(4000);
	    clearConsole();
	    
	}
	
	public static void combattimento(Protagonista p, Nemico n) throws InterruptedException
	{
		int turno = 0;
		
		while(p.isVivo() == true && n.isVivo() == true)
		{
			System.out.println("TUA VITA: " + p.getVita());
			System.out.println("VITA NEMICO: " + n.getVita());
			System.out.println("TURNO: " + turno);
			System.out.println("CURE DISPONIBILI: " + p.getNumCure());
			System.out.println("Cosa vuoi fare? [E] Stoccata, [Q] Doppio colpo(ogni 3 turni), [Z] Cura");
			
			boolean error;
			char scelta;
			
			do
			{
				error = false;
				scelta = Leggi.unChar();
				if((scelta == 'Q' || scelta == 'q') && turno %  p.colpi[1].getTurno() != 0)
				{
					System.out.println("Errore! Controlla il turno...");
					error = true;
				}
				else if(scelta == 'Z' && p.getNumCure() <= 0)
				{
					System.out.println("Errore! Controlla quante cure possiedi...");
					error = true;
				}
			}
			while(error == true);
				
			if(scelta == 'E' || scelta == 'Q'|| scelta == 'e' || scelta == 'q')
			{
				int ris;
				
				if(scelta == 'E' || scelta == 'e')
					ris = 0;
				else
					ris = 1;
				
				n.prendiDanno((p.getSpada().getDanno() * p.colpi[ris].getDmgBonus()));
				//System.out.println("Hai inflitto " + (p.getSpada().getDanno() * p.colpi[ris].getDmgBonus()) + " danni");
			}
			else
			{
				for(int i = 0; i < p.getInventario().length; i++)
				{
					if(p.getInventario()[i] instanceof Cura)
					{
						p.guarisci(((Cura)p.getInventario()[i]).getCura());
						p.rimuoviInventario(i);
						break;
					}
				}
			}
			
			p.prendiDanno(n.getDanno() - p.getResistenza());
			
			Thread.sleep(2000);
			clearConsole();
			
			turno++;
		}
	}
	
	/*
	public static void combattimento(Protagonista p, Nemico n)
	{
		int turno = 0;
		int cnt = 3;
		
		while(p.isVivo() == true && n.isVivo() == true)
		{
			System.out.println("TUA VITA: " + p.getVita());
			System.out.println("VITA NEMICO: " + n.getVita());
			System.out.println("Cosa vuoi fare? [E] Stoccata, [Q] Doppio colpo, [Z] Cura");
			
			boolean error;
			char scelta;
			
			do
			{
				error = false;
				scelta = Leggi.unChar();
				if((scelta == 'Q' || scelta == 'q') && cnt != 3)
				{
					System.out.println("Errore! Controlla il turno...");
					error = true;
				}
				else if(scelta == 'Z' && p.getNumCure() <= 0)
				{
					System.out.println("Errore! Controlla quante cure possiedi...");
					error = true;
				}
			}
			while(error == true);
				
			if(scelta == 'E' || scelta == 'Q')
			{
				int ris;
				
				if(scelta == 'E')
				{
					ris = 0;
				}
				else
				{
					ris = 1;
					cnt--;
					if(cnt == 0)
					{
						cnt = 3;
					}
				}
					
				
				n.prendiDanno((p.getSpada().getDanno() * p.colpi[ris].getDmgBonus()));
				//System.out.println("Hai inflitto " + (p.getSpada().getDanno() * p.colpi[ris].getDmgBonus()) + " danni");
			}
			else
			{
				for(int i = 0; i < p.getInventario().length; i++)
				{
					if(p.getInventario()[i] instanceof Cura)
					{
						p.cura(((Cura)p.getInventario()[i]).getCura());
						p.rimuoviInventario(i);
					}
				}
			}
			
			p.prendiDanno(n.getDanno() - p.getResistenza());
			
			turno++;
		}
	}
	*/
}
