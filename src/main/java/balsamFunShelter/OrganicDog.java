package balsamFunShelter;

public class OrganicDog extends VirtualPet implements OrganicPet {

	private int cageWasteAmount;

	public OrganicDog(String name, String description) {
		super(name, description);
		this.cageWasteAmount = 5;
	}

	public int getCageWasteAmount() {
		return cageWasteAmount;
	}

	public void cleanCage() {
		cageWasteAmount = 0;

	}

	public void walk() {
		cageWasteAmount = -5;

	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public int tick() {
		return 0;

	}

	@Override
	public void water() {
		// TODO Auto-generated method stub

	}

	@Override
	public void feed() {
		// TODO Auto-generated method stub

	}

}
