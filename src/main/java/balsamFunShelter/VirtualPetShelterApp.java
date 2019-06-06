package balsamFunShelter;

//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelterPets = new VirtualPetShelter();

		VirtualPet pet1 = new OrganicCat("Joey", "looks like he's seen beter days");
		VirtualPet pet2 = new OrganicCat("Johnny", "is a bit nervous");
		VirtualPet pet3 = new OrganicDog("Dee Dee", "didn't start with that many legs");
		VirtualPet pet4 = new OrganicDog("Tommy", "smells like a stargazer lilly");
		VirtualPet pet5 = new RobotDog("Bingo", "loves to write code");
		VirtualPet pet6 = new RobotDog("Rolly", "Has been around the world");

		shelterPets.addVirtualPet(pet1);
		shelterPets.addVirtualPet(pet2);
		shelterPets.addVirtualPet(pet3);
		shelterPets.addVirtualPet(pet4);
		shelterPets.addVirtualPet(pet5);
		shelterPets.addVirtualPet(pet6);

		System.out.println("Thank you for Volunteering at Balsam's funhouse Virtual Pet Shelter");

		System.out.println("This is the status of your pets:");
		System.out.println(" Name    | Description ");
		System.out.println("__________________________");

		for (VirtualPet currentPet : shelterPets.getAllPets()) {
			System.out.println(currentPet.getPetName() + "\t|" + currentPet.getPetDescription());
		}
		System.out.println("Do you want to continue?");
		String answer = input.nextLine();
		while (answer.equals("Yes")) {
		}
		System.out.println("What would you like to do next?");
		System.out.println("1. Feed the pets?");
		System.out.println("2. Water the pets?");
		System.out.println("3. Play with a pet?");
		System.out.println("4. Adopt a pet?");
		System.out.println("5. Take in a pet");
		System.out.println("6. Walk all Dogs");
		System.out.println("7. Clean Dog Cages");
		System.out.println("8. Clean the shelter Litterbox");
		System.out.println("9. Oil all robotic Pets");

		int response = input.nextInt();

		switch (response) {

		case 1:
			shelterPets.updateAllTick();
			shelterPets.feedAllOrganic();
			System.out.println("The bellies are filling ");
			break;

		case 2:
			shelterPets.updateAllTick();
			shelterPets.waterAllOrganic();
			System.out.println("No more thirst");
			break;

		case 3:
			shelterPets.updateAllTick();
			System.out.println("Okay, so you'd like to play with a pet. Please choose one:");
			shelterPets.petNames();
			String chosenPet = input.next();
			shelterPets.getPetNamed(chosenPet);
			System.out.println("you play with " + chosenPet);
			break;

		case 4:
			shelterPets.updateAllTick();
			shelterPets.petNames();
			System.out.println("Which pet would you like to adopt?");
			String petForAdoption = input.next();
			shelterPets.removePet(petForAdoption);
			System.out.println("Hope you enjoy your new pet!");
			break;

		case 5:
			shelterPets.updateAllTick();
			System.out.println("Who is this new pet?");
			String homelessPetName = input.next();
			input.nextLine();
			VirtualPet homelessPet = new VirtualPet(homelessPetName, "");
			shelterPets.addVirtualPet(homelessPet);
			System.out.println("Welcome to Balsam Fun House" + homelessPetName);
			input.nextLine();
			break;

		case 6:
			shelterPets.updateAllTick();
			shelterPets.walkDogs();
			System.out.println("Thanks for taking the dogs for a walk.");
			break;
		case 7:
			shelterPets.updateAllTick();
			shelterPets.cleanAllCages();
			System.out.println("The dog cages are spackling clean. Thanks!");
			break;
		case 8:
			shelterPets.updateAllTick();
			shelterPets.cleanLitterBox();
			System.out.println("Great job! The LitterBox are clean");
			break;
		case 9:
			shelterPets.updateAllTick();
			shelterPets.oilAllRobotPets();
			System.out.println("The robot pets are now oiled! Thanks");
			break;

		default:
			System.out.println("Sorry to see you go. Hope you come again");
			break;
		}
		input.close();

	}
}