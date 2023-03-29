package samara;

public class Personaggio {
    private int vita;
    private String nome;

    public Personaggio(String nome, int vita) {
        this.nome = nome;
        this.vita = vita;
    }

    public String getNome() {
        return nome;
    }

    public int getVita() {
        return vita;
    }

    public void setVita(int vita) {
        this.vita = vita;
    }

    public void subisciDanno(int danno) {
        vita -= danno;
        if (vita < 0) {
            vita = 0;
        }
    }

    public boolean isVivo() {
        return vita > 0;
    }
}