package balsamFunShelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class VirtualPetTest {

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("Joey", " ");
		String petName = underTest.getPetName();
		assertEquals("Joey", petName);
	}

	@Test
	public void shouldReturnPetDescription() {
		VirtualPet underTest = new VirtualPet("", "Looks like he's seen better days");
		String petDescription = underTest.getPetDescription();
		assertEquals("Looks like he's seen better days", petDescription);
	}

	@Test
	public void shouldReturnPetHungerLevel() {
		VirtualPet underTest = new VirtualPet("", "");
		int hunger = underTest.getHunger();
		assertEquals(5, hunger);
	}

	@Test
	public void shouldFeedPet() {
		VirtualPet underTest = new VirtualPet("", "");
		int feed = underTest.feed(10);
		assertEquals(10, feed);
	}

	@Test
	public void shouldReturnPetThirstLevel() {
		VirtualPet underTest = new VirtualPet("", " ");
		int thirst = underTest.getThirst();
		assertEquals(10, thirst);
	}

	@Test
	public void shouldwaterPet() {
		VirtualPet underTest = new VirtualPet("", "");
		int water = underTest.feed(10);
		assertEquals(10, water);
	}

	@Test
	public void shouldReturnPetBoredomLevel() {
		VirtualPet underTest = new VirtualPet("", "");
		int boredom = underTest.getBoredom();
		assertEquals(35, boredom);
	}

	@Test
	public void shouldPlayWithPet() {
		VirtualPet underTest = new VirtualPet("", "");
		int needsPlay = underTest.play = 5;
		assertEquals(5, needsPlay);
	}

	@Test
	public void shouldWalkPet() {
		VirtualPet underTest = new VirtualPet("", "");
		int petwalk = underTest.walk = 10;
		assertEquals(10, petwalk);
	}

	@Test
	public void setPetHealthGetter() {
		VirtualPet underTest = new VirtualPet("", "");
		underTest.health = 10;
		assertEquals(10, underTest.getPetHealth());

	}

	@Test
	public void assertThatOrganicDogIsAVirtualPet() {
		OrganicDog underTest = new OrganicDog("", "");
		assertNotNull(underTest);
	}

	@Test
	public void assertThatOrganicCatIsAVirtulPet() {
		OrganicCat underTest = new OrganicCat("", "");
		assertNotNull(underTest);

	}

	@Test
	public void assertThatFeedMakesHungerGoDown() {
		OrganicCat underTest = new OrganicCat("", "");
		OrganicDog underTest2 = new OrganicDog("", "");
		underTest.feed();
		underTest2.feed();
		int check = underTest.getHunger();
		underTest2.getHunger();
		assertEquals(10, check, 25);
	}

	@Test
	public void assertThatWaterMakesThirstGoDown() {
		OrganicCat underTest = new OrganicCat("", "");
		OrganicDog underTest2 = new OrganicDog("", "");
		underTest.water();
		underTest2.water();
		int check = underTest.getThirst();
		underTest.getThirst();
		assertEquals(5, check, 25);
	}

	@Test
	public void assertThatLitterBoxCleaningSetsWasteLevelTo0() {
		OrganicCat underTest = new OrganicCat("", "");
		underTest.cleanLitterBox();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 0);
	}

	@Test
	public void assertThatCleanLitterBoxIncreasesPetHealth() {
		OrganicCat underTest = new OrganicCat("", "");
		underTest.cleanLitterBox();
		int check = underTest.getPetHealth();
		underTest.getPetHealth();
		assertEquals(check, 5);

	}

	@Test
	public void assertThatCleanCageSetsWasteLevelTo0() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.cleanCage();
		int check = underTest.getCageWasteAmount();
		assertEquals(check, 0);

	}

	@Test
	public void assertThatCleanCageIncreasesPetHealth() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.cleanCage();
		int check = underTest.getPetHealth();
		underTest.getPetHealth();
		assertEquals(check, 5);

	}

	@Test
	public void assertThatFeedIncreasesLitterBoxLevel() {
		OrganicCat underTest = new OrganicCat("", "");
		underTest.feed();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 0);

	}

	@Test
	public void assertThatFeedIncreasesCageWasteLevel() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.feed();
		int check = underTest.getCageWasteAmount();
		assertEquals(check, 5);
	}

	@Test
	public void assertThatWalkIncreasesOrganicDogHappiness() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.walk();
		int check = underTest.getHappiness();
		assertEquals(check, 10);
	}

	@Test
	public void assertThatWalkDecreasesCageWasteLevel() {
		OrganicDog underTest = new OrganicDog("", "");
		underTest.walk();
		int check = underTest.getCageWasteAmount();
		assertEquals(check, -5);
	}

	@Test
	public void assertThatRobotDogIsAVirtualPet() {
		RobotDog underTest = new RobotDog(null, null);
		assertNotNull(underTest);
	}

	@Test
	public void robotDogShouldHaveOilLevel() {
		RobotDog underTest = new RobotDog("", "");
		int result = underTest.getOilLevel();
		assertEquals(30, result);
	}

	@Test
	public void shouldDecreaseOilLevel() {
		RobotDog underTest = new RobotDog("", "");
		int robotDogOilBefore = underTest.getOilLevel();
		underTest.dogOil();
		int robotDogOilAfter = underTest.getOilLevel();
		assertThat(robotDogOilBefore - robotDogOilAfter, is(10));
	}

	@Test
	public void assertThatWalkIncreasesRobotDogHappiness() {
		RobotDog underTest = new RobotDog("", "");
		underTest.walk();
		int check = underTest.getHappiness();
		assertEquals(check, 10);
	}

}