package theSamsara;

public class Protagonista extends Personaggio {
    protected Item[] inventario;
    protected Arma spada;
    protected Colpo[] colpi;
    protected int ic; //indice colpi

    public Protagonista(String nome, int saluteMax) {
        super(nome, saluteMax);
        this.inventario = new Item[10]; // Inizializza l'inventario con 10 slot
        this.spada = null;
        this.colpi = null;
        this.ic = 0;
    }

    public Item[] getInventario() {
        return inventario;
    }
    
    public void aggiungiInventario(Item o) { //aggiunge l'oggetto nel primo scompartimento vuoto che trova
    	for(int i = 0; i < inventario.length; i++)
    	{
    		if(inventario[i] == null)
    		{
    			this.inventario[i] = o;
    		}
    	}
	}
    
    public void rimuoviInventario(int index) {
		this.inventario[index] = null;
	}
    
    public int getNumCure()
    {
    	int n = 0;
    	
    	for(int i = 0; i < inventario.length; i++)
    	{
    		if(inventario[i] instanceof Cura)
    		{
    			n++;
    		}
    	}
    	
    	return n;
    }
    
    public Arma getSpada() {
		return spada;
	}
    
    public void setSpada(Arma spada) {
		this.spada = spada;
	}
    
	public Colpo[] getColpi() {
		return colpi;
	}

	public void aggiungiColpo(Colpo c) {
		this.colpi[ic] = c;
		this.ic++;
	}

	public void prendiDanno(int danno) {
        super.subisciDanno(danno);
        System.out.println(getNome() + " ha subito " + danno + " danni!");
        if (!isVivo()) {
            System.out.println(getNome() + "sei morto!");
        }
    }

    public void guarisci(int quantita) {
        super.cura(quantita);
        System.out.println(getNome() + " ti sei curato di " + quantita + " punti salute!");
    }
}
