package balsamFunShelter;

public class RobotDog extends VirtualPet implements RoboticPet {

	private int oilLevel;

	public RobotDog(String name, String description) {
		super(name, description);
		this.oilLevel = 25;

	}

	public int getOilLevel() {
		return oilLevel;
	}

	public void dogOil() {
		return;

	}

	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void OilRobotPet() {
		// TODO Auto-generated method stub

	}

}
