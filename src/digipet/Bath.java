package digipet;

public class Bath extends Pets {
	public Bath(String name, int hap, int hp, int clean) {
		super(name,hap,hp,clean);
	}
	
	public int setHappiness() {
		return getHappiness()-1;
	}
	
	public int setHealth() {
		return getHealth()-1;
	}
	
	public int setCleaness() {
		return getCleaness()+3;
	}
}
