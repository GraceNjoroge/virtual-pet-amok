package balsamFunShelter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.junit.Assert.assertEquals;

import org.junit.Test;

public abstract class OrganicTest extends VirtualPet {

	public OrganicTest(String name, int thirst, int boredom, int hunger, String description) {
		super(name, thirst, boredom, hunger, description);

	}

	@Test
	public void assertThatOrganicDogIsAVirtualPet() {
		OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
		assertNotNull(underTest);
	}

	@Test
	public void assertThatOrganicCatIsAVirtulPet() {
		OrganicCat underTest = new OrganicCat(name, thirst, boredom, hunger, description);
		assertNotNull(underTest);

	}

	@Test
	public void assertThatFeedMakesHungerGoDown() {
		OrganicCat underTest = new OrganicCat(name, thirst, boredom, hunger, description);
		OrganicDog underTest2 = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.feed();
		underTest2.feed();
		int check = underTest.getHunger();
		underTest2.getHunger();
		assertEquals(10, check, 25);
	}

	@Test
	public void assertThatWaterMakesThirstGoDown() {
		OrganicCat underTest = new OrganicCat(name, thirst, boredom, hunger, description);
		OrganicDog underTest2 = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.water();
		underTest2.water();
		int check = underTest.getThirst();
		underTest.getThirst();
		assertEquals(5, check, 25);
	}

	@Test
	public void assertThatLitterBoxCleaningSetsWasteLevelTo0() {
		OrganicCat underTest = new OrganicCat(name, thirst, boredom, hunger, description);
		underTest.cleanLitterBox();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 0);
	}

	@Test
	public void assertThatCleanLitterBoxIncreasesPetHealth() {
		OrganicCat underTest = new OrganicCat(name, thirst, boredom, hunger, description);
		underTest.cleanLitterBox();
		int check = underTest.getPetHealth();
		underTest.getPetHealth();
		assertEquals(check, 5);

	}

	@Test
	public void assertThatCleanCageSetsWasteLevelTo0() {
		OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.cleanCage();
		int check = underTest.getCageWasteAmount();
		assertEquals(check, 0);

	}

	@Test
	public void assertThatCleanCageIncreasesPetHealth() {
		OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.cleanCage();
		int check = underTest.getPetHealth();
		underTest.getPetHealth();
		assertEquals(check, 5);

	}

	@Test
	public void assertThatFeedIncreasesLitterBoxLevel() {
		OrganicCat underTest = new OrganicCat(name, thirst, boredom, hunger, description);
		underTest.feed();
		int check = underTest.getLitterBoxLevel();
		assertEquals(check, 10);

	}

	@Test
	public void assertThatFeedIncreasesCageWasteLevel() {
		OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.feed();
		int check = underTest.getCageWasteAmount();
		assertEquals(check, 10);
	}
@Test 
public void assertThatWalkIncreasesOrganicDogHappiness() {
	OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
	underTest.walk();
	int check = underTest.getHappiness();
	assertEquals(check, 5);
}
@Test 
public void assertThatWalkDecreasesCageWasteLevel() {
	OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
	underTest.walk();
	int check = underTest.getCageWasteAmount();
	assertEquals(check, -5);
}
}
