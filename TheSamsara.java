package theSamsara;

public class theSamsara {

	public static void main(String[] args) throws InterruptedException {
		/*
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
		*/
		System.out.println("Inserisci il tuo nome: ");
		String nomePro = Leggi.unoString();
		Protagonista pro = new Protagonista(nomePro, 69);
		
		/*
		Nemico nemico = new Nemico("Gigante", 40, 10);
		Colpo stoccata = new Colpo("Stoccata", 1, 1, 'E');
		Arma spadadiLegno = new Arma(spadadiLegno, 2, true);
		pro.aggiungiColpo(stoccata);
		pro.setSpada(spadadiLegno);
		combattimento(pro, nemico);
		*/
	}
	
	public static void clearConsole()
	{
		for(int i = 0; i < 50; i++)
			System.out.println("\n");
	}
	
	public static void allenamentoSwain(Protagonista p)
	{
	    System.out.println("Benvenuto nel programma di allenamento di Swain");
	    System.out.println("Hai selezionato l'allenamento di Swain per aumentare la tua resistenza!");
	    System.out.println("L'allenamento consiste in corsa e nuoto");

	    int scelta;
	    
	    do {
	        System.out.println("Seleziona il tipo di esercizio:");
	        System.out.println("1) Corsa");
	        System.out.println("2) Nuoto");
	        
	        scelta = Leggi.unInt();
	        
	    }while (scelta < 1 || scelta > 2);

	    if (scelta == 1) 
	    {
	        System.out.println("Hai selezionato corsa");
	        System.out.println("Iniziamo l'allenamento...");
	        System.out.println("Corsa completata!");
	        
	        p.aumentaResistenza(10);
	    }
	    else{
	        System.out.println("Hai selezionato nuoto");
	        System.out.println("Iniziamo l'allenamento...");
	        System.out.println("Nuoto completato!");
	        
	        p.aumentaResistenza(5);
	    }
	    
	    System.out.println("La tua resistenza attuale è: " + p.getResistenza());
	
	}
	
	public static void shop(Protagonista p)
	{
		int numCubloni = 30;
		Arma spadaDiFerro = new Arma("Spada di Ferro", 10, false);
		Cura pozione = new Cura("Pozione Curativa", 10);
		Item bambolaDiPezza = new Inutile("Bambola di Pezza");
		Protezione elmetto = new Protezione("Elmetto in Ferro", 5);
		Item[] prodottiDisponibili = new Item[4];
		prodottiDisponibili[0] = spadaDiFerro;
		prodottiDisponibili[1] = pozione;
		prodottiDisponibili[3] = bambolaDiPezza;
		prodottiDisponibili[4] = elmetto;
		
		
		while(1>0)
		{
			
			System.out.println("Benvenuto nel mio shop, ecco cosa propongo oggi:");
			if(prodottiDisponibili[0] != null)
			{
				System.out.println("1) " + spadaDiFerro.getNome() + " - 10 cubloni");
				
			}
			if(prodottiDisponibili[1] != null)
			{
				System.out.println("2) " + pozione.getNome() + " - 3 cubloni");
			}
			if(prodottiDisponibili[2] != null)
			{
				System.out.println("3) " + bambolaDiPezza.getNome() + " - 8 cubloni");
			}
			if(prodottiDisponibili[3] != null)
			{
				System.out.println("4) " + elmetto.getNome() + " - 9 cubloni");
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
				}
					
			}
			while(ris < 0 || ris > 4);
			
			System.out.println("Basta così? [Y] Yes, [N] No");
			int r;
			do
			{
				r = Leggi.unChar();
			}
			while(r != 'Y' || r != 'y' || r != 'N' || r != 'n');
		}
 	}
	
	public static void allenamentoAthena(Protagonista p)
	{	
	    System.out.println("Benvenuto nel programma di allenamento di Athena");
	    System.out.println("Hai selezionato l'allenamento di Athena per aumentare la tua forza!");
	    System.out.println("L'allenamento consiste in sollevamento pesi e addominali");

	    int scelta;
	    
	    do{
	        System.out.println("Seleziona il tipo di esercizio:");
	        System.out.println("1) Sollevamento pesi");
	        System.out.println("2) Addominali");
	        
	        scelta = Leggi.unInt();
	        
	    }while (scelta < 1 || scelta > 2);

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
	    
	    System.out.println("Il tuo livello di forza attuale è: " + p.getForza());
	    
	}
	
	public static void combattimento(Protagonista p, Nemico n)
	{
		int turno = 0;
		
		while(p.isVivo() == true && n.isVivo() == true)
		{
			if(p.colpi[1] != null)
				System.out.println("Cosa vuoi fare? [E] Stoccata, [Q] Doppio colpo, [Z] Cura");
			else
				System.out.println("Cosa vuoi fare? [E] Stoccata, [Z] Cura");
			
			boolean error;
			char scelta;
			
			if(p.colpi[1] != null)
			{
				do
				{
					error = false;
					scelta = Leggi.unChar();
					if(p.colpi[1].getTurno() % turno != 0)
					{
						System.out.println("Errore! Controlla il turno...");
						error = true;
					}
				}
				while(error == true);
			}
			
			do
			{
				error = false;
				scelta = Leggi.unChar();
				if(scelta == 'Z' && p.getNumCure() <= 0)
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
					ris = 0;
				else
					ris = 1;
				
				n.prendiDanno((p.getSpada().getDanno() * p.colpi[ris].getDmgBonus()));
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
			
			p.prendiDanno(n.getDanno());
			
			turno++;
		}
	}
}
