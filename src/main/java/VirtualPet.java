
public class VirtualPet {

	private String petName;
	private String description;
	static int hunger;
	static int thirst;
	int boredom;
	static int tired;

	private int amount = 5;

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		VirtualPet.hunger = hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public void setThirst(int thirst) {
		VirtualPet.thirst = thirst;
	}

	public void singleTick() {
		hunger--;
		thirst--;
		boredom--;
		tired--;

	}

	public int getBoredom() {
		return boredom;

	}

	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}

	public int petFeeding() {
		hunger = hunger + amount;
		thirst = thirst - 1;
		return hunger;
	}

	public int petSleeping() {
		tired = tired + amount;
		return tired;
	}

	public int petWatering() {
		thirst = thirst + amount;
		return thirst;
	}

	public int petPlaying() {
		boredom += 11;
		return boredom;
	}

	public VirtualPet(String petName, String description, int hunger, int thirst, int boredom) {
		this.petName = petName;
		this.description = description;
		this.boredom = boredom;
		VirtualPet.hunger = hunger;
		VirtualPet.thirst = thirst;
	}

	public VirtualPet(String userActionPet, String userDescription) {
		userActionPet = petName;
		userDescription = description;

	}

	public void getStatus() {
		System.out.println(petName + "\t|" + hunger + "\t|" + thirst + "\t|" + boredom);
	}

}
