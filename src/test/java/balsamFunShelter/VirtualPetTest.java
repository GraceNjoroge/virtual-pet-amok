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
	public void shouldReturnPetDescription() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "Looks like he's seen better days");
		String petDescription = underTest.getPetDescription();
		assertEquals("Looks like he's seen better days", petDescription);
	}

	@Test
	public void shouldReturnPetHungerLevel() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		int hunger = underTest.getHunger();
		assertEquals(23, hunger);
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
		assertEquals(83, thirst);
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
		assertEquals(34, boredom);
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
		int petwalk = underTest.walk =10;
		assertEquals(10, petwalk);
	}


	@Test
	public void setPetHealthGetter() {
		VirtualPet underTest = new VirtualPet("", 83, 34, 23, "");
		underTest.health = 10;
		assertEquals(10, underTest.getPetHealth());

	}

}
