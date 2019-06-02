package balsamFunShelter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("Joey", 83, 34, 23, " ");
		String petName = underTest.getPetName();
		assertEquals("Joey", petName);
	}

	@Test
	public void shouldReturnPetType() {
		VirtualPet underTest = new VirtualPet("Joey", 83, 34, 23, " ");
		String petType = underTest.getPetType();
		assertEquals(" ", petType);
	}

	@Test
	public void shouldReturnPetDescription() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "Looks like he's seen better days");
		String petDescription = underTest.getPetDescription();
		assertEquals("Looks like he's seen better days", petDescription);
	}

	@Test
	public void shouldReturnPetHungerLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int hunger = underTest.getHunger();
		assertEquals(83, hunger);
	}

	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int feed = underTest.feed(10);
		assertEquals(10, feed);
	}

	@Test
	public void shouldReturnPetThirstLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, " ");
		int thirst = underTest.getThirst();
		assertEquals(34, thirst);
	}

	@Test
	public void shouldwaterPet() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int water = underTest.feed(10);
		assertEquals(10, water);
	}

	@Test
	public void shouldReturnPetBoredomLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int boredom = underTest.getBoredom();
		assertEquals(23, boredom);
	}

	@Test
	public void shouldPlayWithPet() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int needsPlay = underTest.play = 5;
		assertEquals(5, needsPlay);
	}

	@Test
	public void shouldWalkPet() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int petwalk = underTest.getPetWalk();
		assertEquals(10, petwalk);
	}

	@Test
	public void shouldCleanPetCageForOrganicAnimals() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int isClean = underTest.clean = 5;
		assertEquals(5, isClean);
	}
	@Test
	public void shouldReturnCageCleanlinessLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int isClean = underTest.getCleanLevel();
		assertEquals(83, isClean);
	}
	@Test
	public void shouldReturnPetHealth() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int petHealth = underTest.getPetHealth();
		assertEquals(10, petHealth);

	}

}
