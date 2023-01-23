package digipet;
import java.util.*;

public class Main {
	Scanner scan = new Scanner(System.in);
	static ArrayList<Pets> pets = new ArrayList<>();
	
	public static void main(String[] args) {
		startPet();
		new Main(1);
	}
	
	public Main(int flag) {
		do {
			int opt;
			do {
				Menu();
				opt = scan.nextInt();
				scan.nextLine();
			}while(opt<1 || opt>4);
			if(opt==1) {
				System.out.print("Enter Pet Name : ");
				String select = scan.nextLine();
				int temp=1;
				for(Pets petCount:pets) {
					if(petCount.getName().contains(select)) {
						temp=0;
						Play play = new Play(petCount.getName(),petCount.getHappiness(), petCount.getHealth(), petCount.getCleaness());
						petCount.setHappiness(play.setHappiness());
						petCount.setHealth(play.setHealth());
						petCount.setCleaness(play.setCleaness());
						System.out.println(petCount.getName() + " Has Played");
						confirm();
					}
				}
				
				if(temp==1) {
					System.out.println("Pet Name Not Found");
					confirm();
				}

			}
			else if(opt==2) {
				System.out.print("Enter Pet Name : ");
				String select = scan.nextLine();
				int temp=1;
				for(Pets petCount:pets) {
					if(petCount.getName().contains(select)) {
						temp=0;
						Eat eat = new Eat(petCount.getName(),petCount.getHappiness(), petCount.getHealth(), petCount.getCleaness());
						petCount.setHappiness(eat.setHappiness());
						petCount.setHealth(eat.setHealth());
						petCount.setCleaness(eat.setCleaness());
						System.out.println(petCount.getName() + " Has Eaten");
						confirm();
					}
				}
				
				if(temp==1) {
					System.out.println("Pet Name Not Found");
					confirm();
				}
			}
			else if(opt==3) {
				System.out.print("Enter Pet Name : ");
				String select = scan.nextLine();
				int temp=1;
				for(Pets petCount:pets) {
					if(petCount.getName().contains(select)) {
						temp=0;
						Bath bath = new Bath(petCount.getName(),petCount.getHappiness(), petCount.getHealth(), petCount.getCleaness());
						petCount.setHappiness(bath.setHappiness());
						petCount.setHealth(bath.setHealth());
						petCount.setCleaness(bath.setCleaness());
						System.out.println(petCount.getName() + " Has Bathed");
						confirm();
					}
				}
				
				if(temp==1) {
					System.out.println("Pet Name Not Found");
					confirm();
				}
			}
			else {
				System.exit(0);
			}
		}while(flag==1);
	}
	
	public void Menu() {
		showPets();
		System.out.println("Digipet");
		System.out.println("=========");
		System.out.println("1. Play");
		System.out.println("2. Eat");
		System.out.println("3. Bath");
		System.out.println("4. Exit");
		System.out.print(">>");
	}
	
	public void confirm() {
		System.out.println("Press Enter to Continue...");
		scan.nextLine();
	}
	
	public static void startPet() {
		pets.add(new Pets("Jonny",10,10,10));
		pets.add(new Pets("Bagas",10,10,10));
	}
	
	public void showPets() {
		for(Pets petCount:pets) {
			System.out.println("====================");
			System.out.println(petCount.getName());
			System.out.println("====================");
			System.out.println("Happiness : "+petCount.getHappiness());
			System.out.println("Health : "+petCount.getHealth());
			System.out.println("Cleaness : "+petCount.getCleaness());
			System.out.println("====================");
		}
	}
}
