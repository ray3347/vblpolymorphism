package digipet;

public class Bath extends Pets {
	private int happiness, health, cleaness;
	public Bath(String name, int hap, int hp, int clean) {
		super(name,hap,hp,clean);
		this.happiness=hap;
		this.health=hp;
		this.cleaness=clean;
	}
	
	public int getHappiness() {
		return this.happiness-1;
	}
	
	public int getHealth() {
		return this.health-1;
	}
	
	public int getCleaness() {
		return this.cleaness+3;
	}
}
