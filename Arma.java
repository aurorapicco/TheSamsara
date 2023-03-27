package TheSamsara;

public class Arma {
	protected int danno;
	protected boolean equipaggiata;
	public Arma (int danno, boolean equipaggiata) {
		this.danno = danno;
		this.equipaggiata = equipaggiata;
	}
	protected int getDanno() {
		return danno;
	}
	protected boolean estEquipaggiata() {
		return equipaggiata;
	}
	
}

