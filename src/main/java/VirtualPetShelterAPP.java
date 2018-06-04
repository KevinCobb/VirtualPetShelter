import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class VirtualPetShelterAPP {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter Shelter = new VirtualPetShelter();

		Boolean continueWithApp = true;

		VirtualPet Binky = new VirtualPet("Binky", "Black&White cat", 30, 30, 30);
		Shelter.addPet(Binky);
		VirtualPet Alfred = new VirtualPet("Alfred", "Tan dog", 30, 30, 30);
		Shelter.addPet(Alfred);
		VirtualPet Frannie = new VirtualPet("Frannie", "orange cat", 30, 30, 30);
		Shelter.addPet(Frannie);
		VirtualPet Fido = new VirtualPet("Fido", "Grey spotted dog", 30, 30, 30);
		Shelter.addPet(Fido);

		System.out.println("\n Welcome to the WCCI pet shelter and adoption center\n");
		System.out.println("Please enter your name");
		String userName = input.nextLine();
		System.out.println("\n Welcome " + userName + "!\n");

		System.out.println("Here is the list of pets we have and each of their status':\n");

		System.out.println("Name\t|" + "Hunger\t|" + "Thirst\t|" + "Boredom");
		System.out.println("---------------------------------------------------");

		for (VirtualPet displayStatus : Shelter.getpets()) {
			while (continueWithApp = true) {
				Shelter.displayStatus();

				System.out.println("\n What would you like to do next?");
				System.out.println("1. Feed all the pets");
				System.out.println("2. Water all the pets");
				System.out.println("3. Play with an individual pet");
				System.out.println("4. Adopt one of our pets");
				System.out.println("5. Admit a pet");
				System.out.println("6. Quit");
				String userSelection = input.nextLine();

				if (userSelection.equals("1")) {
					System.out.println("\n Feeding.... ");
					Shelter.feedAllPets();
					System.out.println("\n Ok feeding all done. Thanks! \n");

				} else if (userSelection.equals("2")) {
					System.out.println("\n Watering....");
					Shelter.waterAllPets();
					System.out.println("\n Ok all pets have fresh water. Thanks! \n");

				} else if (userSelection.equals("3")) {
					System.out.println("please type name pet");
					String userAction = input.nextLine();

					// for (Map.Entry<String, String> entry : pets.entrySet()) {
					// System.out.println("The pets's name is " + entry.getKey());
					// System.out.println("The pet's description is " + entry.getValue());
					// }
					Shelter.playWithAPet(userAction);
					System.out.println("You played with " + userAction + " who is now a happy animal! \n");

				} else if (userSelection.equals("4")) {
					System.out.println("\nPlease type the name of the pet you would like to adopt \n");
					System.out.println("Name\t|" + "Hunger\t|" + "Thirst\t|" + "Boredom");
					System.out.println("---------------------------------------------------");
					Shelter.displayStatus();
					String pickPetAdopt = input.nextLine();
					Shelter.adoptPet(pickPetAdopt);
					System.out.println("\nThank you for adopting " + pickPetAdopt + "!\n");
					System.out.println("\n-----------------------------------------");
					System.out.println("Here is the list of our current inventory of pets \n");

				} else if (userSelection.equals("5")) {
					System.out.println("please type name of pet.");
					String userActionPet = input.nextLine();
					System.out.println("please describe this pet.");
					String userDescription = input.nextLine();
					VirtualPet newPet = new VirtualPet(userActionPet, userDescription, 30, 30, 30);
					Shelter.addPet(newPet);
					System.out.println("Thanks, we will take good care of " + userActionPet);
					System.out.println("\n-----------------------------------------");
					System.out.println("Here is the list of our current inventory of pets");

				} else if (userSelection.equals("6")) {
					System.out.println("Thanks for visiting the WCCI Shelter. Goodbye");
					System.exit(0);

				}
				Shelter.singleTick();
			}
			input.close();

		}
		// VirtualPet.tick();

	}
}
