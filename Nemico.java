package samara;

public class Nemico extends Personaggio {
    private int danno;

    public Nemico(String nome, int saluteMax, int danno) {
        super(nome, saluteMax);
        this.danno = danno;
    }

    public int getDanno() {
        return danno;
    }

    public void prendiDanno(int danno) {
        super.subisciDanno(danno);
        System.out.println(getNome() + " ha subito " + danno + " danni!");
        if (!isVivo()) {
            System.out.println(getNome() + " è morto!");
        }
    }
}