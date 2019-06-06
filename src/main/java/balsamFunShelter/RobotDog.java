package balsamFunShelter;

public class RobotDog extends VirtualPet implements RoboticPet {

	private int oilLevel;

	public RobotDog(String name, String description) {
		super(name, description);
		this.oilLevel = 0;

	}

	public int getOilLevel() {
		return oilLevel;
	}

	public int dogOil() {
		return 30;

	}

	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void OilRobotPet() {
		// TODO Auto-generated method stub

	}

}
