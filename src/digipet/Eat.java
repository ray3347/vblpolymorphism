package digipet;

public class Eat extends Pets {
	public Eat(String name, int hap, int hp, int clean) {
		super(name,hap,hp,clean);
	}
	
	public int setHappiness() {
		return getHappiness()-1;
	}
	
	public int setHealth() {
		return getHealth()+3;
	}
	
	public int setCleaness() {
		return getCleaness()-1;
	}
}
