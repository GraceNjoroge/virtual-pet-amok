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
		OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.feed();
		int check = underTest.getHunger();
		underTest.getHunger();
		assertEquals(10, check, 25);
}
	@Test
	public void assertThatWaterMakesThirstGoDown() {
		OrganicDog underTest = new OrganicDog(name, thirst, boredom, hunger, description);
		underTest.water();
		int check = underTest.getThirst();
		underTest.getThirst();
		assertEquals(5, check, 25);
}}
