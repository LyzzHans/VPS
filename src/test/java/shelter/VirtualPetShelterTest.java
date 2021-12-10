package shelter;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {


    VirtualPetShelter underTest = new VirtualPetShelter();
    Cat cat = new Cat("name", "tagNumber", "species", "type", "description");
    Dog dog = new Dog("name", "tagNumber", "species", "type", "description");
    RobotCat robotCat= new RobotCat("name", "tagNumber", "species", "type", "description");
    RobotDog robotDog= new RobotDog("name", "tagNumber", "species", "type", "description");



    @Test
    public void shouldBeAbleToAdmitACat() {
        underTest.add(cat);
        VirtualPet retrievedPet = underTest.findPet("1");
        assertEquals(retrievedPet, null);
    }

    @Test
    public void shouldBeAbleToAdmitACatAndADog() {
        underTest.add(cat);
        underTest.add(dog);
        VirtualPet foundCat = underTest.findPet("1");
        VirtualPet foundDog = underTest.findPet("2");
        assertEquals("cat name", foundCat.getPetName());
        assertEquals("dog name", foundDog.getPetName());
    }
    @Test
    public void shouldBeAbleToAdmitACollectionOfPets() {
        underTest.add(cat);
        underTest.add(dog);
        underTest.add(robotCat);
        underTest.add(robotDog);
        Collection<VirtualPet> admittedPets = underTest.getAllPets();
        assertThat(admittedPets, containsInAnyOrder(cat, robotCat, robotCat, dog));
    }
    @Test
    void shouldDisplayAllPets(){
        underTest.add(cat);
        underTest.add(dog);
        underTest.add(robotCat);
        underTest.add(robotDog);
        Collection<VirtualPet> virtualPets = underTest.getVirtualPets();
        assertThat(virtualPets, containsInAnyOrder(dog, cat));

    }

 @Test
    public void shouldBeAbleToSendHomelessPetForAdoption() {
      underTest.remove(cat.getTagNumber());
      underTest.remove(dog.getTagNumber());
        VirtualPet retrievedPet = underTest.findPet("1");
       assertEquals(retrievedPet, null);
 }
//    @Test
//    public void feedVirtualPetShouldDecreaseHungerBy20() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "dazed and confused");
//        underTest.feed();
//        int actualHunger = underTest.getPetHunger();
//        assertEquals(0, actualHunger);
//    }
//    @Test
//    public void feedAllPetsShouldFeedAllPetsInShelter() {
//        VirtualPet pet1 = new VirtualPet("1", "Lauren", "Llama", "dazed and confused");
//        VirtualPet pet2 = new VirtualPet("Karen", "222", "Chicken", "Wants to Speak to the Manager");
//        underTest.add(pet1);
//        underTest.add(pet2);
//        underTest.feedAllPets();
//       int result = pet1.getPetHunger() + pet2.getPetHunger();
//        assertEquals(0, result);
//
//    }
//    @Test
//    public void waterAllPetsShouldFeedAllPetsInShelter() {
//        VirtualPet pet1 = new VirtualPet("1", "Lauren", "Llama", "dazed and confused");
//        VirtualPet pet2 = new VirtualPet("Karen", "222", "Chicken", "Wants to Speak to the Manager");
//        underTest.add(pet1);
//        underTest.add(pet2);
//        underTest.waterAllPets();
//        int result = pet1.getPetThirst() + pet2.getPetThirst();
//        assertEquals(0, result);
//
//    }
//
//    @Test
//    public void waterVirtualPetShouldDecreaseThirstBy20() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "dazed and confused");
//        underTest.water();
//        int actualThirst = underTest.getPetThirst();
//        assertEquals(0, actualThirst);
//    }
//
//    @Test
//    public void playShouldIncreaseHungerBy10() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "Dazed and Confused");
//        underTest.play();
//        int actualPetHunger = underTest.getPetHunger();
//        assertEquals(40, actualPetHunger);
//    }
//
//    @Test
//    public void playShouldIncreaseHealthBy20() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "Dazed and Confused");
//        underTest.play();
//        int actualPetHealth = underTest.getPetHealth();
//        assertEquals(120, actualPetHealth);
//    }
//    @Test
//    public void playWithAllPetsShouldPlayWithAllPetsInShelter() {
//        VirtualPet pet1 = new VirtualPet("1", "Lauren", "Llama", "dazed and confused");
//        VirtualPet pet2 = new VirtualPet("Karen", "222", "Chicken", "Wants to Speak to the Manager");
//        underTest.add(pet1);
//        underTest.add(pet2);
//        underTest.playWithAllPets();
//        int result = pet1.getPetBoredom() + pet2.getPetBoredom();
//        assertEquals(20, result);
//    }
//
//    @Test
//    public void playShouldDecreaseBoredomBy20() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "Dazed and Confused");
//        underTest.play();
//        int actualPetBoredom = underTest.getPetBoredom();
//        assertEquals(10, actualPetBoredom);
//    }
//
//    @Test
//    public void cleanCagesShouldIncreaseHygieneBy20() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "Dazed and Confused");
//        underTest.cleanCages();
//        int actualPetHygiene = underTest.getPetHygiene();
//        assertEquals(20, actualPetHygiene);
//    }
//
//    @Test
//    public void cleanCagesShouldIncreaseHealthBy20() {
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "Dazed and Confused");
//        underTest.cleanCages();
//        int actualPetHealth = underTest.getPetHealth();
//        assertEquals(120, actualPetHealth);
//    }
//    @Test
//    public void seeVetShouldIncreaseHealthBy20(){
//        VirtualPet underTest = new VirtualPet("1", "Lauren", "Llama", "Dazed and Confused");
//        underTest.seeVet();
//        int actualPetHealth = underTest.getPetHealth();
//        assertEquals(120, actualPetHealth);
//
//    }


}