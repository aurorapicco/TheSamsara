package samara;

public class Colpo {
    private String nome;
    private int turno;
    private int dmgBonus;
    private char tasto;

    public Colpo(String nome, int turno, int dmgBonus, char tasto) {
        this.nome = nome;
        this.turno = turno;
        this.dmgBonus = dmgBonus;
        this.tasto = tasto;
    }

    public String getNome() {
        return nome;
    }

    public int getTurno() {
        return turno;
    }

    public int getDmgBonus() {
        return dmgBonus;
    }

    public char getTasto() {
        return tasto;
    }
}