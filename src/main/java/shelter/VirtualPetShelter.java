package shelter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class VirtualPetShelter {

    Map<String, VirtualPet> petList = new HashMap<>();
    private Object tagNumber;
    private VirtualPetShelter pets;


    public void add(VirtualPet petToAdd) {
        petList.put(petToAdd.getTagNumber(), petToAdd);

    }

    public VirtualPet findPet(String tagNumber) {
        return petList.get(tagNumber);
    }

    protected Collection<VirtualPet> getAllPets() {
        return petList.values();
    }

    public Collection<VirtualPet> getVirtualPets() {
        Collection<VirtualPet> robotPets = new ArrayList<>();
        for (VirtualPet pet : petList.values()) {
            if (pet instanceof RobotPet) {
                robotPets.add(pet);
            }
        }
        return robotPets;
    }

    public char[] showAllPets() {
        Collection<VirtualPet> virtualPets = new ArrayList<>();
        for (VirtualPet pet : petList.values()) {
            System.out.println(pet.getName() + " " + pet.getTagNumber());
        }

/*


    public void showAllPetsInShelter() {
        for (VirtualPet pet : pets.values())
            System.out.println("Tag Number: " + pet.getTagNumber() + " Name: " + pet.getPetName() + " Species: " + pet.getPetSpecies() + " Description: " + pet.getPetDescription());
    }

    public void feedAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.feed();

        }
    }

    public void waterAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.water();
        }
    }

    public void playWithAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.play();
        }
    }

    public void cleanCages() {
        for (VirtualPet pet : pets.values()) {
            pet.cleanCages();
        }
    }
    public void tickAllPets() {
        for (VirtualPet pet : pets.values()) {
            pet.gameTick();
*/
        return null;
    }

    public void remove(VirtualPet pet) {
        pets.remove(petList.getTagNumber(), pet);
    }
        }
