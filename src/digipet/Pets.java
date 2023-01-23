package digipet;

public class Pets {
	private int happiness, health, cleaness;
	private String name;
	public Pets(String name, int hap, int hp, int clean) {
		this.name=name;
		this.happiness=hap;
		this.health=hp;
		this.cleaness=clean;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
	
	public int getHappiness() {
		return this.happiness;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getCleaness() {
		return this.cleaness;
	}
	
	//setter
	public void setHappiness(int happiness) {
		this.happiness=happiness;
	}
	
	public void setHealth(int health) {
		this.health=health;
	}
	
	public void setCleaness(int cleaness) {
		this.cleaness=cleaness;
	}
}
