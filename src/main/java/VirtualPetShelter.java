import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<>();

	public Collection<VirtualPet> getpets() {
		return pets.values();
	}

	public VirtualPet getAPet(String petName) {
		return pets.get(petName);
	}

	public void addPet(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
	}

	public void adoptPet(String petName) {
		pets.remove(petName);
	}

	public void feedAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.petFeeding();
		}
	}

	public void waterAllPets() {
		for (VirtualPet pet : pets.values()) {
			pet.petWatering();
		}
	}

	public void playWithAPet(String petName) {
		getAPet(petName).petPlaying();
	}

	public void displayStatus() {
		for (VirtualPet pet : pets.values()) {
			pet.getStatus();
		}
	}

	public void singleTick() {
		for (VirtualPet currentPet : pets.values()) {
			currentPet.singleTick();
		}
	}

}
