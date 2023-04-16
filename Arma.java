package theSamsara;

public class Arma extends Item{
	protected int danno;
	protected boolean equipaggiata;
	
	public Arma (String nome, int danno, boolean equipaggiata) {
		super(nome);
		this.danno = danno;
		this.equipaggiata = equipaggiata;
	}
	public int getDanno() {
		return danno;
	}
	public boolean estEquipaggiata() {
		return equipaggiata;
	}
	
	public void equipaggia()
	{
		this.equipaggiata = true;
	}
}
