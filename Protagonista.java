package samara;

public class Protagonista extends Personaggio {
    private Object[] inventario;

    public Protagonista(String nome, int saluteMax) {
        super(nome, saluteMax);
        inventario = new Object[10]; // Inizializza l'inventario con 10 slot
    }

    public Object[] getInventario() {
        return inventario;
    }

    public void prendiDanno(int danno) {
        super.subisciDanno(danno);
        System.out.println(getNome() + " ha subito " + danno + " danni!");
        if (!isVivo()) {
            System.out.println(getNome() + " è morto!");
        }
    }

    public void guarisci(int quantita) {
        super.cura(quantita);
        System.out.println(getNome() + " si è curato di " + quantita + " punti salute!");
    }
}