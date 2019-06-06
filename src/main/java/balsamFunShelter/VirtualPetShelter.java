package balsamFunShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VirtualPetShelter {

	Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();

	private int number = 0;

	private int litterBoxLevel;

	private VirtualPet pet;

	private String isAdopted;

	public VirtualPet findPet(String petName) {
		return virtualPets.get(petName);
	}

	public Set<String> petNames() {

		return virtualPets.keySet();

	}

	public int getNumber() {
		return number;

	}

	public int getLitterBoxLevel() {
		return litterBoxLevel;
	}

	public Collection<VirtualPet> getAllPets() {
		return virtualPets.values();
	}

	public void addVirtualPet(VirtualPet pet) {
		virtualPets.put(pet.getPetName(), pet);
		number++;

	}

	public void showPetDescription(VirtualPet pets) {
		return;

	}

	public String adoptVirtualPet(VirtualPet pet1) {
		virtualPets.remove(pet1.getPetName());
		number--;
		return isAdopted;

	}

	public boolean isAdopted() {
		return true;
	}

	public void removePet(String petForAdoption) {
		return;

	}

	public VirtualPet getPetNamed(String chosenPet) {
		return null;
	}

	public void oilAllRobotPets() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof RoboticPet) {
				((RoboticPet) pet).OilRobotPet();
			}
		}
	}

	public void cleanAllCages() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();

			}
		}
	}

	public void cleanLitterBox() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).cleanLitterBox();
			}
		}
	}

	public void feedAllOrganic() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}

		}

		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicCat) {
				setLitterBoxLevel(getLitterBoxLevel() + 2);
			}
		}
	}

	private void setLitterBoxLevel(int i) {

	}

	public void walkDogs() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}
		}
	}

	public void waterAllOrganic() {
		for (VirtualPet pet : virtualPets.values()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}

	}

	public void playWith(String petName, int value) {
		virtualPets.get(petName).play(value);
	}

	public void updateAllTick(int selection) {

		for (VirtualPet pet : virtualPets.values()) {
			pet.tick(selection);
			if (pet.getPetHealth() > 30) {
				pet.setHealth(30);
			}
			if (pet.getPetHealth() < 0) {
				pet.setHealth(0);
			}
			if (pet.getHappiness() > 45) {
				pet.setHappiness(45);
			}
			if (pet.getHappiness() < 0) {
				pet.setHappiness(0);
			}
			if (pet.getBoredom() > 25) {
				pet.setBoredom(25);
			}
			if (pet.getBoredom() < 0) {
				pet.setBoredom(0);
			}
		}
		if (litterBoxLevel < 10) {
			pet.setHappiness(40);
		}
		if (litterBoxLevel > 45) {
			pet.setHappiness(0);
			;
		}
	}

	public void updateAllTick() {
		for (VirtualPet organicCat : virtualPets.values()) {
			System.out.println("Name \t\t | Hunger \t\t | Thirst \t\t | Health  ");
			System.out.println("_______________________________________________");
			if (virtualPets instanceof OrganicCat) {
				System.out.println(organicCat.getPetName() + " \t  |" + organicCat.getHunger() + " \t  |"
						+ organicCat.getThirst() + " \t  |" + organicCat.getPetHealth() + "\t");
			}

			for (VirtualPet organicDog : virtualPets.values()) {
				System.out.println("Name \t\t | Hunger \t\t | Thirst \t\t | Health  ");
				System.out.println("_______________________________________________");
				if (virtualPets instanceof OrganicDog) {
					System.out.println(organicDog.getPetName() + " \t  |" + organicDog.getHunger() + " \t  |"
							+ organicDog.getThirst() + " \t  |" + organicDog.getPetHealth() + "\t");

				}

				for (VirtualPet robotDog : virtualPets.values()) {
					System.out.println("Name \t\t | OilLevel  ");
					System.out.println("________________________");
					if (virtualPets instanceof RobotDog) {
						System.out.println(robotDog.getPetName() + " \t  |" + robotDog.getOilLevel());
					} else
						System.out.println("Try again, that type of pet is not known");
				}
			}
		}
	}

	public boolean petsAreAlive() {
		return true;
	}
}