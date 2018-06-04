import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class VirtualPetShelterTEST {
	
	VirtualPetShelter testAnimalshelter = new VirtualPetShelter();
	@Before
	public void setup() {
		VirtualPetShelter underTest = new VirtualPetShelter();
	}
	
		
	@Test
	public void shouldFeedAllPets() {
		VirtualPet pet = new VirtualPet("cat", "bob");
		underTest.addPet(new VirtualPet("larry", "cat2")); 
		underTest.addPet(new VirtualPet("stan", "cat3")); 
		underTest.feedAllPets();
		VirtualPet testPet = underTest.findPet("larry");
		int hunger = testPet.getHunger();
}
}

