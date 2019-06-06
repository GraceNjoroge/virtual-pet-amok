package balsamFunShelter;

import java.util.Random;

public class VirtualPet {

	private Random generator = new Random();

	protected String name;
	protected int hunger;
	protected int thirst;
	protected int boredom;
	private int number;
	private int sleep;
	public String description;
	public int clean;
	public int play;
	public int health;
	public int happiness;
	public int walk;
	public int oilLevel;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.hunger = 5;
		this.thirst = 10;
		this.boredom = 35;
		this.description = description;
		this.happiness = 10;
		this.health = 5;
		this.clean = 5;
		this.play = 10;
		this.walk = 5;

	}

	// getters
	public String getPetName() {

		return name;
	}

	public int getHunger() {

		return hunger;
	}

	public int getThirst() {

		return thirst;
	}

	public int getBoredom() {

		return boredom;
	}

	public int getNumber() {

		return number;
	}

	public String getPetDescription() {

		return description;
	}

	public int getPetHealth() {
		return this.health;
	}

	public int getHappiness() {
		return happiness;
	}

	public int getPetWalk() {
		return 0;
	}

	public int getCleanLevel() {
		return 0;
	}

	public int getOilLevel() {
		return 10;
	}

	public int feed(int quantity) {
		return quantity;
	}

//setters
	public void setPetName(String petName) {
		this.name = petName;

	}

	public boolean isHungry() {
		if (hunger > 5) {
			return true;
		}
		return false;
	}

	public boolean isThirsty() {
		if (thirst > 13) {
			return true;
		}
		return false;
	}

	public void water(int volume) {
		this.thirst -= volume;
	}

	public boolean isBored() {
		if (boredom > 12) {
			return true;
		}
		return false;
	}

	public void play(int play) {
		this.boredom -= play;
	}

	public void play() {
		boredom -= 10;
		setHappiness(getHappiness() + 5);
	}

	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}

	public void setHealth(int i) {
		this.health = 30;

	}

	public void setBoredom(int i) {
		this.boredom = 25;

	}

	public void clean(int level) {
		if (clean > level) {
		} else {
			System.out.println("My cage needs cleaned");
		}
	}

	public void sleep(int amount) {
		if (sleep > amount) {
		} else {
			hunger = amount;
		}
		System.out.println("I need to sleep");
	}

	public boolean isTired() {
		if (sleep > 50) {
			return true;
		}
		return false;
	}

// tick generator
	public int tick(int selection) {
		hunger += (5 + generateRandom());
		thirst -= (10 + generateRandom());
		boredom -= (10 + generateRandom());
		return 0;
	}

	protected int generateRandom() {
		return generator.nextInt(10);
	}

	// tick reset
	public void reset() {
		hunger = 70;
		thirst = 65;
		boredom = 70;

	}

	boolean petIsAlive() {

		if (hunger < 100 && thirst < 100 && boredom < 100)
			;
		{
			return true;
		}

	}

}

