package digipet;

public class Play extends Pets {
	
	public Play(String name, int hap, int hp, int clean) {
		super(name,hap,hp,clean);
	}
	
	public int setHappiness() {
		return getHappiness()+3;
	}
	
	public int setHealth() {
		return getHealth()-1;
	}
	
	public int setCleaness() {
		return getCleaness()-1;
	}
}
