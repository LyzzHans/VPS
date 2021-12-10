package shelter;
//
//import java.util.Map;
//import java.util.Scanner;
//
//public class VirtualPetShelterApp {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
//
//        VirtualPet pet1 = new VirtualPet("Lauren", "111", "Llama", "Dazed and Confused");
//        VirtualPet pet2 = new VirtualPet("Karen", "222", "Chicken", "Would like to speak to the manager");
//
//        myVirtualPetShelter.add(pet1);
//        myVirtualPetShelter.add(pet2);
//
//
//        String userChoice;
//
//
//        System.out.println("Welcome to Virtual Pet Shelter!");
//
//
//        System.out.println("What would you like to do?");
//        System.out.println("Press 1 to see all the pets in the shelter");
//        System.out.println("Press 2 to adopt a pet to a new home");
//        System.out.println("Press 3 to feed all pets");
//        System.out.println("Press 4 to give all pets water");
//        System.out.println("Press 5 to play with the pets");
//        System.out.println("Press 6 to call the vet");
//        System.out.println("Press 7 to intake a new pet");
//        System.out.println("Press 8 to clean the cages");
//
//        System.out.println("Press 9 to quit game");
//        userChoice = input.nextLine();
//
//        VirtualPet pet = null;
//        while (!userChoice.equals("9") || pet.petIsAlive()) {
//
//            if (userChoice.equals("1")) {
//                System.out.println("Here are the pets currently in the shelter");
//                myVirtualPetShelter.showAllPetsInShelter();
//
//            } else if (userChoice.equals("2")) {
//                myVirtualPetShelter.showAllPetsInShelter();
//                System.out.println("Select the pet to send to a new home");
//                String tagNumber = input.nextLine();
//                System.out.println("Great work! " + myVirtualPetShelter.findPet(tagNumber) + tagNumber + "has found a furr ever home!");
//                myVirtualPetShelter.remove(tagNumber);
//
//            } else if (userChoice.equals("3")) {
//                System.out.println("The pets all feel very happy for some food!");
//                myVirtualPetShelter.feedAllPets();
//            } else if (userChoice.equals("4")) {
//                System.out.println("All the pets had a nice drink of water!");
//                myVirtualPetShelter.waterAllPets();
//            } else if (userChoice.equals("5")) {
//                System.out.println("That was so much fun!");
//                myVirtualPetShelter.playWithAllPets();
//            } else if (userChoice.equals("6")) {
//                myVirtualPetShelter.showAllPetsInShelter();
//                System.out.println("Which pet needs the vet?");
//                String tagNumber = input.nextLine();
//                System.out.println("Great work! " + myVirtualPetShelter.findPet(tagNumber).getPetName() + " feels so much better!");
//                pet1.seeVet();
//            } else if (userChoice.equals("7")) {
//                System.out.println("What is the name of the new pet?");
//                String petName = input.nextLine();
//                System.out.println("Enter the tag number for: " + petName);
//                String tagNumber = input.nextLine();
//                System.out.println("Enter the species for: " + petName);
//                String petSpecies = input.nextLine();
//                System.out.println("Please enter a brief description of the pet: ");
//                String petDescription = input.nextLine();
//
//                pet = new VirtualPet(petName, tagNumber, petSpecies, petDescription);
//                myVirtualPetShelter.add(pet);
//                System.out.println("You have completed the intake process for: " + petName + " " + tagNumber + " " + petSpecies + " " + petDescription);
//                System.out.println("This is an updated list of pets in the shelter:  ");
//                myVirtualPetShelter.showAllPetsInShelter();
//            } else if (userChoice.equals("8")) {
//                System.out.println("Everyone's cages are nice and clean!");
//                myVirtualPetShelter.cleanCages();
//            } else if (userChoice.equals("9")) {
//                System.out.println("Thanks for playing Virtual Pet Shelter!");
//            }
//
//            myVirtualPetShelter.tickAllPets();
//
//
//            System.out.println("What would you like to do?");
//            System.out.println("Press 1 to see all the pets in the shelter");
//            System.out.println("Press 2 to adopt a pet to a new home");
//            System.out.println("Press 3 to feed all pets");
//            System.out.println("Press 4 to give all pets water");
//            System.out.println("Press 5 to play with the pets");
//            System.out.println("Press 6 to call the vet");
//            System.out.println("Press 7 to intake a new pet");
//            System.out.println("Press 8 to clean the cages");
//
//            System.out.println("Press 9 to quit game");
//            userChoice = input.nextLine();
//
//
//        }
//        System.out.println("Thanks for playing Virtual Pet Shelter!");
//    }
