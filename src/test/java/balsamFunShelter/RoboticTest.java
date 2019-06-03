package balsamFunShelter;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class RoboticTest {

	@Test
	public void assertThatRobotDogIsAVirtualPet() {
		RobotDog underTest = new RobotDog(null, null);
		assertNotNull(underTest);
}

	@Test
	public void robotDogShouldHaveOilLevel() {
		RobotDog underTest = new RobotDog("", "");
		int result = underTest.getOilLevel();
		assertEquals(70, result);
	}

	@Test 
	public void shouldDecreaseOilLevel () {
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
		assertEquals(check, 5);
	}
}