import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;


public class VirtualPetTEST {


//	@Test
//	public void shouldAddNameAndDescription() {
//		VirtualPet underTest = new VirtualPet("name", "description");
//		assertEquals(underTest);
//	}

	@Test
	public void shouldReturnPetName() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String check = underTest.getPetName();
		assertEquals("name", check);
	}

	@Test
	public void shouldReturnPetDescription() {
		VirtualPet underTest = new VirtualPet("name", "description");
		String check = underTest.getDescription();
		assertEquals("description", check);
	}
	@Test
	public void shouldReturnHunger() {
		VirtualPet underTest = new VirtualPet("name", "description", 30,30, 30);
		int check = underTest.getHunger();
		assertEquals(30, check);
	}

	@Test
	public void shouldReturnThirst() {
		VirtualPet underTest = new VirtualPet("name", "description", 30, 30, 30);
		int check = underTest.getThirst();
		assertEquals(30, check);
	}
	@Test
	public void shouldPlayWithPet() {
		VirtualPet underTest = new VirtualPet("name", "description", 30, 30, 30);
		underTest.petPlaying();
		int check = underTest.getBoredom();
		assertEquals(41, check);
	}

	@Test
	public void shouldReturnTick() {
		VirtualPet underTest = new VirtualPet("name", "description", 30, 30, 30);
		underTest.singleTick();
}
}