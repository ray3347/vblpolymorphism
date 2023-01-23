package digipet;

public class Play extends Pets {
	private int happiness, health, cleaness;
	public Play(String name, int hap, int hp, int clean) {
		super(name,hap,hp,clean);
		this.happiness=hap;
		this.health=hp;
		this.cleaness=clean;
	}
	
	public int getHappiness() {
		return this.happiness+3;
	}
	
	public int getHealth() {
		return this.health-1;
	}
	
	public int getCleaness() {
		return this.cleaness-1;
	}
}
