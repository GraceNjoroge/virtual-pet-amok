package balsamFunShelter;

//import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelterPets = new VirtualPetShelter();

		VirtualPet pet1 = new VirtualPet("Joey", 83, 34, 23, "looks like he's seen beter days");
		VirtualPet pet2 = new VirtualPet("Johnny", 69, 49, 2, "is a bit nervous");
		VirtualPet pet3 = new VirtualPet("Dee Dee", 39, 18, 88, "didn't start with that many legs");
		VirtualPet pet4 = new VirtualPet("Tommy", 59, 19, 37, "smells like a stargazer lilly");

		shelterPets.addVirtualPet(pet1);
		shelterPets.addVirtualPet(pet2);
		shelterPets.addVirtualPet(pet3);
		shelterPets.addVirtualPet(pet4);
		
		do {

		System.out.println("Thank you for Volunteering at Balsam's funhouse Virtual Pet Shelter");

		System.out.println("This is the status of your pets:");
		System.out.println(" Name    | Hunger| Thirst | Bored ");
		System.out.println("________________________________________");

		
		for (VirtualPet currentPet : shelterPets.getAllPets()) {
			System.out.println(currentPet.getPetName() + "\t|" + currentPet.getHunger() + "\t|" + currentPet.getThirst() + "\t|"
					+ currentPet.getBoredom() + "\t|" + currentPet.getPetDescription());
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
		System.out.println("6. Check pet status");

		String response = input.nextLine();

		switch (response) {

		case "1":
			shelterPets.updateAllTick();
			shelterPets.feedAll();
			System.out.println("The bellies are filling ");
			break;

		case "2":
			shelterPets.updateAllTick();
			shelterPets.waterAll();
			System.out.println("No more thirst");
			break;

		case "3":
			shelterPets.updateAllTick();
			System.out.println("Okay, so you'd like to play with a pet. Please choose one:");
			shelterPets.petNames();
			String chosenPet = input.next();
			shelterPets.getPetNamed(chosenPet);
			System.out.println("you play with " + chosenPet);
			break;

		case "4":
			shelterPets.updateAllTick();
			shelterPets.petNames();
			System.out.println("Which pet would you like to adopt?");
			String petForAdoption = input.next();
			shelterPets.removePet(petForAdoption);
			System.out.println("Hope you enjoy your new pet!");
			break;

		case "5":
			shelterPets.updateAllTick();
			System.out.println("Who is this new pet?");
			String homelessPetName = input.next();
			input.nextLine();
			VirtualPet homelessPet = new VirtualPet(homelessPetName, 69, 49, 2, "");
			shelterPets.addVirtualPet(homelessPet);
			System.out.println("Welcome to Balsam Fun House" + homelessPetName);
			input.nextLine();
			break;

//		}
//		case "6":
//			shelterPets.updateAllTick();
			
		default: 
//			System.out.println("Sorry to see you go. Hope you come again");
//			break;
		}		
			input.close();
		}
		while (shelterPets.petIsAlive());
